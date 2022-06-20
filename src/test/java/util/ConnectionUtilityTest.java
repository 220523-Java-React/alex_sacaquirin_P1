import org.jetbrains.annotations.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtilityTest {
    @Test
    public void whenGivenValidCredentialGetConnectionReturnsValidConnection() throws SQLException {
        Connection connection = ConnectionUtilityTest.getConnection();
        Assertions.assertNotNull(connection);
    }

    @Test
    public void whenLoadPropertiesIsCalledLoadsValidProperties(){
        String url ="jdbc:postgresql://localhost:5432/postgres?currentSchema=CarApi";
        String user = "postgres";
        String password ="1234";
        Properties properties = ConnectionUtilityTest.loadProperties();

        Assertions.assertEquals(url,properties.getProperty("url"));
        Assertions.assertEquals(user,properties.getProperty("user"));
        Assertions.assertEquals(password,properties.getProperty("password"));
    }
}