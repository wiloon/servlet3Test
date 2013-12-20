package com.wiloon.servlet.filter.modifyresponse;

/**
 * Created with IntelliJ IDEA.
 * User: wiloon
 * Date: 11/21/12
 * Time: 9:09 PM
 */

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Filter that uses a response wrapper to convert all
 * output to upper case
 */
public class UpperCaseFilter
        implements Filter {
    protected FilterConfig config;

    public void init(FilterConfig config)
            throws ServletException {
        // Save the config object
        this.config = config;
    }

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.printf("update case filter start...");
        ServletResponse newResponse = response;
        // If this is an HttpRequest, wrap the response
        // with our CharArrayWriter so that we can get
        // the contents
        if (request instanceof HttpServletRequest) {
            newResponse = new CharResponseWrapper(
                    (HttpServletResponse) response);
        }
        // Invoke the next filter/servlet in the chain
        // using (perhaps) a wrapped response
        chain.doFilter(request, newResponse);
        if (newResponse instanceof CharResponseWrapper) {
            // Get the contents of the output. A String
            // is returned only if a Writer was used,
            // indicating text output. If getOutputStream
            // was used the output will go to the "real"
            // underlying output stream back to the client
            String text = newResponse.toString();
            if (text != null) {
                text = text.toUpperCase();
                // Now write the output to the real
                // output stream that goes back to
                // the client
                response.getWriter().write(text);
            } else {
                response.getWriter().write("text is null");
            }
        }
        System.out.printf("update case filter end...");
    }
}
