package com.epam.telstation.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Test1 {
  public static void main(String[] args) {
    System.out.println(DAO.users.size());
  }

//    public static Connection getConnection() throws ClassNotFoundException, SQLException {
//      Class.forName("org.hsqldb.jdbc.JDBCDriver");
//      return DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/", "SA", "");
//    }
//
//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//
//
//      System.out.println(DAO.users.size());
//      try (Connection connection = getConnection();
//          PreparedStatement statement = connection.prepareStatement("INSERT INTO TEST(USERNAME) VALUE (?)")  )
//      {
//
//        statement.setString(1, "3434");
//        statement.executeUpdate();
//
//
//      }
//    }
}


