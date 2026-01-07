<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register - Modern UI</title>

    <style>
        *{
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', sans-serif;
        }

        body{
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: linear-gradient(135deg, #89f7fe 0%, #66a6ff 100%);
        }

        .card{
            width: 380px;
            background: #fff;
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.2);
            text-align: center;
        }

        .card h2{
            margin-bottom: 20px;
            color: #333;
        }

        .card input{
            width: 100%;
            padding: 12px;
            margin: 8px 0;
            border-radius: 8px;
            border: 1px solid #bbb;
            font-size: 15px;
            transition: 0.3s;
        }

        .card input:focus{
            border-color: #4a90e2;
            outline: none;
            box-shadow: 0 0 5px rgba(74,144,226,0.7);
        }

        .btn{
            width: 100%;
            padding: 12px;
            margin-top: 15px;
            background: #4a90e2;
            border: none;
            border-radius: 8px;
            color: #fff;
            font-size: 17px;
            cursor: pointer;
            transition: 0.3s;
        }

        .btn:hover{
            background: #357ABD;
        }

        .msg{
            color: red;
            margin-bottom: 10px;
            font-weight: bold;
        }
    </style>

</head>
<body>

<div class="card">
    <div class="msg"><%= result %></div>

    <h2>Register</h2>

    <form method="post">
        <input type="hidden" name="check" value="1">

        <input type="text" name="name" value="<%=name%>" placeholder="Enter Name" required>

        <input type="text" name="username" value="<%=username%>" placeholder="Enter Username" required>

        <input type="password" name="password" value="<%=password%>" placeholder="Enter Password" required>

        <input type="password" name="confirmpassword" value="<%=confirmpassword%>" placeholder="Confirm Password" required>

        <button type="submit" class="btn">Submit</button>
    </form>
</div>

</body>
</html>
