<%-- 
    Document   : passwordjsp
    Created on : Dec 25, 2025, 12:30:49 PM
    Author     : abc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            div{
                display: flex;
                justify-content: center;
                align-content: center;
                flex-direction: column;
                gap:15px;
                background-color:blueviolet;
                margin: auto;
                height: 300px;
            }
            input{
                width: 400px;
                height: 40px;
                
            }
            button{
                width: 400px;
                height: 35px;
                background-color:gold;
                border: none;
            }
            
        </style>
    </head>
    <body>
     
        <div>
            <center>
        <h1> Programmers Password </h1>
        <h3> Enter access password to continue</h3>
 
        <input type="text" name="password" placeholder="Enter the password"/>
         <br><br>
        <button type="submit">Unlock</button>
        </center>
        </div>
   
    </body>
</html>
