package Repository;

import Model.User;
import org.junit.jupiter.api.Test;

public class UserRepositoryTest {
    @Test
    public void testGetAllUsers(){
        UserRepository userRepository = new UserRepository();
         userRepository.getAll();
    }
}
