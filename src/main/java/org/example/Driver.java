package org.example;

import Controller.CarController;
import io.javalin.Javalin;
import io.javalin.http.Handler;

public class Driver {
    public static void main(String[] args) {
        CarController carController = new CarController();
        Javalin app = Javalin.create().start(8080);
            app.get("/", ctx-> ctx.result("Alchemy Car Shop"));

            app.get("/cars", (Handler) carController.getAllCars);
            app.get("/cars/{id}", carController.getCarById);
            app.post("/cars", (Handler) carController.setCar);
            public class driver
            public static void main (String[]arges){

        }







    }
}

