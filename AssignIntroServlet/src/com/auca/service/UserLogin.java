package com.auca.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserLogin extends HttpServlet {
	
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("name");
        String password = req.getParameter("password");

        
        if ("Buturo Eric".equals(username) && "1245".equals(password)) {
           
            try {
                PrintWriter out = res.getWriter();
                out.println("Hello, Your username is " + username + " and Password is " + password);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
           
            res.sendRedirect("forgot_password.html"); 
        }
    }
}