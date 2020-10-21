package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<body  text =\"blue\">\r\n");
      out.write("<form method=\"post\" action=\"LoginIndex.html\">\r\n");
      out.write("\r\n");
      out.write("\r\n");

String ValidUser=request.getParameter("Fname");
String ValidPass=request.getParameter("Repassword");
try
{   
Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ocms","root","");
PreparedStatement stmt=conn.prepareStatement("select *from signup where firstname=? and password=? ");
stmt.setString(1,ValidUser);
stmt.setString(2, ValidPass);
ResultSet rs=stmt.executeQuery();
if(rs.next())
{
	String course=rs.getString("course");
	if(course.equals("C"))
	{
	String li="../c/cindex.html";
	response.sendRedirect(li);
	}
	else if(course.equals("C++"))
	{
	String li="c/cplusindex.html";
	response.sendRedirect(li);
	}
	else if(course.equals("Java"))
	{
	String li="java/javaindex.html";
	response.sendRedirect(li);
	}
}
else
{
	String el="invalid.html";
	response.sendRedirect(el);
}

}
catch(Exception e)
{
	out.println("error"+e);
}

      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
