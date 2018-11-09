<%-- 
    Document   : index
    Created on : Nov 9, 2018, 4:06:03 PM
    Author     : nazmulbasher
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
        <br/>
        <%
           out.println("Your IP address is: " + request.getRemoteAddr());
        %>
    </body>
</html>
