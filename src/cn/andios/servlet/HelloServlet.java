package cn.andios.servlet;

import cn.andios.javabean.Andios;
import cn.andios.javabean.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Andios andios = new Andios();

        andios.setTeaXu(new Person("xiao",1,40));
        andios.setStu(new Person("bai",2,20));
        andios.setLocation("1615");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
