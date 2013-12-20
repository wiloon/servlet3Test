package com.wiloon.servlet30;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: wiloon
 * Date: 6/10/12
 * Time: 3:20 PM
 * To change this template use File | Settings | File Templates.
 */

@WebServlet(urlPatterns = "/servlet30", asyncSupported = false)
public class Servlet30 extends HttpServlet {
    public void init() {
        System.out.println("servlet30 init.");
    }

    public void destroy() {
        System.out.println("servlet30 destroy.");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("servlet30, doGet.");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>");
        out.println("This is my first Servlet");
        out.println("</title></head><body>");
        out.println("<h1>Hello, Servlet3.0!</h1>");
        out.println("</body></html>");

        System.out.println("context param: " + getServletContext().getInitParameter("cpn"));
       System.out.println("init param: "+ getInitParameter("ipn"));
    }
}
