package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class sign_002dup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");

String Fname=request.getParameter("Fname");
String Lname=request.getParameter("Lname");
String DOB=request.getParameter("DOB");
String Age=request.getParameter("Age");
String Sex=request.getParameter("Gender");
String phoneno=request.getParameter("PhoneNo");
String Qualification=request.getParameter("degree");
String password=request.getParameter("Repassword");
String email=request.getParameter("email");
String course=request.getParameter("course");
int Ageint=Integer.parseInt(Age);
try
{
	Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ocms","root",""); 
PreparedStatement stmt=conn.prepareStatement("insert into signup values(?,?,?,?,?,?,?,?,?,?)");
stmt.setString(1,Fname);
stmt.setString(2,Lname);
stmt.setString(3, DOB);
stmt.setInt(4,Ageint);
stmt.setString(5,Sex);
stmt.setString(6,phoneno);
stmt.setString(7,Qualification);
stmt.setString(8,email);
stmt.setString(9,course);
stmt.setString(10,password);
stmt.executeUpdate();
String li="login.html";
response.sendRedirect(li);
}
catch(Exception e)
{
	out.println("error"+e);
}

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
