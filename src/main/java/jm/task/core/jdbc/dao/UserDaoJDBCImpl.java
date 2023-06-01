package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl extends Util implements UserDao {
     Connection con = getConnection();
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
        Statement statement = null;
        try {
            statement = con.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS users" +
                    "(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(40), last_name VARCHAR(40), age INT)");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void dropUsersTable() {
        Statement statement = null;
        try {
            statement = con.createStatement();
            statement.executeUpdate("DROP TABLE IF EXISTS users");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveUser(String name, String lastName, byte age)  {
        PreparedStatement preparedStatement = null;
        String str  = "INSERT INTO users (name, last_name, age) VALUES (?, ?, ?)";
        try {
            preparedStatement = con.prepareStatement(str);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, lastName);
            preparedStatement.setByte(3, age);
            preparedStatement.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    public void removeUserById(long id) {
        String str = "DELETE FROM users WHERE id = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(str);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();

        String str  = "SELECT * FROM users";
        Statement statement = null;
        try {
            statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(str);
                while (resultSet.next()) {
                    User user = new User(resultSet.getString("name"),
                            resultSet.getString("last_name"), resultSet.getByte("age"));
                            user.setId(resultSet.getLong("id"));
                            users.add(user);
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public void cleanUsersTable() {
        Statement statement = null;
        try {
            statement = con.createStatement();
            statement.executeUpdate("TRUNCATE TABLE users");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
