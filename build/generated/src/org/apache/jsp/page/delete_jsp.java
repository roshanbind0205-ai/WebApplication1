package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Data.Connector;
import java.sql.PreparedStatement;
import Data.Connector;

public final class delete_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

String bookid = request.getParameter("bookid");

if(bookid != null)
{
    PreparedStatement ps = Connector.getConnection().prepareStatement("delete from page1 where id=?");

    ps.setString(1, bookid);
    ps.executeUpdate();

    out.println("<h3 style='color:green'>page Deleted Successfully</h3>");
}

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Delete Page</title>\n");
      out.write("    <style>\n");
      out.write("        div{\n");
      out.write("            display:flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            flex-direction: column;\n");
      out.write("            gap:15px;\n");
      out.write("        }\n");
      out.write("        input{\n");
      out.write("            width: 300px;\n");
      out.write("            height: 30px;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("        button{\n");
      out.write("            width: 308px;\n");
      out.write("            height: 30px;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div>\n");
      out.write("        <h2>Fill The Confirm Password</h2>\n");
      out.write("    <form method=\"post\">\n");
      out.write("    <input type=\"number\" name=\"pageid\" placeholder=\"Enter The PageId\"/>\n");
      out.write("    <br><br>\n");
      out.write("    <button type=\"submit\">Delete</button>\n");
      out.write("</form>\n");
      out.write("        </div>\n");
      out.write("</body>\n");
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
