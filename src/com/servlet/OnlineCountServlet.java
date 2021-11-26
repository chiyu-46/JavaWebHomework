package com.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/online")
public class OnlineCountServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        request.getSession();
        ServletContext context = getServletConfig().getServletContext();
        Integer count =(Integer)context.getAttribute("onlineCount");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Session Event Test</title></head>");
        out.println("<h3 align=center><font color=\"#ff0000\">"+
                "当前在线人数："+count+"</h3>");
        out.println("</body></html>");
        out.close();
    }
}
