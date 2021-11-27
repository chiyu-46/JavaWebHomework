package com.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

@WebListener
public final class MyRequestListener implements ServletRequestListener {
    private int count = 0;
    public void requestInitialized(ServletRequestEvent re){
        HttpServletRequest request=
                (HttpServletRequest)re.getServletRequest();
        if(request.getRequestURI().equals("/bookstore/rqlistener_test.jsp")){
            count++;
            re.getServletContext().setAttribute("count",count);
        }
    }
    public void requestDestroyed(ServletRequestEvent re){
    }

}
