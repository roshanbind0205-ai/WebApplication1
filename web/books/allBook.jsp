<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Data.Connector"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All Books</title>

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
    <h1>📚 All Books</h1>

    <table>
        <tr>
            <th>Id</th>
            <th>Book name</th>
            <th>Author</th>
            <th>Price</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>

        <%
            PreparedStatement ps = Connector.getConnection()
                .prepareStatement("select * from allbooks order by name, author");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String bid = "" + rs.getObject("id");
                String bname = "" + rs.getObject("name");
                String bauthor = "" + rs.getObject("author");
                String bprice = "" + rs.getObject("price");
        %>

        <tr>
            <td><%=bid%></td>
            <td><%=bname%></td>
            <td><%=bauthor%></td>
            <td><%=bprice%></td>
            <td><a href="update.jsp?id=<%=bid%>">Update</a></td>
            <td><a href="delete.jsp?id=<%=bid%>" class="delete">Delete</a></td>
        </tr>

        <% } %>

    </table>

</body>
</html>

