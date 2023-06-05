package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl extends Util implements UserDao {
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() throws SQLException {
//        String sqlCommand = "CREATE TABLE IF NOT EXISTS user(Id INT PRIMARY KEY AUTO_INCREMENT, Name VARCHAR(30), LastName VARCHAR(30), Age TINYINT)";
//        try (Connection conn = getConnection()) {
//
//            Statement statement = conn.createStatement();
//            // создание таблицы
//            statement.executeUpdate(sqlCommand);
//
//            System.out.println("Database has been created!");
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            System.out.println("Connection failed...");
//
//        }


//        PreparedStatement preparedStatement = null;
//        String str = "CREATE TABLE IF NOT EXISTS users" +
//                "(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(40), last_name VARCHAR(40), age INT)";
//        try (Connection con = getConnection()) {
//            preparedStatement = con.prepareStatement(str);
//            preparedStatement.executeUpdate(str);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }

    public void dropUsersTable() throws SQLException {
//        String sqlCommand = "DROP TABLE IF EXISTS user";
//        try (Connection connection = getConnection()) {
//            Statement statement = connection.createStatement();
//            statement.executeUpdate(sqlCommand);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//
//        }
//        PreparedStatement preparedStatement = null;
//        String str = "DROP TABLE IF EXISTS users";
//        try (Connection con = getConnection()) {
//            preparedStatement = con.prepareStatement(str);
//            preparedStatement.executeUpdate(str);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
//        User user = new User(name, lastName, age);
//        String sqlCommand = "INSERT INTO user (name, lastname, age) VALUES (?, ?, ?)";
//        try (Connection connection = getConnection()) {
//            PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand);
//
//            preparedStatement.setString(1, user.getName());
//            preparedStatement.setString(2, user.getLastName());
//            preparedStatement.setByte(3,user.getAge());
//
//            preparedStatement.executeUpdate();
//            System.out.println("User с именем – " +user.getName() + " добавлен в базу данных");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//        PreparedStatement preparedStatement = null;
//        String str = "INSERT INTO users (name, last_name, age) VALUES (?, ?, ?)";
//        try (Connection con = getConnection()) {
//            preparedStatement = con.prepareStatement(str);
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//            preparedStatement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }

    public void removeUserById(long id) throws SQLException {
//        String sqlCommand = "DELETE FROM users WHERE Id=?";
//        try (Connection connection = getConnection()) {
//            PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand);
//            preparedStatement.setLong(1, id);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//        String str = "DELETE FROM users WHERE id = ?";
//        PreparedStatement preparedStatement = null;
//        try (Connection con = getConnection()) {
//            preparedStatement = con.prepareStatement(str);
//            preparedStatement.setLong(1, id);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public List<User> getAllUsers() throws SQLException {
//        List<User> userList = new ArrayList<>();
//        String sqlCommand = "SELECT id, Name, lastName, age FROM user";
//        try (Connection connection = (Connection) getConnection()) {
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(sqlCommand);
//
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong("id"));
//                user.setName(resultSet.getString("name"));
//                user.setLastName(resultSet.getString("lastName"));
//                user.setAge(resultSet.getByte("age"));
//
//                userList.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return userList;
//    }

//        List<User> users = new ArrayList<>();
//        String str = "SELECT * FROM users";
//        PreparedStatement preparedStatement = null;
//        try (Connection con = getConnection()) {
//            preparedStatement = con.prepareStatement(str);
//            ResultSet resultSet = preparedStatement.executeQuery(str);
//            while (resultSet.next()) {
//                User user = new User(resultSet.getString("name"),
//                        resultSet.getString("last_name"),
//                        resultSet.getByte("age"));
//                user.setId(resultSet.getLong("id"));
//                users.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        return null;
    }

        public void cleanUsersTable () throws SQLException {
//        String sqlCommand = "DELETE FROM user";
//        try (Connection connection = (Connection) getConnection()) {
//            Statement statement = connection.createStatement();
//            statement.executeUpdate(sqlCommand);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//
//        }


        }

//        PreparedStatement preparedStatement = null;
//        String str = "TRUNCATE TABLE users";
//        try (Connection con = getConnection()) {
//            preparedStatement = con.prepareStatement(str);
//            preparedStatement.executeUpdate(str);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }



}