package Repository;

import Model.Offer;
import util.ConnectionUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OfferRepository implements DAO<Offer> {
    public Offer create(Offer offer){
        String sql = "insert into offers(status,price) values(?,?)";
        try(Connection connection = ConnectionUtility.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,offer.status);
            statement.setDouble(2,offer.price);

            int success = statement.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public List<Offer>getAll(){
        List<Offer> offers = new ArrayList<>();
        String sql = "select * from offers";
        try(Connection connection = ConnectionUtility.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet results = statement.executeQuery();
            while (results.next()){
                offers.add(new Offer()
                        .setStatus(results.getString("status"))
                        .setPrice(results.getDouble("price"))
                        .setId(results.getInt("id")));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return offers;
    }
    @Override
    public Offer getById(int id){
        return null;
    }
    @Override
    public Offer update(Offer offer){
        return null;
    }
    @Override
    public boolean deleteById(int id){
        return false;
    }
}
