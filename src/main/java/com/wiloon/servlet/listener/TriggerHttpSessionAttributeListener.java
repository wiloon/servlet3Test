package com.wiloon.servlet.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Created with IntelliJ IDEA.
 * User: wiloon
 * Date: 6/22/12
 * Time: 3:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class TriggerHttpSessionAttributeListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        System.out.println("listener.sessionAttribute.add, " + se.getName());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        System.out.println("listener.sessionAttribute.remove, " + se.getName());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        System.out.println("listener.sessionAttribute.replaced, " + se.getName());
    }
}
