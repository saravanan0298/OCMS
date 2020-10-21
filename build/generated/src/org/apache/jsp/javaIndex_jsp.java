package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class javaIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("#header\n");
      out.write("{\n");
      out.write("background-color:#900C3F;\n");
      out.write("color:white;\n");
      out.write("text-align:center;\n");
      out.write("padding:6px;\n");
      out.write("}\n");
      out.write("#navigation\n");
      out.write("{\n");
      out.write("line-height:100px;\n");
      out.write("background-color:blue;\n");
      out.write("height:500px;\n");
      out.write("width:100px;\n");
      out.write("float:left;\n");
      out.write("padding:5px;\n");
      out.write("}\n");
      out.write("#section\n");
      out.write("{\n");
      out.write("width:600px;\n");
      out.write("padding:10px;\n");
      out.write("}\n");
      out.write("#foot\n");
      out.write("{\n");
      out.write("\tposition: fixed;\n");
      out.write("   left: 0;\n");
      out.write("   bottom: 0;\n");
      out.write("   width: 100%;\n");
      out.write("   background-color:#002475;\n");
      out.write("   color: white;\n");
      out.write("   text-align: center;\n");
      out.write("}\n");
      out.write("ul {\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  overflow: hidden;\n");
      out.write("  border: 1px solid #e7e7e7;\n");
      out.write("  background-color: #f3f3f3;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("  float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("  display: block;\n");
      out.write("  color: #666;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a.active {\n");
      out.write("  color: white;\n");
      out.write("  background-color:#117A65;\n");
      out.write("} \n");
      out.write(".nn\n");
      out.write("{\n");
      out.write("float: right;    \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"header\">\n");
      out.write("<h1>V_LEARN</h1>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("<ul>\n");
      out.write("<li><a class=\"active\" href=\"javaIndex.jsp\">Java</a></li>\n");
      out.write("<li><a href=\"javaquiz.jsp\">Quiz</a></li>\n");
      out.write("<li>  <a href=\"JavaCourseMaterial.jsp\">Course Material</a><li>\n");
      out.write("<li> <a href=\"javaVideo.jsp\">Course Videos</a></li>\n");
      out.write("<li>  <a href=\"http://localhost:8080/\">Complier</a></li>\n");
      out.write("<li class=\"nn\"><a href=\"index.html\"><b>Logout</b></a></li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  <h2>About java course</h2>\n");
      out.write("  <p><b>Java is a general-purpose programming language that is class-based, object-oriented, and designed to have as few implementation dependencies as possible.\n");
      out.write("          It is intended to let application developers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.\n");
      out.write("          Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture.\n");
      out.write("          The syntax of Java is similar to C and C++, but it has fewer low-level facilities than either of them.</p><br>\n");
      out.write("  \n");
      out.write("<p>Java was originally developed by James Gosling at Sun Microsystems (which has since been acquired by Oracle) and released in 1995 as a core component of Sun Microsystems' Java platform.\n");
      out.write("The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses. \n");
      out.write("As of May 2007, in compliance with the specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GNU General Public License. \n");
      out.write("Meanwhile, others have developed alternative implementations of these Sun technologies, such as the GNU Compiler for Java (bytecode compiler), GNU Classpath (standard libraries), and IcedTea-Web (browser plugin for applets).</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"foot\">copyright reserved saravanan0298@gmail.com<div></body>\n");
      out.write("\n");
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
