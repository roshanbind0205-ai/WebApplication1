package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sessionAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            input{\n");
      out.write("                width:300px;\n");
      out.write("                height: 40px;\n");
      out.write("                border-radius: 30px;\n");
      out.write("                box-shadow: 0px 0px 7px;\n");
      out.write("            }\n");
      out.write("            button{\n");
      out.write("                width: 200px;\n");
      out.write("                height: 50px;\n");
      out.write("                border-radius: 30px;\n");
      out.write("                box-shadow: 0px 0px 7px;\n");
      out.write("                background-color:highlighttext;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
session.setAttribute("name", "Roshan");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <center>\n");
      out.write("                <form method=\"post\">\n");
      out.write("            <h2>Login Page</h2>\n");
      out.write("            <h4>Enter access password to continue</h4>\n");
      out.write("            <input type=\"text\" name=\"user_name\" placeholder=\"user_name\"/>\n");
      out.write("            <br><br>\n");
      out.write("            <input type=\"text\"  name=\"password\" placeholder=\"password\"/>\n");
      out.write("            <br><br>\n");
      out.write("            <button type=\"Submit\">Submit</button>\n");
      out.write("            </form>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");

             String user_name = request.getParameter("user_name");
             String password = request.getParameter("password");
             
              
            try{
            
           java.sql.Connection connection = Data.Connector.getConnection();
           java.sql.PreparedStatement statement = connection.prepareStatement("select * from login where user_name=? AND password=?");           
           
           statement.setString(1, user_name);
           statement.setString(2 ,password);
           java.sql.ResultSet rs= statement.executeQuery();
           
           if(rs.next()){
               out.println("correct");
               session.setAttribute("user_name",user_name);
               session.setAttribute("password", password);
           }
           else{
               out.println("incorrect");
           }
        } catch (Exception e) {
          
        }

             
        
      out.write("\n");
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
