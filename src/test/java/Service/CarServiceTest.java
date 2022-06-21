package Service;

import Model.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarServiceTest {
    @Test
    public void whenGivenAUserObjectCreateUserDoesNotThrowAnException(){
        CarService service = new CarService();
        Car car = new Car();
        Assertions.assertDoesNotThrow(()-> service.createCar(car));
    }
    @Test
    public void whenGivenAUserObjectCreateUserReturnsTrue(){
        CarService service = new CarService();
        Car car = new Car();
        Assertions.assertNotNull(service.createCar(car));
    }
}
