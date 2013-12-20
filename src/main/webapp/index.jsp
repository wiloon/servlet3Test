<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>

<html>
<body>
<h2>Hello World!</h2>
<%= new java.util.Date() %>
<% Enumeration e = request.getAttributeNames();
    while (e.hasMoreElements()) {
        String s = (String) e.nextElement();%>
<h2>Hello World!</h2><%=s%>
<%} %>
<h3>Hello World!</h3>
</body>
</html>
