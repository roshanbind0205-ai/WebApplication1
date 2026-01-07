<%@page import="java.sql.ResultSet"%>
<%@page import="javax.crypto.spec.PSource"%>
<%@page import="java.sql.PreparedStatement"%>

<%
    String result = "", resultcss = ".success";
    String bookname = "", author = "";
    int price = 0;
    boolean ispostback = false;
    String check = request.getParameter("check");

    if (check != null) {
        ispostback = true;
    }
%>

<%@page import="java.sql.Connection"%>
<%@page import="Data.Connector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Entry</title>
        <style>
            body { 
                margin: 0; 
                padding: 0; 
                height: 100vh; 
                display: flex; 
                justify-content: center; 
                align-items: center; 
                background: linear-gradient(135deg, #fceabb, #f8b500);
                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            }

            .card { 
                background: #fff; 
                width: 380px; 
                padding: 40px 30px; 
                border-radius: 15px; 
                box-shadow: 0 20px 40px rgba(0,0,0,0.15); 
                text-align: center;
                transition: transform 0.3s, box-shadow 0.3s;
            }

            .card:hover {
                transform: translateY(-5px);
                box-shadow: 0 25px 50px rgba(0,0,0,0.2);
            }

            h1.success {
                color: #28a745;
                font-size: 20px;
                margin-bottom: 15px;
            }

            h1.failure {
                color: #dc3545;
                font-size: 20px;
                margin-bottom: 15px;
            }

            label {
                display: block;
                text-align: left;
                font-weight: bold;
                margin-bottom: 5px;
                margin-top: 10px;
                color: #333;
            }

            input[type="text"], input[type="number"] {
                width: 100%;
                padding: 10px 12px;
                margin-bottom: 10px;
                border: 1px solid #ccc;
                border-radius: 8px;
                font-size: 16px;
                box-sizing: border-box;
                transition: border-color 0.3s, box-shadow 0.3s;
            }

            input[type="text"]:focus, input[type="number"]:focus {
                border-color: #007bff;
                box-shadow: 0 0 5px rgba(0,123,255,0.5);
                outline: none;
            }

            .title {
                width: 100%;
                padding: 12px;
                border-radius: 10px;
                background-color: #007bff;
                color: #fff;
                font-size: 18px;
                font-weight: bold;
                border: none;
                cursor: pointer;
                transition: background 0.3s, transform 0.2s;
            }

            .title:hover {
                background-color: #0056b3;
                transform: translateY(-2px);
            }

            .title:active {
                transform: translateY(1px);
            }

            /* New link style */
            .viewAll {
                display: block;
                margin-top: 15px;
                text-align: center;
                color: #007bff;
                font-weight: bold;
                text-decoration: underline;
                cursor: pointer;
            }

            .viewAll:hover {
                color: #0056b3;
            }
        </style>
    </head>
    <body>
        <% try {
                if (ispostback) {
                    bookname = request.getParameter("name");
                    author = request.getParameter("author");
                    price = Integer.parseInt(request.getParameter("price"));
                    PreparedStatement ps = Connector.getConnection().prepareStatement("insert into allbooks values(allbookseq.nextval,?,?,?)");
                    ps.setObject(1, bookname);
                    ps.setObject(2, author);
                    ps.setObject(3, price);
                    ps.execute();
                    result = "Success";
                }
            } catch (Exception ex) {
                resultcss = "failure";
                result = ex.getMessage();
            }
        %>

        <form action="" method="post">
            <div class="card">
                <h1 class="<%=resultcss%>"><%=result%></h1>
                <input type="hidden" name="check">
                
                <label>Book Name</label>
                <input type="text" value="<%=bookname%>" name="name" placeholder="Enter book name">
                
                <label>Book Author</label>
                <input type="text" value="<%=author%>" name="author" placeholder="Enter author name">
                
                <label>Book Price</label>
                <input type="number" value="<%=price%>" min="1" name="price" placeholder="Enter price">
                
                <button class="title" type="submit">Insert</button>

                <!-- View All Books link -->
                <a href="allBook.jsp" class="viewAll">View All Books</a>
            </div>
        </form>
    </body>
</html>