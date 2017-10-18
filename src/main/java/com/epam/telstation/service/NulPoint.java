package com.epam.telstation.service;

import com.epam.telstation.dao.DAO;
import com.epam.telstation.model.User;
import java.sql.SQLException;

/**
 * Created by Andrey on 17.10.2017.
 */
public class NulPoint {


  public static void nulPoint(User user){
     if (user.equals(null)){
       throw new NullPointerException();
     }
     else {
       try {
         DAO.addUser(user);
       } catch (SQLException | ClassNotFoundException e) {
         e.printStackTrace();
       }
     }

  }

}
