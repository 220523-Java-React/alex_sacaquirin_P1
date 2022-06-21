package Repository;

import org.junit.jupiter.api.Test;

public class CarRepositoryTest {
    @Test
    public void TestGetAllCars(){
        CarRepository carRepository = new CarRepository();
        carRepository.getAll();
    }
}
