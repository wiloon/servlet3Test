package com.wiloon.servlet.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Created with IntelliJ IDEA.
 * User: wiloon
 * Date: 6/22/12
 * Time: 4:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class TriggerServletRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("listener.servletRequest.destroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("listener.servletRequest.initialized");
    }
}
