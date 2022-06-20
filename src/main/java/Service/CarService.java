package Service;

import Model.Car;
import Repository.CarRepostory;

import java.util.List;

public class CarService {
    CarRepostory carRepostory;

    public CarService() {
        carRepostory = new CarRepostory();
    }

    public CarService(CarRepostory carRepostory) {
        this.carRepostory = carRepostory;
    }

    public Car createCar(Car car) {
        return carRepostory.create(car);
    }
    public List<Car> getAllCars() {
        return carRepostory.getAll();
    }
    public Car getCarById(int id){
        return carRepostory.getById(id);
    }
    public boolean deleteCarById(int id){
        return carRepostory.deleteById(id);
    }
}