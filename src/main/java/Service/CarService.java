package Service;

import Model.Car;
import Model.example.CarTypes;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars;

    public CarService() {

        cars = new ArrayList<>();
    }

    public CarService(List<Car> cars) {

        this.cars = cars;
    }

    public boolean createCar(Car car) {
        return cars.add(car);
    }

    ;

    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getAllCarsbyCartypes(CarTypes carTypes) {
        List<Car> differentCars = new ArrayList<>();
        for (Car car : differentCars) {
            if (car.getCarTypes() == carTypes) {
                differentCars.add(car);
            }
        }
        return null;
    }

    public boolean deleteById(int id) {
        for (int i = 0; i < cars.size(); i++)
            if (cars.get(i),getId() == id){
        cars.remove(i);
        return true;
    }
}
return false;
 }
}
