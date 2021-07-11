package com.raincoat.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletTransform1", value = "/servlettransform1")
public class ServletTransform extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println("在ServletTransform中查看参数: " + username);

        request.setAttribute("test1", "servlettransform1参数");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/servlettransform2");
        requestDispatcher.forward(request, response);
    }
}
