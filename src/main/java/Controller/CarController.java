 package Controller;
import Model.Car;
import Model.example.model.Make;
import Model.example.model.Rank;
import Service.CarService;
import Service.UserService;
import io.javalin.http.Handler;
import io.javalin.http.HttpCode;
import util.ConnectionUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

 public class CarController {
     CarService carService;

     public CarController() {
         CarService carService = new CarService();
         UserService userService = new UserService();

     }

     public CarController(CarService carService) {
         this.carService = carService;
     }

     public Handler show = ctx-> {
         Connection conn = ConnectionUtility.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("select * from cars ");
         List<Car> cars = new ArrayList<>();

         while (rs.next()) {
             Integer id = rs.getInt("id");
             String model = rs.getString("model");
             String make = rs.getString("make");
             Integer years = rs.getInt("years");
             Car car = new Car(id,model,make,years);
             cars.add(car);
         }
         ctx .json(cars);
         conn.close();

     };
     public Handler getAllCars = ctx -> {
         if (UserService.isCustomer || UserService.isEmployee) {
             List<Car> cars = new ArrayList<>();
             String rankParam = ctx.queryParam("car");
             if (rankParam == null) {
                 cars = carService.getAllCars();
             }
             else {
                 Make make = Make.valueOf(rankParam.toUpperCase(Locale.ROOT));
                 cars = carService.getAllCarsByMake(make);
             }
             ctx.json(cars);
         }else {ctx.result("Please sign in");}

     };
     public Handler createNewCar = context -> {
         Car car = context.bodyAsClass(Car.class);
         try {
             context.status(HttpCode.CREATED).json(carService.createCar(car));
         } catch (NullPointerException | NumberFormatException e) {
             context.status(HttpCode.BAD_REQUEST).result("could not create a car");
         }
     };

     public Handler getCarById = ctx -> {
         if (UserService.isCustomer) {
             String param = ctx.pathParam("id");
             int id = 0;
             id = Integer.parseInt(param);
             ctx.json(carService.getCarById(id));
         } else if (UserService.isEmployee) {
             ctx.result(" Customers only!");
         } else {
             ctx.result(" Log into your customer account!");
         }
     };
 }