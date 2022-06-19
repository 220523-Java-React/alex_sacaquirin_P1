package Controller;

import Service.UserService;

import java.util.logging.Handler;

public class UserController {
    UserService userService;
    public UserController(){
        userService = new UserService();
    }
    public UserController(UserService userService){
        this.userService= userService;
    }
    public Handler getallUsers = context -> {
        context.json(userService.getAllUsers());
    };
    public Handler createNewUser = context ->{
        User user = context.bodyasClass(User.class);
        userService.createUser(user);
    };


}
