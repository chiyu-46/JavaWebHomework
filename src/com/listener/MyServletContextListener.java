package com.listener;

import javax.servlet.*;
import java.util.Date;

public final class MyServletContextListener implements ServletContextListener, ServletContextAttributeListener {
    private ServletContext context = null;
    public void contextInitialized(ServletContextEvent sce){
        System.out.println("Application startup time:" + new Date());
    }
    public void contextDestroyed(ServletContextEvent sce){
        System.out.println("Application shutdown time:" + new Date());
    }
    public void attributeAdded(ServletContextAttributeEvent scae){
        System.out.println("Added a context attribute:"+
                scae.getName() + "=" + scae.getValue());
    }
    public void attributeRemoved(ServletContextAttributeEvent scae){
        System.out.println("Deleted a context attribute:"+
                scae.getName() + "=" + scae.getValue());
    }
    public void attributeReplaced(ServletContextAttributeEvent scae){
        System.out.println("Modified a context attribute, old value:"+
                scae.getName() + "=" + scae.getValue() + ", \nThe new value:"+
                scae.getName() + "=" + scae.getServletContext().getAttribute(scae.getName()));
    }

}
