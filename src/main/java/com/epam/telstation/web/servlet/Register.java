package com.epam.telstation.web.servlet;

import com.epam.telstation.dao.DAO;
import com.epam.telstation.model.Role;
import com.epam.telstation.model.User;
import java.io.IOException;
import java.sql.SQLException;


@javax.servlet.annotation.WebServlet(name = "Register",urlPatterns = "/register")
public class Register extends javax.servlet.http.HttpServlet {



    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String number = request.getParameter("number");
        request.getRequestDispatcher("/register.jsp").forward(request,response);

    }

   protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {


       String number = request.getParameter("number");
       String name = request.getParameter("name");
       String surname = request.getParameter("surname");
       String password = request.getParameter("password");


       User user = User.builder().name(name).surname(surname).phoneNumber(number).password(password).status(Role.USER).build();

       try {
           DAO.addUser(user);
           System.out.println("user added");
           System.out.println(DAO.users.get(0).toString());
       } catch (SQLException | ClassNotFoundException e) {
           e.printStackTrace();
       }
       //NulPoint.nulPoint(user);
       request.getRequestDispatcher("/register.jsp").forward(request,response);
     // response.getOutputStream().write(user.toString().getBytes());

   }
}
