package com.heima;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Demo1Servlet extends  HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello 品优购 master");
        System.out.println("hello 品优购 master1");
        System.out.println("hello 品优购 master2");
        System.out.println("hello 品优购 master3");
        System.out.println("hello 品优购 hot_fix");
        System.out.println("hello 品优购 hot_fix2");
        System.out.println("hello 品优购 master检出");
        System.out.println("hello 品优购9/6更新");
        System.out.println("hello 品优购9/6更新1");
        System.out.println("哈哈哈哈");
        System.out.println("hello 品优购9/14更新1");
        System.out.println("hello 品优购9/24更新 in idea");

        System.out.println("hello 品优购9/24更新 online");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doGet(req,resp);
    }
}
