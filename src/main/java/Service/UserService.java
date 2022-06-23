package Service;

import Model.Car;
import Model.User;
import Repository.UserRepository;

import java.util.List;

public class UserService {
    UserRepository userRepository;

    public UserService(){
        userRepository = new UserRepository();
    }
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public User create(User user){
        return userRepository.create(user);
    }
    public List<User> getAllUsers(){
        return userRepository.getAll();
    }
    public Car getUserById(int id){
        return userRepository.getById(id);
    }
    public boolean deleteUserById(int id){
        return userRepository.deleteById(id);
    }
}