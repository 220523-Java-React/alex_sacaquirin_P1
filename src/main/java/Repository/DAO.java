package Repository;

import Model.Car;
import Model.Offer;
import Model.User;

import java.util.List;

public interface DAO <T>{
    T create(T t );
    List<T> getAll();

    T getById (T t);

    Car getById(int id);

    User update(User user);

    Offer update(Offer offer);

    boolean deleteById(int id);

}
