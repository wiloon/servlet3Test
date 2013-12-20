package com.wiloon.servlet.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: wiloon
 * Date: 6/10/12
 * Time: 5:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class LogFilter implements Filter {

    FilterConfig config;


    public FilterConfig getFilterConfig() {

        return config;

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        ServletContext context = getFilterConfig().getServletContext();

        long bef = System.currentTimeMillis();

        try {
            System.out.println("filter.start...");
            chain.doFilter(request, response);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }

        long aft = System.currentTimeMillis();

        context.log("Request to " + request.getRemoteAddr() + ": " + (aft - bef));
        System.out.println("filter.end..." + request.getRemoteAddr() + " " + (aft - bef));
    }

    @Override
    public void destroy() {
    }
}
