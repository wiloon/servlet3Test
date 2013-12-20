package com.wiloon.servlet.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/**
 * Created with IntelliJ IDEA.
 * User: wiloon
 * Date: 6/22/12
 * Time: 4:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class TriggerServletRequestAttributeListener implements ServletRequestAttributeListener {
    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("listener.servletRequestAttribute.add: " + srae.getName());

    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("listener.servletRequestAttribute.add: " + srae.getName());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("listener.servletRequestAttribute.add: " + srae.getName());
    }
}
