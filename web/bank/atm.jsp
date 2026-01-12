<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atm card</title>
    </head>
    <body>
        <%
            String cardno = request.getParameter("cardno");
            if(cardno==null)
            return;
            request.setAttribute("card", cardno);
            request.getRequestDispatcher("pin.jsp").forward(request, response);
        %>
    </body>
</html>
