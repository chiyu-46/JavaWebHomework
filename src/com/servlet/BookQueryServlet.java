package com.servlet;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.beans.BookBean;
import com.beans.BookDAO;

@WebServlet("/bookquery.do")
public class BookQueryServlet extends HttpServlet{
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException,IOException{

        String bookid = request.getParameter("bookid");
        BookDAO bookdao = new BookDAO();
        BookBean book = bookdao.searchBook(bookid);

        if(book!=null){
            request.setAttribute("book", book);
            RequestDispatcher view = request.getRequestDispatcher("/display.jsp");
            view.forward(request, response);
        }else{
            RequestDispatcher view = request.getRequestDispatcher("/errorPage.jsp");
            view.forward(request, response);
        }
    }

}
