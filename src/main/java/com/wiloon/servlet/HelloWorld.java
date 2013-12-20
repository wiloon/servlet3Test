package com.wiloon.servlet;

import com.wiloon.servlet.listener.SessionListener;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class HelloWorld extends HttpServlet {

    private static final long serialVersionUID = -9037964452251358377L;

    public HelloWorld() {
        System.out.println("servlet.helloWorld.constructor");
    }

    public void init() {
        System.out.println("servlet.helloWorld.init.");


    }

    public void destroy() {
        System.out.println("servlet.helloWorld.destroy.");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("servlet.helloWorld.doGet.start");

        //thread id
        System.out.println("threadId: " + Thread.currentThread().getName());
        //set session listener
        request.getSession().setAttribute("listener", new SessionListener());
        // get, query string
        String queryString = request.getQueryString();

        // header name
        printHeaderName(request);

        // get parameter
        System.out.println("parameter.foo= " + request.getParameter("foo"));

        // query string
        System.out.println("query string: " + queryString);

        // character encoding
        System.out.println("encoding: " + request.getCharacterEncoding());

        //context param.get
        System.out.println("context param: " + getServletContext().getInitParameter("cpn"));

        //init param
        System.out.println("init param: " + getInitParameter("ipn"));

        //set context attribute
        ServletContext context = getServletContext();
        context.setAttribute("attrName", "attrValue");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>");
        out.println("This is my first Servlet");
        out.println("</title></head><body>");
        out.println("<h1>Hello,World!, Servlet!</h1>");
        out.println("</body></html>");

        //session
        HttpSession session = request.getSession();

        //session id
        String sessionId = session.getId();
        System.out.println("session.id: " + sessionId);

        //session attribute
        System.out.println("hw.set attr session.attrName");
        session.setAttribute("session.attrName", "session.attr.value");

        //session remove attribute
        System.out.println("hw.remove session.attrName");
        session.removeAttribute("session.attrName");

        //session remove listener
        System.out.println("hw.remove listener");
        session.removeAttribute("listener");

        //servlet request attribute an
        System.out.println("hw.set servlet request attribute");

        request.setAttribute("an", "av");


        System.out.println("servlet.helloWorld.doGet.end");
    }

    private void printHeaderName(HttpServletRequest request) {
        Enumeration enumstr = request.getHeaderNames();

        while (enumstr.hasMoreElements()) {
            String name = (String) enumstr.nextElement();
            System.out.println("header: " + name + " = "
                    + request.getHeader(name));

        }

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // post, request form
        // String form = request.get;
    }
}