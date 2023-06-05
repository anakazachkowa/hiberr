package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

//import java.lang.module.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

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


    private static SessionFactory sessionFactory;


    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration()
                        .setProperty("hibernate.connection.driver_class", DO_DRIVER)
                        .setProperty("hibernate.connection.url", DO_URL)
                        .setProperty("hibernate.connection.username", DO_USERNAME)
                        .setProperty("hibernate.connection.password", DO_PASSWORD)
                        .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
                        .addAnnotatedClass(User.class)
                        .setProperty("hibernate.c3p0.min_size", "5")
                        .setProperty("hibernate.c3p0.max_size", "200")
                        .setProperty("hibernate.c3p0.max_statements", "200");

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }

    public static void closeSessionFactory() {
        if (!getSessionFactory().isClosed()) {
            getSessionFactory().close();
        }


    }
}

//    private static SessionFactory sessionFactory;
//    public static SessionFactory getSessionFactory() {
//        if (sessionFactory == null) {
//            try {
//                Configuration configuration = new Configuration();
//
//                // Hibernate settings equivalent to hibernate.cfg.xml's properties
//                Properties settings = new Properties();
//                settings.put(Environment.DRIVER, DO_DRIVER);
//                settings.put(Environment.URL, DO_URL);
//                settings.put(Environment.USER, DO_USERNAME);
//                settings.put(Environment.PASS, DO_PASSWORD);
//                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
//
//                settings.put(Environment.SHOW_SQL, "true");
//
//                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
//
//                settings.put(Environment.HBM2DDL_AUTO, "");
//
//                configuration.setProperties(settings);
//
//                configuration.addAnnotatedClass(User.class);
//
//                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//                        .applySettings(configuration.getProperties()).build();
//
//                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return sessionFactory;
//    }
//}

//



