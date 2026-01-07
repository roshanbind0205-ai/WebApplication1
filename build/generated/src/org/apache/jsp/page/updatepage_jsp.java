package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import Data.Connector;
import java.sql.PreparedStatement;

public final class updatepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Update</title>\n");
      out.write("        <style>\n");
      out.write("             body{\n");
      out.write("        font-family: Arial, sans-serif;\n");
      out.write("        background: #f4f6f9;\n");
      out.write("        padding: 20px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    h1{\n");
      out.write("        margin-bottom: 15px;\n");
      out.write("        text-align: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .success{\n");
      out.write("        color: #2e7d32;\n");
      out.write("        background: #e8f5e9;\n");
      out.write("        padding: 10px;\n");
      out.write("        border-radius: 5px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .failure{\n");
      out.write("        color: #c62828;\n");
      out.write("        background: #ffebee;\n");
      out.write("        padding: 10px;\n");
      out.write("        border-radius: 5px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    form{\n");
      out.write("        background: #ffffff;\n");
      out.write("        padding: 20px;\n");
      out.write("        width: 350px;\n");
      out.write("        margin: auto;\n");
      out.write("        border-radius: 8px;\n");
      out.write("        box-shadow: 0 4px 10px rgba(0,0,0,0.1);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    label{\n");
      out.write("        display: block;\n");
      out.write("        margin-top: 10px;\n");
      out.write("        font-weight: bold;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input[type=\"text\"],\n");
      out.write("    input[type=\"number\"]{\n");
      out.write("        width: 100%;\n");
      out.write("        padding: 8px;\n");
      out.write("        margin-top: 5px;\n");
      out.write("        border: 1px solid #ccc;\n");
      out.write("        border-radius: 4px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    button{\n");
      out.write("        margin-top: 15px;\n");
      out.write("        width: 100%;\n");
      out.write("        padding: 10px;\n");
      out.write("        background: #1976d2;\n");
      out.write("        color: white;\n");
      out.write("        border: none;\n");
      out.write("        border-radius: 4px;\n");
      out.write("        font-size: 16px;\n");
      out.write("        cursor: pointer;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    button:hover{\n");
      out.write("        background: #1565c0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    table{\n");
      out.write("        margin: 30px auto;\n");
      out.write("        width: 90%;\n");
      out.write("        border-collapse: collapse;\n");
      out.write("        background: white;\n");
      out.write("        box-shadow: 0 4px 10px rgba(0,0,0,0.1);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    table th, table td{\n");
      out.write("        padding: 10px;\n");
      out.write("        text-align: center;\n");
      out.write("        border: 1px solid #ddd;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    table tr:first-child{\n");
      out.write("        background: #1976d2;\n");
      out.write("        color: white;\n");
      out.write("        font-weight: bold;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    table tr:nth-child(even){\n");
      out.write("        background: #f2f2f2;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    a{\n");
      out.write("        text-decoration: none;\n");
      out.write("        color: #1976d2;\n");
      out.write("        font-weight: bold;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    a:hover{\n");
      out.write("        color: #0d47a1;\n");
      out.write("    }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form action=\"\" method=\"post\">\n");
      out.write("            <input type=\"hidden\" name=\"pageid\" value=\"");
      out.print(pageid);
      out.write("\"\n");
      out.write("            <h1 class=\"");
      out.print(resultcss);
      out.write('"');
      out.write('>');
      out.print(result);
      out.write("</h1>\n");
      out.write("            <input type=\"hidden\" name=\"check\">\n");
      out.write("            <label>Book Name</label><input type=\"text\" value=\"");
      out.print(name);
      out.write("\" name=\"name\">\n");
      out.write("            <br>\n");
      out.write("            <label>Book Author</label><input  value=\"");
      out.print(email);
      out.write("\" type=\"text\" name=\"email\">\n");
      out.write("            <br>\n");
      out.write("            <label>Book Price</label><input  value=\"");
      out.print(password);
      out.write("\" type=\"number\" min=\"1\" name=\"password\">\n");
      out.write("            <button type=\"submit\">Update</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    \n");
      out.write("        <h1>Update!</h1>\n");
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
