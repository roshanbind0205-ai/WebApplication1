<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>request delete Page</title>
    </head>
    <body>
        <%
        request.removeAttribute("number");
        %>
    </body>
</html>
