<%-- 
    Document   : CourseView
    Created on : Jul 28, 2016, 9:13:17 PM
    Author     : amitoshseu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="course" scope="request" class="bd.ac.seu.uss.Course"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Successfully added course!</h1>
        <p>
            Course code: <jsp:getProperty name="course" property="code"/><br/>
            Course title: <jsp:getProperty name="course" property="title"/><br/>
            Credit hours: <jsp:getProperty name="course" property="credits"/><br/>
        </p>
    </body>
</html>
