
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Data.Crud"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            
            input{
                width: 350px;
                height: 25px;
                padding: 7px;
                box-shadow: 0px 0px 25px pink;
                border-radius: 20px;
                background-color: pink;
                border: none;
                flex-direction: column;
            }
            input:hover{
                background-color:blanchedalmond;
                box-shadow: 0px 0px 20px;
            }
            div{
               display: flex;
               align-items: center;
               justify-content: center;
               flex-direction: column;
               gap:15px
                
            }
            button{
                width: 125px;
                height: 40px;
                background-color:blue;
                border-radius: 20px;
                
            }
            button:hover{
                background-color:cadetblue;
                box-shadow: 0px 0px 20px;
            }
            
            
        </style>
        
    </head>
    <body>
       
              
             
        <h1>😔 Result 😔</h1>
        <form method="post">
        <input type="text" name="name" placeholder="Enter the Name"/></br>
        <input type="text" name="mobile" placeholder="Enter the Mobile"/></br>
        <input type="text" name="email" placeholder="Enter the email"/></br>
        <input type="text" name="password" placeholder="Enter the password"/></br>
        <button type="submit">Submit</button>
        </form>
       
        <%
             String name = request.getParameter("name");
             String mobile=request.getParameter("mobile");
             String email = request.getParameter("email");
             String password = request.getParameter("password");
             
            try{
            
           java.sql.Connection connection = Data.Connector.getConnection();
           java.sql.PreparedStatement statement = connection.prepareStatement("INSERT INTO data(name,mobile,email,password) VALUES (?,?,?,?)");           
           
           statement.setString(1, name);
           statement.setString(2, mobile);
           statement.setString(3, email);
           statement.setString(4 ,password);
           statement.execute();

        } catch (Exception e) {
          
        }
        %>
        
            
    </body>
</html>
