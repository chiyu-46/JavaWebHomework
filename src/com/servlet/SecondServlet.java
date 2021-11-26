package com.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    // 处理 POST 方法请求的方法
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取学生变量
        ServletContext context = this.getServletContext();
        Student student = (Student) context.getAttribute("student");
        // 设置响应内容类型
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String title = "展示学生信息";
        String docType = "<!DOCTYPE html> \n";
        out.println(docType +
                "<html lang=\"zh-CN\">\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body>\n" +
                "<ul>\n" +
                "  <li><b>学号</b>："
                + student.getSno() + "</li>\n" +
                "  <li><b>姓名</b>："
                + student.getName() + "</li>\n" +
                "  <li><a href=\"http://localhost:8085/bookstore\">返回首页</a>" + "</li>\n" +
                "</ul>\n" +
                "</body></html>");
    }
}
