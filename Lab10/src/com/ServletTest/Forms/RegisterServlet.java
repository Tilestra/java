package com.ServletTest.Forms;

import com.ServletTest.Classes.DataProcessor;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterServlet", urlPatterns = "/register_servlet")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try(PrintWriter writer = response.getWriter()) {

            String username = request.getParameter("username");
            String password = request.getParameter("password");

            if(!DataProcessor.IsSuchUserExist(username, password)){
                writer.println("Welcome!");
                DataProcessor.RegisterUser(username, password);
            }
            else{
                writer.println("Such user already exist. Try different credentials<br>");
                request.getRequestDispatcher("RegisterForm.jsp").include(request, response);
            }
        }
    }
}
