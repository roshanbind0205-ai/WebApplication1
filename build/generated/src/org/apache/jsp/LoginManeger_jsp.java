package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginManeger_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Login Manager</title>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background:#1a5ed1;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .int {\n");
      out.write("            width: 350px;\n");
      out.write("            background: #ffffff;\n");
      out.write("            border-radius: 20px;\n");
      out.write("            padding: 20px;\n");
      out.write("            margin: 40px auto;\n");
      out.write("            box-shadow: 0px 0px 20px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input {\n");
      out.write("            width: 90%;\n");
      out.write("            height: 40px;\n");
      out.write("            border-radius: 25px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            padding: 10px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            margin-top: 12px;\n");
      out.write("            box-shadow: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .button {\n");
      out.write("            width: 90%;\n");
      out.write("            height: 45px;\n");
      out.write("            background: #2575fc;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 18px;\n");
      out.write("            border-radius: 25px;\n");
      out.write("            border: none;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .button:hover {\n");
      out.write("            background:aqua;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"int\">\n");
      out.write("    <h1>Register</h1>\n");
      out.write("\n");
      out.write("    <form action=\"Register\" method=\"post\">\n");
      out.write("        <input type=\"text\" name=\"name\" placeholder=\"Full Name\" required><br>\n");
      out.write("        <input type=\"text\" name=\"username\" placeholder=\"Username\" required><br>\n");
      out.write("        <input type=\"text\" name=\"password\" placeholder=\"Password\" required><br>\n");
      out.write("        <input type=\"text\" name=\"confirm_password\" placeholder=\"Confirm Password\" required><br>\n");
      out.write("\n");
      out.write("        <button class=\"button\" type=\"submit\">Submit</button>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("     \n");
      out.write("    ");

//    
//    class LoginManeger{
//    
//    String name = request.getParameter("name");
//    String username = request.getParameter("username");
//    String password = request.getParameter("password");
//    String comfrom_password = request.getParameter("comfrom_password");
//    }
    

    
    
      out.write("\n");
      out.write("    \n");
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
