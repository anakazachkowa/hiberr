package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DO_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DO_URL = "jdbc:mysql://localhost:3306/sqitest";
    private static final String DO_USERNAME = "anakazachkowa";
    private static final String DO_PASSWORD = "am225588TM.";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DO_DRIVER);
            connection = DriverManager.getConnection(DO_URL, DO_USERNAME, DO_PASSWORD);
            System.out.println("OK");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("NO");
        }

        return connection;
    }
}
