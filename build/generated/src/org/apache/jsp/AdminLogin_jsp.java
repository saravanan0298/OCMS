package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\t\t\t\n");
      out.write("<title>V_LEARN</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/login.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"logo\">\n");
      out.write("<img src=\"logo.jpg\">\n");
      out.write("</div>\n");
      out.write("<ul>\n");
      out.write("<li class=\"active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("<li><a href=\"#\">Courses</a></li>\n");
      out.write("<li><a href=\"#\">About Us</a></li>\n");
      out.write("<li><a href=\"#\">Contact</a></li>\n");
      out.write("</ul></br></br></br></br>\n");
      out.write("<pre>                               <h1>LOGIN</h1></pre>\n");
      out.write("<header>\n");
      out.write("<div class=\"Login\">\n");
      out.write("<form method=\"post\" id=\"Login\" action=\"AdminVerify.jsp\">\n");
      out.write("<label>Admin:</label></br>\n");
      out.write("<input type=\"Text\" size=\"25\" placeholder=\"Name\" value=\"admin\" name=\"Fname\" id=\"Name\" required></br></br>\n");
      out.write("<label>Password :</label></br>\n");
      out.write("<input type=\"password\" placeholder=\"password\" name=\"Repassword\" id=\"psw\"  required></br></br>\n");
      out.write("<input type=\"submit\"  value=\"LOGIN\" id=\"submit\">\n");
      out.write("<input  type=\"reset\" value=\"CANCEL\" id=\"clear\">\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</header>\n");
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
