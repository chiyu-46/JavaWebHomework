package com.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ConfigDemoServlet extends HttpServlet {
    String servletName = null;
    ServletConfig config = null;
    ServletContext context = null;
    String email = null;
    String telephone = null;

    public void init() {
        config = getServletConfig();
        context = this.getServletContext();
        servletName = config.getServletName();
        email = context.getInitParameter("email");
        telephone = context.getInitParameter("telephone");

        // 使用ServletContext对象将email地址和电话信息写入日志文件中。
        //context.log(email);
        //context.log(telephone);
    }

    public void service(HttpServletRequest request,
                        HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("Servlet名称："+servletName+"<br>");
        out.println("Email地址："+email+"<br>");
        out.println("电话："+telephone);
        out.println("</body></html>");
    }

}
