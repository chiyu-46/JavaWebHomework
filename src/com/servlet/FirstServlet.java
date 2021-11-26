package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    // 处理 POST 方法请求的方法
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 处理中文
        String name =new String(request.getParameter("name").getBytes("ISO8859-1"),"UTF-8");
        // 使用表单传递的参数（学号和姓名）创建一个Student对象
        Student student = new Student(request.getParameter("sno"), name);
        //存储在ServletContext对象中
        this.getServletContext().setAttribute("student", student);
        // 将请求调度到SecondServlet
        this.getServletContext().getRequestDispatcher("/com.servlet.SecondServlet").forward(request, response);
    }
}
