<%@page import="java.sql.*"%>
<%@page import="Data.Connector"%>

<%
    String result = "";
    boolean ispostback = false;

    if (request.getParameter("check") != null) {
        ispostback = true;
    }

    try {
        if (ispostback) {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            int password = Integer.parseInt(request.getParameter("password"));

            PreparedStatement ps = Connector.getConnection()
                    .prepareStatement("insert into page1 values(page1seq.nextval,?,?,?)");

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, password);

            ps.execute();
            result = "Success";
        }
    } catch (Exception ex) {
        result = "? Error: " + ex.getMessage();
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register Page</title>

    <style>
        body{
            height: 100vh;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            background:#66a6ff;
        }
        .container{
            width: 350px;
            padding: 35px;
            border-radius: 20px;
            border: 1px solid rgba(255, 255, 255, 0.3);
            box-shadow: 0 10px 40px rgba(0,0,0,0.2);
        }

        .input-box{
            position: relative;
        }

        .input-box input{
            width: 100%;
            padding: 14px;
            margin: 12px 0;
            border-radius: 10px;
            border: none;
            font-size: 15px;
            outline: none;
            background: rgba(255,255,255,0.25);
            color: #fff;
            transition: 0.4s ease;
        }

        .input-box input::placeholder{
            color: #eee;
        }

        button{
            width: 100%;
            padding: 12px;
            margin-top: 10px;
            border-radius: 10px;
            font-size: 16px;
        }
        button:hover{
            background-color: #357ab8;
        }

                
    </style>
</head>

<body>

<div class="container">
    <form method="post">
        <input type="hidden" name="check" value="1">

        <div class="input-box">
            <input type="text" name="name" placeholder="Enter your name"/>
        </div>

        <div class="input-box">
            <input type="email" name="email" placeholder="Enter your email"/>
        </div>

        <div class="input-box">
            <input type="password" name="password" placeholder="Enter your password"/>
        </div>

        <button type="submit">Submit</button>

        <div class="msg"><%=result%></div>
    </form>
</div>

</body>
</html>
