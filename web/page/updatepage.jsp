<%@page import="java.sql.ResultSet"%>
<%@page import="Data.Connector"%>
<%@page import="java.sql.PreparedStatement"%>
<%
String result="",resultcss="",name="",email="",pageid="";
int password=0;
pageid=request.getParameter("pageid");

if(pageid==null)
{
pageid=request.getParameter("id");
//out.println(bookid);
PreparedStatement ps=Connector.getConnection().prepareStatement("select * from page1 where id=?");
ps.setObject(1, pageid);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
    name="" + rs.getObject("name");
    email="" + rs.getObject("email");
    password=Integer.parseInt( "" + rs.getObject("password"));
}
}
else
{
   PreparedStatement ps=Connector.getConnection().prepareStatement("update allbooks set name=?,email=?,password=? where id=?");
     name = request.getParameter("name");
                    email = request.getParameter("email");
                    password = Integer.parseInt(request.getParameter("password"));
                    ps.setObject(1, name);
                    ps.setObject(2, email);
                    ps.setObject(3, password);
                    ps.setObject(4, pageid);
                    ps.execute();
}
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update</title>
        <style>
             body{
        font-family: Arial, sans-serif;
        background: #f4f6f9;
        padding: 20px;
    }

    h1{
        margin-bottom: 15px;
        text-align: center;
    }

    .success{
        color: #2e7d32;
        background: #e8f5e9;
        padding: 10px;
        border-radius: 5px;
    }

    .failure{
        color: #c62828;
        background: #ffebee;
        padding: 10px;
        border-radius: 5px;
    }

    form{
        background: #ffffff;
        padding: 20px;
        width: 350px;
        margin: auto;
        border-radius: 8px;
        box-shadow: 0 4px 10px rgba(0,0,0,0.1);
    }

    label{
        display: block;
        margin-top: 10px;
        font-weight: bold;
    }

    input[type="text"],
    input[type="number"]{
        width: 100%;
        padding: 8px;
        margin-top: 5px;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    button{
        margin-top: 15px;
        width: 100%;
        padding: 10px;
        background: #1976d2;
        color: white;
        border: none;
        border-radius: 4px;
        font-size: 16px;
        cursor: pointer;
    }

    button:hover{
        background: #1565c0;
    }

    table{
        margin: 30px auto;
        width: 90%;
        border-collapse: collapse;
        background: white;
        box-shadow: 0 4px 10px rgba(0,0,0,0.1);
    }

    table th, table td{
        padding: 10px;
        text-align: center;
        border: 1px solid #ddd;
    }

    table tr:first-child{
        background: #1976d2;
        color: white;
        font-weight: bold;
    }

    table tr:nth-child(even){
        background: #f2f2f2;
    }

    a{
        text-decoration: none;
        color: #1976d2;
        font-weight: bold;
    }

    a:hover{
        color: #0d47a1;
    }
        </style>
    </head>
    <body>
        
        <form action="" method="post">
            <input type="hidden" name="pageid" value="<%=pageid%>"
            <h1 class="<%=resultcss%>"><%=result%></h1>
            <input type="hidden" name="check">
            <label>Book Name</label><input type="text" value="<%=name%>" name="name">
            <br>
            <label>Book Author</label><input  value="<%=email%>" type="text" name="email">
            <br>
            <label>Book Price</label><input  value="<%=password%>" type="number" min="1" name="password">
            <button type="submit">Update</button>


        </form>
    
        <h1>Update!</h1>
    </body>
</html>