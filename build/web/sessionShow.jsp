<%-- 
    Document   : sessionShow
    Created on : Dec 25, 2025, 1:20:02 PM
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
        <h1>Session show</h1>
         <h1><%=session.getAttribute("user_name")%></h1>
          <h1><%=session.getAttribute("password")%></h1>
         
    </body>
</html>
