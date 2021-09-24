package com.heima;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Demo2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello Demo2Servlet");
        System.out.println("Hello Demo2Servlet1");
        System.out.println("Hello Demo2Servlet2");
        System.out.println("哈哈哈哈");
        System.out.println("Hello Demo2Servlet3");
        System.out.println("hello 品优购9/24更新 in idea");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
