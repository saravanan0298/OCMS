package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class cplusCourseVideo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/quiz.css\">\n");
      out.write("<style>\n");
      out.write("    .nn{\n");
      out.write("    float:right;\n");
      out.write("}\n");
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
      out.write("    height:auto;\n");
      out.write("    padding:80px 40px;\n");
      out.write("    box-sizing:border-box;\n");
      out.write("    background:lightseagreen;\n");
      out.write("}\n");
      out.write(".button\n");
      out.write("{\n");
      out.write("  background-color:#900C3F;\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 10px 22px;\n");
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
      out.write("    left:250px;   \n");
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
      out.write("<li><a href=\"cplusQuiz.jsp\" >Quiz</a></li>\n");
      out.write("<li>  <a href=\"cplusCourseMaterial.jsp\">Course Material</a><li>\n");
      out.write("<li> <a href=\"cplusCourseVideo.html\" class=\"active\">Course Videos</a></li>\n");
      out.write("<li>  <a href=\"cp.html\">Complier</a></li>\n");
      out.write("<li class=\"nn\">  <a href=\"index.html\"><b>Logout</b></a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<div class=\"but\">\n");
      out.write("    <input type=\"submit\" class=\"button\" name=\"q1\" value=\"Basic C++\"><br><br>\n");
      out.write("    <input type=\"submit\" class=\"button\" name=\"q1\" value=\"OOPs\"><br><br>\n");
      out.write("    <input type=\"submit\" class=\"button\" name=\"q1\" value=\"Inheritance\"><br><br>\n");
      out.write("    <input type=\"submit\" class=\"button\" name=\"q1\" value=\"Abstract\"><br><br>\n");
      out.write("    <input type=\"submit\" class=\"button\" name=\"q1\" value=\"Functions\"><br><br>\n");
      out.write("    <input type=\"submit\" class=\"button\" name=\"q1\" value=\"Constructor\"><br><br>\n");
      out.write("    <input type=\"submit\" class=\"button\" name=\"q1\" value=\"Copy Constructor\"><br><br>\n");
      out.write("    <input type=\"submit\" class=\"button\" name=\"q1\" value=\"Destructor\"><br><br>\n");
      out.write("</div>\n");
      out.write("<h2>Welcome to Video section</h2>\n");
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
if(input.equals("Basic C++"))
               {
               
      out.write("    \n");
      out.write("               <style>\n");
      out.write("                   .but\n");
      out.write("                {\n");
      out.write("                 height:700px;\n");
      out.write("                }\n");
      out.write("                   </style>\n");
      out.write("\n");
      out.write("    <form action=\"#\" method=\"post\">\n");
      out.write("<body>\n");
      out.write("<video width=\"900\" controls>\n");
      out.write("<source src=\"Basic c++.mp4\" type=\"video/mp4\">\n");
      out.write("</body>\n");
      out.write("</form>\n");

               }
if(input.equals("OOPs"))
{
 
      out.write("\n");
      out.write(" <style>\n");
      out.write("     .but\n");
      out.write("     {\n");
      out.write("         height:700px;\n");
      out.write("     }\n");
      out.write(" </style>\n");
      out.write(" <form action=\"#\" method=\"post\">\n");
      out.write("<body>\n");
      out.write("<video width=\"900\" controls>\n");
      out.write("<source src=\"Class and Objects.mp4 \" type=\"video/mp4\">\n");
      out.write("</body>\n");
      out.write("</form>\n");
      out.write(" ");

               }
if(input.equals("Inheritance"))
{
 
      out.write("\n");
      out.write(" <style>\n");
      out.write("     .but\n");
      out.write("     {\n");
      out.write("         height:700px;\n");
      out.write("     }\n");
      out.write(" </style>\n");
      out.write(" <form action=\"#\" method=\"post\">\n");
      out.write("<body>\n");
      out.write("<video width=\"900\" controls>\n");
      out.write("<source src=\"Inheritance.mp4 \" type=\"video/mp4\">\n");
      out.write("</body>\n");
      out.write("</form>\n");
      out.write(" ");

               } 
if(input.equals("Abstract"))
{
 
      out.write("\n");
      out.write(" <style>\n");
      out.write("     .but\n");
      out.write("     {\n");
      out.write("         height:700px;\n");
      out.write("     }\n");
      out.write(" </style>\n");
      out.write(" <form action=\"#\" method=\"post\">\n");
      out.write("<body>\n");
      out.write("<video width=\"900\" controls>\n");
      out.write("<source src=\"Abstract Class.mp4 \" type=\"video/mp4\">\n");
      out.write("</body>\n");
      out.write("</form>\n");
      out.write(" ");

               } 
if(input.equals("Functions"))
{
 
      out.write("\n");
      out.write(" <style>\n");
      out.write("     .but\n");
      out.write("     {\n");
      out.write("         height:700px;\n");
      out.write("     }\n");
      out.write(" </style>\n");
      out.write(" <form action=\"#\" method=\"post\">\n");
      out.write("<body>\n");
      out.write("<video width=\"900\" controls>\n");
      out.write("<source src=\"Functions and Its Types.mp4 \" type=\"video/mp4\">\n");
      out.write("</body>\n");
      out.write("</form>\n");
      out.write(" ");

               }
if(input.equals("Constructor"))
{
 
      out.write("\n");
      out.write(" <style>\n");
      out.write("     .but\n");
      out.write("     {\n");
      out.write("         height:700px;\n");
      out.write("     }\n");
      out.write(" </style>\n");
      out.write(" <form action=\"#\" method=\"post\">\n");
      out.write("<body>\n");
      out.write("<video width=\"900\" controls>\n");
      out.write("<source src=\"Constructor.mp4 \" type=\"video/mp4\">\n");
      out.write("</body>\n");
      out.write("</form>\n");
      out.write(" ");

               }
if(input.equals("Copy Constructor"))
{
 
      out.write("\n");
      out.write(" <style>\n");
      out.write("     .but\n");
      out.write("     {\n");
      out.write("         height:700px;\n");
      out.write("     }\n");
      out.write(" </style>\n");
      out.write(" <form action=\"#\" method=\"post\">\n");
      out.write("<body>\n");
      out.write("<video width=\"900\" controls>\n");
      out.write("<source src=\"Copy Constructor.mp4 \" type=\"video/mp4\">\n");
      out.write("</body>\n");
      out.write("</form>\n");
      out.write(" ");

               }
if(input.equals("Destructor"))
{
 
      out.write("\n");
      out.write(" <style>\n");
      out.write("     .but\n");
      out.write("     {\n");
      out.write("         height:700px;\n");
      out.write("     }\n");
      out.write(" </style>\n");
      out.write(" <form action=\"#\" method=\"post\">\n");
      out.write("<body>\n");
      out.write("<video width=\"900\" controls>\n");
      out.write("<source src=\"Destructor.mp4 \" type=\"video/mp4\">\n");
      out.write("</body>\n");
      out.write("</form>\n");
      out.write(" ");

               }
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}

      out.write("\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("\n");
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
