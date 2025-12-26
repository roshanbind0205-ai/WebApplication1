package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import Data.Crud;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            input{\n");
      out.write("                width: 350px;\n");
      out.write("                height: 25px;\n");
      out.write("                padding: 7px;\n");
      out.write("                box-shadow: 0px 0px 25px pink;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                background-color: pink;\n");
      out.write("                border: none;\n");
      out.write("                flex-direction: column;\n");
      out.write("            }\n");
      out.write("            input:hover{\n");
      out.write("                background-color:blanchedalmond;\n");
      out.write("                box-shadow: 0px 0px 20px;\n");
      out.write("            }\n");
      out.write("            div{\n");
      out.write("               display: flex;\n");
      out.write("               align-items: center;\n");
      out.write("               justify-content: center;\n");
      out.write("               flex-direction: column;\n");
      out.write("               gap:15px\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            button{\n");
      out.write("                width: 125px;\n");
      out.write("                height: 40px;\n");
      out.write("                background-color:blue;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            button:hover{\n");
      out.write("                background-color:cadetblue;\n");
      out.write("                box-shadow: 0px 0px 20px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("              \n");
      out.write("             \n");
      out.write("        <h1>😔 Result 😔</h1>\n");
      out.write("        <form method=\"post\">\n");
      out.write("        <input type=\"text\" name=\"name\" placeholder=\"Enter the Name\"/></br>\n");
      out.write("        <input type=\"text\" name=\"mobile\" placeholder=\"Enter the Mobile\"/></br>\n");
      out.write("        <input type=\"text\" name=\"email\" placeholder=\"Enter the email\"/></br>\n");
      out.write("        <input type=\"text\" name=\"password\" placeholder=\"Enter the password\"/></br>\n");
      out.write("        <button type=\"submit\">Submit</button>\n");
      out.write("        </form>\n");
      out.write("       \n");
      out.write("        ");

             String name = request.getParameter("name");
             String mobile=request.getParameter("mobile");
             String email = request.getParameter("email");
             String password = request.getParameter("password");
             
            try{
            
           java.sql.Connection connection = Data.Connector.getConnection();
           java.sql.PreparedStatement statement = connection.prepareStatement("INSERT INTO data(name,mobile,email,password) VALUES (?,?,?,?)");           
           
           statement.setString(1, name);
           statement.setString(2, mobile);
           statement.setString(3, email);
           statement.setString(4 ,password);
           statement.execute();

        } catch (Exception e) {
          
        }
        
      out.write("\n");
      out.write("        \n");
      out.write("            \n");
      out.write("    </body>\n");
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
