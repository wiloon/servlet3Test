package com.wiloon.servlet.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * Created with IntelliJ IDEA.
 * User: wiloon
 * Date: 6/22/12
 * Time: 10:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class TriggerContextAttributeListener implements ServletContextAttributeListener {
    public TriggerContextAttributeListener() {
        System.out.println("listener.contextAttribute.constructor");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent scab) {
        System.out.println("listener.contextAttribute.added, " + scab.getName());

    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scab) {
        System.out.println("listener.contextAttribute.remove, " + scab.getName());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scab) {
        System.out.println("listener.contextAttribute.replace, " + scab.getName());
    }
}
