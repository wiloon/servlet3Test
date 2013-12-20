package com.wiloon.servlet.listener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * Created with IntelliJ IDEA.
 * User: wiloon
 * Date: 6/22/12
 * Time: 3:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class TriggerHttpSessionActivationListener implements HttpSessionActivationListener {
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("listener.session.activation.Passivate");
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("listener.session.activation.activate");
    }
}
