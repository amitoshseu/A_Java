<%-- 
    Document   : demo
    Created on : Jul 26, 2016, 11:30:10 PM
    Author     : amitoshseu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%!
            public class Calculator{
                public int add(int x,int y ){
                    int z = x+y;
                    return z;
            }
        }
        %>
        <%
            int i = 10; 
            int j = 20;
            Calculator c = new Calculator();
            int k = c.add(i, j);
          //out.println(k);
         %>
        
         <h3>Value is <%=k %></h3>
    </body>
</html>
