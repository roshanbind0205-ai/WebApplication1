package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import Data.Connector;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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

    String result = "";
    boolean ispostback = false;

    if (request.getParameter("check") != null) {
        ispostback = true;
    }

    try {
        if (ispostback) {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            int password = Integer.parseInt(request.getParameter("password"));

            PreparedStatement ps = Connector.getConnection()
                    .prepareStatement("insert into page1 values(page1seq.nextval,?,?,?)");

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, password);

            ps.execute();
            result = "Success";
        }
    } catch (Exception ex) {
        result = "? Error: " + ex.getMessage();
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Register Page</title>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            height: 100vh;\n");
      out.write("            margin: 0;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            background: linear-gradient(135deg, #6a11cb, #2575fc);\n");
      out.write("        }\n");
      out.write("        .container{\n");
      out.write("            width: 350px;\n");
      out.write("            padding: 35px;\n");
      out.write("            border-radius: 20px;\n");
      out.write("            background: rgba(255,255,255,0.1);\n");
      out.write("            backdrop-filter: blur(5px);\n");
      out.write("            border: 1px solid rgba(255, 255, 255, 0.3);\n");
      out.write("            box-shadow: 0 10px 40px rgba(0,0,0,0.2);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input-box{\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input-box input{\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 14px;\n");
      out.write("            margin: 12px 0;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            border: none;\n");
      out.write("            font-size: 15px;\n");
      out.write("            outline: none;\n");
      out.write("            background: rgba(255,255,255,0.25);\n");
      out.write("            color: #fff;\n");
      out.write("            transition: 0.4s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input-box input::placeholder{\n");
      out.write("            color: #eee;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button{\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 12px;\n");
      out.write("            margin-top: 10px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            border: none;\n");
      out.write("            background-color: #4a90e2;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 16px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        button:hover{\n");
      out.write("            background-color: #357ab8;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .msg{\n");
      out.write("            margin-top: 10px;\n");
      out.write("            color: #fff;\n");
      out.write("            font-size: 14px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <form method=\"post\">\n");
      out.write("        <input type=\"hidden\" name=\"check\" value=\"1\">\n");
      out.write("\n");
      out.write("        <div class=\"input-box\">\n");
      out.write("            <input type=\"text\" name=\"name\" placeholder=\"Enter your name\"/>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"input-box\">\n");
      out.write("            <input type=\"email\" name=\"email\" placeholder=\"Enter your email\"/>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"input-box\">\n");
      out.write("            <input type=\"password\" name=\"password\" placeholder=\"Enter your password\"/>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <button type=\"submit\">Submit</button>\n");
      out.write("\n");
      out.write("        <div class=\"msg\">");
      out.print(result);
      out.write("</div>\n");
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
