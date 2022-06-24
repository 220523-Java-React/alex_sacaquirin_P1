package Service;

import Model.Car;
import Model.example.model.Make;
import Model.example.model.Rank;
import Repository.CarRepository;

import java.util.List;

public class CarService {
    private CarRepository carRepository;

    public CarService() {
        carRepository = new CarRepository();
    }

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car createCar(Car car) {
        return carRepository.create(car);
    }
    public List<Car> getAllCarsByMake(Make make){
        return carRepository.getAll();
    }
    public List<Car> getAllCars() {
        return carRepository.getAll();
    }
    public Car getCarById(int id){
        return carRepository.getById(id);
    }
    public boolean deleteCarById(int id){
        return carRepository.deleteById(id);
    }
    }
