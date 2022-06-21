package Repository;

import Model.Car;
import Model.Offer;
import Model.User;
import util.ConnectionUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements DAO<User>{
    public User create (User user){
        String sql= "insert into users(firstname, lastname, username, password) values(?,?,?,?)";
        try(Connection connection = ConnectionUtility.getConnection()){
            PreparedStatement statement =connection. prepareStatement(sql);
            statement.setString(1, user.getFirstname());
            statement.setString(2, user.getLastname());
            statement.setString(3,user.getUsername());
            statement.setString(3,user.getPassword());

            int success = statement.executeUpdate();
        } catch (SQLException e) {
         e.printStackTrace();
    }
        return null;
}
@Override
    public List<User> getAll(){
        List<User> users = new ArrayList<>();
        String sql = "select * from users";

        try (Connection connection = ConnectionUtility.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet results = statement.executeQuery();

            while (results.next()){
                User user = new User();
                user.setFirstName(results.getString("first_name"));
                user.getLastName(results.getString("lastname"));
                user.setUsername(results.getString("username"));
                user.setPassword(results.getString("password"));

                users.add(user);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public User getById(User user) {
        return null;
    }

    @Override
    public Car getById(int id){
        return null;
    }
    @Override
    public User update(User user){
        return null;
    }

    @Override
    public Offer update(Offer offer) {
        return null;
    }

    @Override
    public boolean deleteById(int id ) {
        return false;
    }
}