<%-- 
    Document   : sessionadd
    Created on : Dec 25, 2025, 1:19:44 PM
    Author     : abc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        
        <style>
            input{
                width:300px;
                height: 40px;
                border-radius: 30px;
                box-shadow: 0px 0px 7px;
            }
            button{
                width: 200px;
                height: 50px;
                border-radius: 30px;
                box-shadow: 0px 0px 7px;
                background-color:highlighttext;
            }
            
        </style>
        
    </head>
    <body>
        <%session.setAttribute("name", "Roshan");%>
        <div>
            <center>
                <form method="post">
            <h2>Login Page</h2>
            <h4>Enter access password to continue</h4>
            <input type="text" name="user_name" placeholder="user_name"/>
            <br><br>
            <input type="text"  name="password" placeholder="password"/>
            <br><br>
            <button type="Submit">Submit</button>
            </form>
            </center>
        </div>
        
        <%
             String user_name = request.getParameter("user_name");
             String password = request.getParameter("password");
             
              
            try{
            
           java.sql.Connection connection = Data.Connector.getConnection();
           java.sql.PreparedStatement statement = connection.prepareStatement("select * from login where user_name=? AND password=?");           
           
           statement.setString(1, user_name);
           statement.setString(2 ,password);
           java.sql.ResultSet rs= statement.executeQuery();
           
           if(rs.next()){
               out.println("correct");
               session.setAttribute("user_name",user_name);
               session.setAttribute("password", password);
           }
           else{
               out.println("incorrect");
           }
        } catch (Exception e) {
          
        }           
        %>
    </body>
</html>
