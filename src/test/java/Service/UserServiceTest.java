package Service;

import Model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserServiceTest {
    public void whenGivenAUserObjectCreateUserDoesNotThrowAnException(){
        UserService service = new UserService();
        User user = new User();

        Assertions.assertDoesNotThrow(() ->service.create(user));
    }
    @Test
    public void whenGivenAUserObjectCreateUserReturnsTrue(){
        UserService service = new UserService();
        User user = new User();

        Assertions.assertNotNull(service.create(user));
    }
}
