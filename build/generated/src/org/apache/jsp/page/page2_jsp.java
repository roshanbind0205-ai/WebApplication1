package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Data.Connector;

public final class page2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>All Page</title>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    body{\n");
      out.write("        font-family: Arial, sans-serif;\n");
      out.write("        background: #f2f4f7;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 20px;\n");
      out.write("    }\n");
      out.write("    h1{\n");
      out.write("        text-align: center;\n");
      out.write("        color: #333;\n");
      out.write("        margin-bottom: 30px;\n");
      out.write("    }\n");
      out.write("    table{\n");
      out.write("        width: 80%;\n");
      out.write("        margin: auto;\n");
      out.write("        border-collapse: collapse;\n");
      out.write("        background: white;\n");
      out.write("        box-shadow: 0 0 10px rgba(0,0,0,0.1);\n");
      out.write("    }\n");
      out.write("    th, td{\n");
      out.write("        padding: 12px 15px;\n");
      out.write("        text-align: center;\n");
      out.write("    }\n");
      out.write("    th{\n");
      out.write("        background: #007bff;\n");
      out.write("        color: white;\n");
      out.write("        font-size: 16px;\n");
      out.write("        letter-spacing: 0.5px;\n");
      out.write("    }\n");
      out.write("    tr:hover{\n");
      out.write("        background: #e8f2ff;\n");
      out.write("        transition: 0.2s;\n");
      out.write("    }\n");
      out.write("    a{\n");
      out.write("        text-decoration: none;\n");
      out.write("        color: white;\n");
      out.write("        background: #28a745;\n");
      out.write("        padding: 6px 12px;\n");
      out.write("        border-radius: 5px;\n");
      out.write("    }\n");
      out.write("    a.delete{\n");
      out.write("        background: #dc3545;\n");
      out.write("    }\n");
      out.write("    a:hover{\n");
      out.write("        opacity: 0.8;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h1>📚 All Page</h1>\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("    <tr>\n");
      out.write("        <th>Id</th>\n");
      out.write("        <th>Name</th>\n");
      out.write("        <th>Email</th>\n");
      out.write("        <th>Password</th>\n");
      out.write("        <th>Update</th>\n");
      out.write("        <th>Delete</th>\n");
      out.write("    </tr>\n");
      out.write("\n");

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

      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td>");
      out.print(id);
      out.write("</td>\n");
      out.write("    <td>");
      out.print(name);
      out.write("</td>\n");
      out.write("    <td>");
      out.print(email);
      out.write("</td>\n");
      out.write("    <td>");
      out.print(password);
      out.write("</td>\n");
      out.write("\n");
      out.write("    <td><a href=\"update.jsp?id=");
      out.print(id);
      out.write("\">Update</a></td>\n");
      out.write("    <td><a href=\"delete.jsp?id=");
      out.print(id);
      out.write("\" class=\"delete\">Delete</a></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
