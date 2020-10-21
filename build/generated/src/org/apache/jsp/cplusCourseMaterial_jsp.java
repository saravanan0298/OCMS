package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import com.servlet.db.DB;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class cplusCourseMaterial_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
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
      out.write("}\n");
      out.write("h2\n");
      out.write("{\n");
      out.write("position:absolute;\n");
      out.write("top:150px;\n");
      out.write("left:560px;\n");
      out.write("}\n");
      out.write(".but\n");
      out.write("{\n");
      out.write("    position:absolute;\n");
      out.write("    top:150px;\n");
      out.write("    left:8px;\n");
      out.write("    width:200px;\n");
      out.write("    height:1350px;\n");
      out.write("    padding:80px 40px;\n");
      out.write("    box-sizing:border-box;\n");
      out.write("    background:lightseagreen;\n");
      out.write("}\n");
      out.write(".button\n");
      out.write("{\n");
      out.write("  background-color:#900C3F;\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 15px 32px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  margin: 4px 2px;\n");
      out.write("  cursor: pointer;  \n");
      out.write("}\n");
      out.write(".set1\n");
      out.write("{\n");
      out.write(" position:absolute;\n");
      out.write("    top:200px;\n");
      out.write("    left:450px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".but1\n");
      out.write("{\n");
      out.write(" background-color:#900C3F;\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 10px 20px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  margin: 4px 2px;\n");
      out.write("  cursor: pointer;     \n");
      out.write("}\n");
      out.write(".nn\n");
      out.write("{\n");
      out.write("float: right;    \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form action=\"\" method=\"post\">\n");
      out.write("<div id=\"header\">\n");
      out.write("<h1>V_LEARN</h1>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("<ul>\n");
      out.write("<li><a href=\"cplusIndex.jsp\">C++</a></li>\n");
      out.write("<li><a href=\"cplusQuiz.jsp\">Quiz</a></li>\n");
      out.write("<li>  <a href=\"cplusCourseMaterial.jsp\" class=\"active\">Course Material</a><li>\n");
      out.write("<li> <a href=\"cplusCourseVideo.jsp\">Course Videos</a></li>\n");
      out.write("<li>  <a href=\"cp.html\">Complier</a></li>\n");
      out.write("<li class=\"nn\">  <a href=\"index.html\"><b>Logout</b></a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<div class=\"but\">\n");
      out.write("    <input type=\"submit\" class=\"button\" name=\"q1\" value=\"Download\"><br><br>\n");
      out.write("</div>\n");
      out.write("<h2>Welcome to Course Download Section</h2>\n");
      out.write("\n");
      out.write("<div id=\"foot\">copyright saravanan0298@gmail.com</div>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<div class=\"set1\">\n");
      out.write("\n");

String input=request.getParameter("q1");
try
{
if(input.equals("Download"))
               {
               
      out.write("    \n");
      out.write("               <style>\n");
      out.write("                   .but\n");
      out.write("                {\n");
      out.write("                 height:1350px;\n");
      out.write("                }\n");
      out.write("                   </style>\n");
      out.write("\n");
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
      out.write("            tr,td,th{\n");
      out.write("                padding: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <br/><br/><br/><br/>\n");
      out.write("    <center>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <table border=\"2\">\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>File Name</th>\n");
      out.write("                <th>Download</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                con=DB.getConnection();
                String sql="select *from cpluscoursematerial";
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()){
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(rs.getInt(1));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                    <td><a href=\"CplusDownloadServlet?fileName=");
      out.print(rs.getString(3));
      out.write("\">Download</a></td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                }
                
      out.write(" \n");
      out.write("        </table><br/>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("    ");
 
               }
}catch(Exception e)
{
    System.out.println(e);
}

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
