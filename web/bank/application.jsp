<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Application Page</title>
        
        <style>
            
            input{
                width: 200px;
                height: 30px;
                border-radius:7px;
            }
            
        </style>
        
    </head>
    <body>
         <center>
        <h2>Application</h2>
    <form method="get">
       
        <input type="text" name="card" placeholder="card"/><br></br>
        <button type="submit">Sumbit</button>
        </center>
        </form>
    </body>
    
    
 <%
            String cardno = request.getParameter("card");
            if(cardno==null)
            return;
            request.setAttribute("card", cardno);
            request.getRequestDispatcher("pin.jsp").forward(request, response);
        %>

</html>
