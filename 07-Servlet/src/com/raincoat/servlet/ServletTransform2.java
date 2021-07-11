package com.raincoat.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletTransform2", value = "/servlettransform2")
public class ServletTransform2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("在ServletTransform2中查看请求携带的参数: " + request.getParameter("username"));

        //查看Servlet1中添加的参数
        System.out.println("Servlet1是否添加参数: " + request.getAttribute("test1"));

        //处理自己的业务
        System.out.println("ServletTransform2处理自己的业务");
    }
}
