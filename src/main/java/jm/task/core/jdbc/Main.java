package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) throws SQLException {
        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 15);
        userService.saveUser("Петр", "Петров", (byte) 16);
        userService.saveUser("Семен", "Семонов", (byte) 17);
        userService.saveUser("Сергей", "Сергеев", (byte) 18);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}

