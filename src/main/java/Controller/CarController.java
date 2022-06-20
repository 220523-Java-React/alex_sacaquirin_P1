 package Controller;

import Model.Car;
import Service.CarService;

import java.util.logging.Handler;

public class CarController {
    CarService carService;
    public CarController(){
        carService = new CarService();
    }
    public CarController(CarService carService){
        this.carService = carService;
    }
    public Handler getAllCars = context -> {
        context.json(carService.getAllCars());
    };
    public Handler createNewCar = context -> {
        Car car = context.bodyAsClass(Car.class);
        carService.createCar(car);
    };
}