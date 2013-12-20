package com.wiloon.servlet.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Created with IntelliJ IDEA.
 * User: wiloon
 * Date: 6/22/12
 * Time: 5:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class SessionListener implements HttpSessionBindingListener {
    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("listener.sessionBinding.bound: " + event.getName());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("listener.sessionBinding.unbound: " + event.getName());
    }
}
