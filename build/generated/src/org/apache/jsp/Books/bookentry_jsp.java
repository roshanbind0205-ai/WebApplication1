package org.apache.jsp.books;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import javax.crypto.spec.PSource;
import java.sql.PreparedStatement;
import java.sql.Connection;
import Data.Connector;

public final class bookentry_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String result = "", resultcss = ".success";
    String bookname = "", author = "";
    int price = 0;
    boolean ispostback = false;
    String check = request.getParameter("check");

    if (check != null) {
        ispostback = true;
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Book Entry</title>\n");
      out.write("        <style>\n");
      out.write("            body { \n");
      out.write("                margin: 0; \n");
      out.write("                padding: 0; \n");
      out.write("                height: 100vh; \n");
      out.write("                display: flex; \n");
      out.write("                justify-content: center; \n");
      out.write("                align-items: center; \n");
      out.write("                background: linear-gradient(135deg, #fceabb, #f8b500);\n");
      out.write("                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card { \n");
      out.write("                background: #fff; \n");
      out.write("                width: 380px; \n");
      out.write("                padding: 40px 30px; \n");
      out.write("                border-radius: 15px; \n");
      out.write("                box-shadow: 0 20px 40px rgba(0,0,0,0.15); \n");
      out.write("                text-align: center;\n");
      out.write("                transition: transform 0.3s, box-shadow 0.3s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card:hover {\n");
      out.write("                transform: translateY(-5px);\n");
      out.write("                box-shadow: 0 25px 50px rgba(0,0,0,0.2);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1.success {\n");
      out.write("                color: #28a745;\n");
      out.write("                font-size: 20px;\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1.failure {\n");
      out.write("                color: #dc3545;\n");
      out.write("                font-size: 20px;\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            label {\n");
      out.write("                display: block;\n");
      out.write("                text-align: left;\n");
      out.write("                font-weight: bold;\n");
      out.write("                margin-bottom: 5px;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                color: #333;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"text\"], input[type=\"number\"] {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 10px 12px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                transition: border-color 0.3s, box-shadow 0.3s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"text\"]:focus, input[type=\"number\"]:focus {\n");
      out.write("                border-color: #007bff;\n");
      out.write("                box-shadow: 0 0 5px rgba(0,123,255,0.5);\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .title {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 12px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                background-color: #007bff;\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 18px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                transition: background 0.3s, transform 0.2s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .title:hover {\n");
      out.write("                background-color: #0056b3;\n");
      out.write("                transform: translateY(-2px);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .title:active {\n");
      out.write("                transform: translateY(1px);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* New link style */\n");
      out.write("            .viewAll {\n");
      out.write("                display: block;\n");
      out.write("                margin-top: 15px;\n");
      out.write("                text-align: center;\n");
      out.write("                color: #007bff;\n");
      out.write("                font-weight: bold;\n");
      out.write("                text-decoration: underline;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .viewAll:hover {\n");
      out.write("                color: #0056b3;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 try {
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
        
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"\" method=\"post\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <h1 class=\"");
      out.print(resultcss);
      out.write('"');
      out.write('>');
      out.print(result);
      out.write("</h1>\n");
      out.write("                <input type=\"hidden\" name=\"check\">\n");
      out.write("                \n");
      out.write("                <label>Book Name</label>\n");
      out.write("                <input type=\"text\" value=\"");
      out.print(bookname);
      out.write("\" name=\"name\" placeholder=\"Enter book name\">\n");
      out.write("                \n");
      out.write("                <label>Book Author</label>\n");
      out.write("                <input type=\"text\" value=\"");
      out.print(author);
      out.write("\" name=\"author\" placeholder=\"Enter author name\">\n");
      out.write("                \n");
      out.write("                <label>Book Price</label>\n");
      out.write("                <input type=\"number\" value=\"");
      out.print(price);
      out.write("\" min=\"1\" name=\"price\" placeholder=\"Enter price\">\n");
      out.write("                \n");
      out.write("                <button class=\"title\" type=\"submit\">Insert</button>\n");
      out.write("\n");
      out.write("                <!-- View All Books link -->\n");
      out.write("                <a href=\"allBook.jsp\" class=\"viewAll\">View All Books</a>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
