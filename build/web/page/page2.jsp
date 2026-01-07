<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Data.Connector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Page</title>

<style>
    body{
        font-family: Arial, sans-serif;
        background: #f2f4f7;
        margin: 0;
        padding: 20px;
    }
    h1{
        text-align: center;
        color: #333;
        margin-bottom: 30px;
    }
    table{
        width: 80%;
        margin: auto;
        border-collapse: collapse;
        background: white;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }
    th, td{
        padding: 12px 15px;
        text-align: center;
    }
    th{
        background: #007bff;
        color: white;
        font-size: 16px;
        letter-spacing: 0.5px;
    }
    tr:hover{
        background: #e8f2ff;
        transition: 0.2s;
    }
    a{
        text-decoration: none;
        color: white;
        background: #28a745;
        padding: 6px 12px;
        border-radius: 5px;
    }
    a.delete{
        background: #dc3545;
    }
    a:hover{
        opacity: 0.8;
    }
</style>
</head>

<body>

<h1>📚 All Page</h1>

<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Password</th>
        <th>Update</th>
        <th>Delete</th>
    </tr>

<%
    String id = request.getParameter("id");
    String message = "";

    if(request.getMethod().equalsIgnoreCase("POST")) {

        String newName = request.getParameter("name");
        String newEmail = request.getParameter("email");
        String newPassword = request.getParameter("password");

        try {
            PreparedStatement psUpdate = Connector.getConnection()
                .prepareStatement("UPDATE page1 SET name=?, email=?, password=? WHERE id=?");

            psUpdate.setString(1, newName);
            psUpdate.setString(2, newEmail);
            psUpdate.setString(3, newPassword);
            psUpdate.setString(4, id);
            psUpdate.executeUpdate();

            message = "Update Successful!";
        }
        catch(Exception e) {
            message = "Error: " + e;
        }
    }
    String name="", email="", password="";

    try {
        PreparedStatement ps = Connector.getConnection()
            .prepareStatement("SELECT * FROM page1 WHERE id=?");

        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            name = rs.getString("name");
            email = rs.getString("email");
            password = rs.getString("password");
        }
    }
    catch(Exception e) {
        out.println(e);
    }
%>

<tr>
    <td><%=id%></td>
    <td><%=name%></td>
    <td><%=email%></td>
    <td><%=password%></td>

    <td><a href="update.jsp?id=<%=id%>">Update</a></td>
    <td><a href="delete.jsp?id=<%=id%>" class="delete">Delete</a></td>
</tr>

</table>

</body>
</html>
