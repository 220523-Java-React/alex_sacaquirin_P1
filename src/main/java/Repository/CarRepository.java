package Repository;

import Model.Car;
import Model.Offer;
import Model.User;
import Model.example.model.Rank;
import util.ConnectionUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarRepository implements DAO<Car> {
    private final List<Car> cars;
    public CarRepository(){
        cars = new ArrayList<>();
    }
    public CarRepository(List<Car> cars){
        this.cars = cars;
    }


    @Override
    public Car create(Car car){
        String sql = "insert into cars(make, model, year, id) values(?,?,?,?)";
        try ( Connection connection = ConnectionUtility.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, car.getMake());
            statement.setString(2, car.getModel());
            statement.setInt(3,car.getYear());
            statement.setInt(4, car.getId());
            int success = statement.executeUpdate();
           if (success == 1)
            return car;

        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    @Override

    public Car getById(int id) {
        String sql = "select * from cars where car_id ="+id;

        try(Connection connection = ConnectionUtility.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet results = statement.executeQuery();

            if(results.next()) {
                Car car = new Car();
                cars.add(car.
                       setMake(results.getString("make")).
                        setModel(results.getString("model")).
                        setYear(results.getInt("year"))
                        .setId(results.getInt("car_id")));
                return car;
            }
        } catch (SQLException e){
                e.printStackTrace();
        }
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public Offer update(Offer offer) {
        return null;
    }

    @Override
    public List<Car> getAll() {
        List<Car> cars = new ArrayList<>();
        String sql = "select * from cars";

       try(Connection connection = ConnectionUtility.getConnection()){
           PreparedStatement stmt = connection.prepareStatement(sql);
           ResultSet rs = stmt.executeQuery();
           while(rs.next()) {
               Car car = new Car()
                       .setId(rs.getInt("car_id"))
                       .setMake(rs.getString("make"))
                       .setModel(rs.getString("model"))
                       .setYear(rs.getInt("year")
                       );
           }
        } catch (SQLException e){
           e.printStackTrace();
        }
       return cars;
    }

    @Override
    public Car getById(Car car) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        String sql = "delete from cars where car_id ="+id;

        try (Connection connection = ConnectionUtility.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet results = statement.executeQuery();
            if(results.next()){
                return true;
        }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}


