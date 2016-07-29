<%-- 
    Document   : index
    Created on : Jul 28, 2016, 2:00:36 PM
    Author     : amitoshseu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Index JSP page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>This is a JSP page</h1>
        <div>Enter your name and password:</div>
        <form id = "loginForm" method="post" action="LoginServlet">
            Name <input type="text" name="username" /> <br/>
            Password <input type="password" name="password" /> <br/>
            <input type="submit" value ="login" />
        </form>
        <%
            String message = (String) session.getAttribute("message");
            if(message == null )
                message = "";
            out.println(message);
          %>
    </body>
</html>
