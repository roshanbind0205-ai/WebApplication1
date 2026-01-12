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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Register - Modern UI</title>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        *{\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            font-family: 'Segoe UI', sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body{\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh;\n");
      out.write("            background: linear-gradient(135deg, #89f7fe 0%, #66a6ff 100%);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card{\n");
      out.write("            width: 380px;\n");
      out.write("            background: #fff;\n");
      out.write("            padding: 30px;\n");
      out.write("            border-radius: 15px;\n");
      out.write("            box-shadow: 0 8px 20px rgba(0,0,0,0.2);\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card h2{\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card input{\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 12px;\n");
      out.write("            margin: 8px 0;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            border: 1px solid #bbb;\n");
      out.write("            font-size: 15px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card input:focus{\n");
      out.write("            border-color: #4a90e2;\n");
      out.write("            outline: none;\n");
      out.write("            box-shadow: 0 0 5px rgba(74,144,226,0.7);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn{\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 12px;\n");
      out.write("            margin-top: 15px;\n");
      out.write("            background: #4a90e2;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            color: #fff;\n");
      out.write("            font-size: 17px;\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn:hover{\n");
      out.write("            background: #357ABD;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .msg{\n");
      out.write("            color: red;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"card\">\n");
      out.write("    <div class=\"msg\">");
      out.print( result );
      out.write("</div>\n");
      out.write("\n");
      out.write("    <h2>Register</h2>\n");
      out.write("\n");
      out.write("    <form method=\"post\">\n");
      out.write("        <input type=\"hidden\" name=\"check\" value=\"1\">\n");
      out.write("\n");
      out.write("        <input type=\"text\" name=\"name\" value=\"");
      out.print(name);
      out.write("\" placeholder=\"Enter Name\" required>\n");
      out.write("\n");
      out.write("        <input type=\"text\" name=\"username\" value=\"");
      out.print(username);
      out.write("\" placeholder=\"Enter Username\" required>\n");
      out.write("\n");
      out.write("        <input type=\"password\" name=\"password\" value=\"");
      out.print(password);
      out.write("\" placeholder=\"Enter Password\" required>\n");
      out.write("\n");
      out.write("        <input type=\"password\" name=\"confirmpassword\" value=\"");
      out.print(confirmpassword);
      out.write("\" placeholder=\"Confirm Password\" required>\n");
      out.write("\n");
      out.write("        <button type=\"submit\" class=\"btn\">Submit</button>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
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
