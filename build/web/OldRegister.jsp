
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Manager</title>

        <style>
            body {
                font-family: Arial, sans-serif;
                background:#1a5ed1;
                margin: 0;
                padding: 0;
            }

            .int {
                width: 350px;
                background: #ffffff;
                border-radius: 20px;
                padding: 20px;
                margin: 40px auto;
                box-shadow: 0px 0px 20px;
                text-align: center;
            }

            input {
                width: 90%;
                height: 40px;
                border-radius: 25px;
                border: 1px solid #ccc;
                padding: 10px;
                font-size: 16px;
                margin-top: 12px;
                box-shadow: none;
            }

            .button {
                width: 90%;
                height: 45px;
                background: #2575fc;
                color: white;
                font-size: 18px;
                border-radius: 25px;
                border: none;
                margin-top: 20px;
            }

            .button:hover {
                background:aqua;
            }
        </style>
    </head>

    <body>

    <div class="int">
        <h1>Register</h1>

        <form method="post">
           <input type="text"            name="name" placeholder="Full Name"/><br>
           <input type="text"            name="username" placeholder="Username"/><br>
           <input type="password"        name="password" placeholder="Password"/><br>
           <input type="comfrom_password"name="confirm_password" placeholder="Confirm_Password"/><br>

            <button class="button" type="submit">Submit</button>
        </form>
    </div>
     
    <%
          String name = request.getParameter("name");
          String username = request.getParameter("username");
          String password = request.getParameter("password");
          String comfrom_password = request.getParameter("comfrom_password");
    
          if(password.equals(comfrom_password))
//    
        {
        
          try{
    
           java.sql.Connection connection = Data.Connector.getConnection();
           java.sql.PreparedStatement statement = connection.prepareStatement("insert into register(name,username,password)values(?,?,?)"); 
    
           statement.setString(1, name);
           statement.setString(2 ,username);
           statement.setString(3 ,password);
          
           statement.execute();
           
         int i = statement.executeUpdate();
           
         if(i > 0)
               
           {
               out.println("Successfull");
           }
           
           }
            catch (Exception e) {   
        }
    }
    
    else{
        out.println("<p style='color:red'>password do not match</p>");
        }
   %>
    
</body>
</html>


