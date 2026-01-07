<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Data.Connector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Data.Connector"%>

<%
String pageid = request.getParameter("pageid");

if(pageid != null)
{
    PreparedStatement ps = Connector.getConnection().prepareStatement("delete from page1 where id=?");

    ps.setString(1, pageid);
    ps.executeUpdate();

    out.println("<h3 style='color:green'>page Deleted Successfully</h3>");
}
%>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Page</title>
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
    <input type="number" name="pageid" placeholder="Enter The PageId"/>
    <br><br>
    <button type="submit">Delete</button>
</form>
        </div>
</body>
</html>