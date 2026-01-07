<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Data.Connector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Data.Connector"%>

<%
String bookid = request.getParameter("bookid");

if(bookid != null)
{
    PreparedStatement ps = Connector.getConnection().prepareStatement("delete from allbooks where id=?");

    ps.setString(1, bookid);
    ps.executeUpdate();

    out.println("<h3 style='color:green'>Book Deleted Successfully</h3>");
}
%>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Book</title>
    <style>
        div{
            display:flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            gap:15px;
        }
        input{
            width: 300px;
            height: 30px;
            font-size: 18px;
        }
        button{
            width: 308px;
            height: 30px;
            font-size: 18px;
        }
    </style>
</head>
<body>
    <div>
        <h2>Fill The Confirm Password</h2>
    <form method="post">
    <input type="number" name="bookid" placeholder="Enter The BookId"/>
    <br><br>
    <button type="submit">Delete</button>
</form>
        </div>
</body>
</html>