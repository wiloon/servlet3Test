package com.wiloon.servlet.listener;

/**
 * Created with IntelliJ IDEA.
 * User: wiloon
 * Date: 6/22/12
 * Time: 9:53 AM
 * To change this template use File | Settings | File Templates.
 */

import javax.servlet.ServletContextListener;
import javax.servlet.*;

public class TriggerContextListener implements ServletContextListener {
    public TriggerContextListener() {
        System.out.println("listener.context.constructor");
    }
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("listener.context.initialized");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("listener.context.Destroyed");
    }
}