package com.ServletTest.Forms;

import com.ServletTest.Classes.DataProcessor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "LoginServlet", urlPatterns = "/login_servlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try(PrintWriter writer = response.getWriter()) {

            Cookie lastUserLogin = new Cookie("LastLoginUser", new Date().toString());

            String username = request.getParameter("username");
            String password = request.getParameter("password");

            if(DataProcessor.IsSuchUserExist(username, password)){
                writer.println("Welcome!");
            }
            else{
                writer.println("Invalid username or password. Try to register<br>");
                request.getRequestDispatcher("RegisterForm.jsp").include(request, response);
            }
        }
    }
}
