package com.wiloon.servlet.filter.modifyresponse;

/**
 * Created with IntelliJ IDEA.
 * User: wiloon
 * Date: 11/21/12
 * Time: 9:09 PM
 * To change this template use File | Settings | File Templates.
 */

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Simple response wrapper that utilizes a local CharArrayWriter
 * for output
 */
public class CharResponseWrapper extends HttpServletResponseWrapper {
    protected CharArrayWriter charWriter;//将响应缓存在这个写入器中
    protected PrintWriter writer;
    protected boolean getOutputStreamCalled;
    protected boolean getWriterCalled;

    public CharResponseWrapper(HttpServletResponse response) {
        super(response);
        // Create the writer
        charWriter = new CharArrayWriter();
    }

    public ServletOutputStream getOutputStream()
            throws IOException {
        // Can't call getOutputStream if getWriter
        // has already been called
        if (getWriterCalled) {
            throw new IllegalStateException(
                    "getWriter already called");
        }
        getOutputStreamCalled = true;
        return super.getOutputStream();
    }

    public PrintWriter getWriter()
            throws IOException {
        if (writer != null) {
            return writer;
        }
        // Can't call getWriter if getOutputStream
        // has already been called
        if (getOutputStreamCalled) {
            throw new IllegalStateException(
                    "getOutputStream already called");
        }
        getWriterCalled = true;
        writer = new PrintWriter(charWriter);
        return writer;
    }

    public String toString()//将响应数据用字符串返回
    {
        String s = null;
        // Only return a String if the writer was
        // used.
        if (writer != null) {
            s = charWriter.toString();
        }
        return s;
    }

    public char[] toCharArray() {//将响应数据以字符数组返回
        return (charWriter.toCharArray());
    }
}