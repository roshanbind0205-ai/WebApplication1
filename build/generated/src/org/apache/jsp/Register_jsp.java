package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

 String check = request.getParameter("check");
    String result = "";
    System.err.println(check);
    String name = "", username = "", password = "", confirmpassword = "";
    boolean ispostback = false;
    if (check != null) {
        ispostback = true;
    }
    System.err.println(ispostback);

    if (ispostback) {
        name = request.getParameter("name");
        username = request.getParameter("username");
        password = request.getParameter("password");
        confirmpassword = request.getParameter("confirmpassword");
        if (!password.equals(confirmpassword)) {
            result = "<h1 style='color:red;'>Passwords do not match.</h1>";
        } else {
            try {
                java.sql.Connection connection = Data.Connector.getConnection();
                java.sql.PreparedStatement statement = connection.prepareStatement("insert into register(name,username,password) values(?,?,?)");

                statement.setString(1, name);
                statement.setString(2, username);
                statement.setString(3, password);

                statement.execute();
                result = "<h1 style='color:green;'>Success.</h1>";
            } catch (Exception ex) {
                result = "<h1 style='color:red;'>" + ex.getMessage() + "</h1>";
            }
        }

    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Manager</title>\n");
      out.write("        <style>\n");
      out.write("            div{\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                flex-direction: column;\n");
      out.write("                gap:15px;\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                width: 320px;\n");
      out.write("                height: 30px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            input:hover{\n");
      out.write("                border-color: red;\n");
      out.write("            }\n");
      out.write("            button{\n");
      out.write("                width: 327px;\n");
      out.write("                height: 35px; \n");
      out.write("                font-size: 18px;\n");
      out.write("                color: green;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center> ");
      out.print(result);
      out.write("</center>\n");
      out.write("\n");
      out.write("    <div>\n");
      out.write("        <h1>Register</h1>\n");
      out.write("        <form method=\"post\" >\n");
      out.write("            <input type=\"hidden\" name=\"check\" value=\"1\">\n");
      out.write("            <input value=\"");
      out.print(name);
      out.write("\" type=\"text\" name=\"name\" placeholder=\"Enter The Name\" required /><br/><br/>\n");
      out.write("            <input  value=\"");
      out.print(username);
      out.write("\"  type=\"text\" name=\"username\" placeholder=\"Enter The User_name\" required /><br/><br/>\n");
      out.write("            <input  value=\"");
      out.print(password);
      out.write("\"  type=\"password\" name=\"password\" placeholder=\"Enter The Password\" required /><br/><br/>\n");
      out.write("            <input  value=\"");
      out.print(confirmpassword);
      out.write("\"  type=\"password\" name=\"confirmpassword\" placeholder=\"Enter The Confirm Password\" required /><br/><br/>\n");
      out.write("            <button type=\"submit\">Submit</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");



      out.write("\n");
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
