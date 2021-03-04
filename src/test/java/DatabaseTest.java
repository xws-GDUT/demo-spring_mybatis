import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DatabaseTest {

    @Test
    public void testConnection() throws ClassNotFoundException, SQLException {
        ResourceBundle database = ResourceBundle.getBundle("database");
        String user = database.getString("user");
        String password = database.getString("password");
        String driver = database.getString("driver");
        String url = database.getString("url");

        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        if(null!=connection){
            System.out.println("连接成功");
        }
    }

}
