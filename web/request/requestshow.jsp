<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>request show Page</title>
    </head>
    <body>
        <h1>
            <%=request.getAttribute("number")%>
        </h1>
    </body>
</html>
