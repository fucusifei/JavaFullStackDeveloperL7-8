package com.yevdokymov.servlets;

import com.yevdokymov.data.User;
import com.yevdokymov.data.Users;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private final List<User> users =  new Users().getUsers();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login =  request.getParameter("userLogin");
        String password =  request.getParameter("userPassword");
        String error = "Please enter correct  login and password!";
        List<User> checkUser = users.stream().filter(x -> x.getLogin().equals(login)).toList().stream().filter(x -> x.getPassword().equals(password)).toList();
        if (checkUser.isEmpty()){
            request.setAttribute("error",error);
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }
        else {
            HttpSession newSession = request.getSession(true);
            newSession.setAttribute("id", "ok");
            request.setAttribute("userName",checkUser.get(0).getName());
            getServletContext().getRequestDispatcher("/WEB-INF/hello.jsp").forward(request, response);
        }
    }
}