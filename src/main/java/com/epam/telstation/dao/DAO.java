package com.epam.telstation.dao;

import com.epam.telstation.model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DAO {



  public static volatile List<User> users = new ArrayList<>();
  public static Connection getConnection() throws ClassNotFoundException, SQLException {
    Class.forName("org.hsqldb.jdbcDriver");
    return DriverManager.getConnection("C:/Users/Andrey/Desktop/hsqldb-2.4.0", "SA", "");
  }

  public static void addUser(User user) throws SQLException, ClassNotFoundException {
    users.add(user);
    System.out.println(DAO.users.size());

//    try (Connection connection = getConnection();
//        PreparedStatement statement = connection.prepareStatement("INSERT INTO USERS (username,"
//            + "surname,usnumber,password,role,isBlocked,account) VALUES (?,?,?,?,?,?,?)")) {
//
//      statement.setString(1, user.getName());
//      statement.setString(2, user.getSurname());
//      statement.setString(3, user.getPhoneNumber());
//      statement.setString(4, user.getPassword());
//      statement.setString(5, user.getStatus().toString());
//      statement.setBoolean(6, user.isBlocked());
//      statement.setDouble(7, user.getAccount());
//      statement.executeUpdate();


    }

  }



