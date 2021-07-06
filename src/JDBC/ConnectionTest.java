package JDBC;

import org.junit.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionTest {
    @Test
    public void testConnection1() throws SQLException {
        Driver driver = new com.mysql.cj.jdbc.Driver();

        String url = "jdbc:mysql://localhost:3306/world";
        Properties info = new Properties();
        info.setProperty("user","root");
        info.setProperty("password","1519348454");

        Connection conn = driver.connect(url, info);

        System.out.println(conn);
    }
}
