<%-- 
    Document   : greetings
    Created on : Jul 27, 2016, 4:01:22 AM
    Author     : amitoshseu
--%>

<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>Login OK!</h1>
        <%
           User myUser =  (User) session.getAttribute("user");
           out.println("Hello! " + myUser.getFullname());
           out.println("Phone numbers:");
           for(String s: myUser.getPhones())
                out.println(s);
         %>
    </body>
</html>
