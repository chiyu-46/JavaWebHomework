package com.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public final class MySessionListener implements HttpSessionListener {
    private int count = 0;

    public void sessionCreated(HttpSessionEvent se){
        count++;
        se.getSession().getServletContext().setAttribute(
                "onlineCount", count);
    }

    public void sessionDestroyed(HttpSessionEvent se){
        count--;
        se.getSession().getServletContext().setAttribute(
                "onlineCount", count);
    }

}
