<%-- 
    Document   : sessionDelete
    Created on : Dec 25, 2025, 1:20:43 PM
    Author     : abc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%session.removeAttribute("name"); %>
        <h1>Hello World!</h1>
    </body>
</html>
