package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBController {

    public Connection getconn() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        String connectionString = "jdbc:mysql://localhost:3306/CwiczeniaJFX";
        String user = "root";
        String password = "xcv";
        return DriverManager.getConnection(connectionString, user, password);
    }
}
