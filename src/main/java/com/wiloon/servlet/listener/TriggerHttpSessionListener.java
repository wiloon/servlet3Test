package com.wiloon.servlet.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created with IntelliJ IDEA.
 * User: wiloon
 * Date: 6/22/12
 * Time: 11:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class TriggerHttpSessionListener implements HttpSessionListener {
    public TriggerHttpSessionListener() {
        System.out.println("listener.session.constructor");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("listener.session.create");

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("listener.session.destroyed");
    }
}
