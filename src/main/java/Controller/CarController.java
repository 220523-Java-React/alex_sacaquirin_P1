 package Controller;

import java.util.logging.Handler;

public class CarController {
    CarService carService = new CarService();


    public Handler getAllCars= context -> {
        List<Car> cars= carService.getallCars();
        context.json(cars);
    };

    public Handler getGetAllCarsById= context -> {
        String param = context.pathParam("id");
        int id = Integer . parseInt(param);
        context.json(carService.getCarById(id));
    };
    public Handler setCar = ctx -> {
        Car car = ctx.bodyAsClass(car.class);
        carService.createNewCar(car);
    };
}
