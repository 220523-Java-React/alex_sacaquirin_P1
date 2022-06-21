package Controller;

import Model.User;
import Service.UserService;

import io.javalin.http.Handler;

public class UserController {
    UserService userService;
    public UserController(){
        userService = new UserService();
    }
    public UserController(UserService userService){
        this.userService= userService;
    }
    public Handler getAllUsers = context -> {
        context.json(userService.getAllUsers());
    };
    public Handler createNewUser = context ->{
        User user = context.bodyAsClass(User.class);
        userService.create(user);
    };


}
