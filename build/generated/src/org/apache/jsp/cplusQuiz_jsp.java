package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class cplusQuiz_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/quiz.css\">\n");
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
      out.write(".nn{\n");
      out.write("    float:right;\n");
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
      out.write("<li><a href=\"cplusQuiz.jsp\" class=\"active\">Quiz</a></li>\n");
      out.write("<li>  <a href=\"cplusCourseMaterial.jsp\">Course Material</a><li>\n");
      out.write("<li> <a href=\"cplusCourseVideo.jsp\">Course Videos</a></li>\n");
      out.write("<li>  <a href=\"cp.html\">Complier</a></li>\n");
      out.write("<li class=\"nn\">  <a href=\"index.html\"><b>Logout</b></a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<div class=\"but\">\n");
      out.write("    <input type=\"submit\" class=\"button\" name=\"q1\" value=\"Quiz1\"><br><br>\n");
      out.write("    <input type=\"submit\" class=\"button\" name=\"q1\" value=\"Quiz2\"><br><br>\n");
      out.write("    <input type=\"submit\" class=\"button\" name=\"q1\" value=\"Quiz3\"><br><br>\n");
      out.write("    <input type=\"submit\" class=\"button\" name=\"q1\" value=\"Quiz4\"><br><br>\n");
      out.write("    <input type=\"submit\" class=\"button\" name=\"q1\" value=\"Quiz5\">\n");
      out.write("</div>\n");
      out.write("<h2>Welcome to Quiz section</h2>\n");
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
if(input.equals("Quiz1"))
               {
               
      out.write("    \n");
      out.write("               <style>\n");
      out.write("                   .but\n");
      out.write("                {\n");
      out.write("                 height:1350px;\n");
      out.write("                }\n");
      out.write("                   </style>\n");
      out.write("\n");
      out.write("    <form action=\"#\" method=\"post\">\n");
      out.write("        <h1>Quiz1</h1>\n");
      out.write("<p>1. Which of the following is the correct syntax of including a user defined header files in C++?<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"#include <userdefined.h>\">#include <userdefined.h><br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"#include <userdefined>\">#include <userdefined><br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"#include “userdefined”\">#include “userdefined”<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"#include [userdefined]\">#include [userdefined]<br/></p>\n");
      out.write("<p>2. Which of the following is a correct identifier in C++?<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"7var_name\">7var_name<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"7VARNAME\">7VARNAME<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"VAR_1234\">VAR_1234<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"$var_name\">$var_name<br/></p>\n");
      out.write("<p>3. Which of the following is called address operator?<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"*\">*<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"&\">&<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"_\">_<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"%\">%<br/></p>\n");
      out.write("<p>4. Which of the following is used for comments in C++?<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"// comment\">// comment<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"/* comment */\">/* comment */<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"both // comment or /* comment */\">both // comment or /* comment */<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"// comment */\">// comment */<br/></p>\n");
      out.write("<p>5. What are the actual parameters in C++?<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"Parameters with which functions are called\">Parameters with which functions are called<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"Parameters which are used in the definition of a function\">Parameters which are used in the definition of a function<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"Variables other than passed parameters in a function\">Variables other than passed parameters in a function<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"Variables that are never used in the function\">Variables that are never used in the function<br/></p>\n");
      out.write("<p>6. What are the formal parameters in C++?<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"Parameters with which functions are called\">Parameters with which functions are called<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"Parameters which are used in the definition of the function\">Parameters which are used in the definition of the function<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"Variables other than passed parameters in a function\">Variables other than passed parameters in a function<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"Variables that are never used in the function\">Variables that are never used in the function<br/></p>\n");
      out.write("<p>7. Which function is used to read a single character from the console in C++?<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"cin.get(ch)\">cin.get(ch)<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"getline(ch)\">getline(ch)<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"read(ch)\">read(ch)<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"scanf(ch)\">scanf(ch)<br/></p>\n");
      out.write("<p>8. Which function is used to write a single character to console in C++?<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"cout.put(ch)\">cout.put(ch)<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"cout.putline(ch)\">cout.putline(ch)<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"write(ch)\">write(ch)<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"printf(ch)\">printf(ch)<br/></p>\n");
      out.write("<p>9. What are the escape sequences?<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"Set of characters that convey special meaning in a program\">Set of characters that convey special meaning in a program<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"Set of characters that whose use are avoided in C++ programs\">Set of characters that whose use are avoided in C++ programs<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"Set of characters that are used in the name of the main function of the program\">Set of characters that are used in the name of the main function of the program<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"Set of characters that are avoided in cout statements\">Set of characters that are avoided in cout statements<br/>\n");
      out.write("</p>\n");
      out.write("<p>10. Who created C++?<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"Bjarne Stroustrup\">Bjarne Stroustrup<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"Dennis Ritchie\">Dennis Ritchie<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"Ken Thompson\">Ken Thompson<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"Brian Kernighan\">Brian Kernighan<br/>\n");
      out.write("</p>\n");
      out.write("<input type=\"hidden\" value=\"");
out.print(input);
      out.write("\" name=\"ans\" class=\"but1\">\n");
      out.write("<input type=\"submit\" value=\"Send\" name=\"q1\" class=\"but1\"></a>\n");
      out.write("<input type=\"reset\" value=\"Clear\" class=\"but1\">         \n");
      out.write("</form>\n");
      out.write("\n");
      out.write("     ");

                  
         }

if(input.equals("Send"))
               {
                   String q1=null;
                   String q2=null;
                   String q3=null;
                   String q4=null;
                   String q5=null;
                   String q6=null;
                   String q7=null;
                   String q8=null;
                   String q9=null;
                   String q10=null;
                   q1=request.getParameter("1");
                   q2=request.getParameter("2");
                   q3=request.getParameter("3");
                   q4=request.getParameter("4");
                   q5=request.getParameter("5");
                   q6=request.getParameter("6");
                   q7=request.getParameter("7");
                   q8=request.getParameter("8");
                   q9=request.getParameter("9");
                   q10=request.getParameter("10");
                   String ans=request.getParameter("ans");
                    int count=0;
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ocms","root","");
PreparedStatement stmt=conn.prepareStatement("select * from cplusquiz where qus=?");
stmt.setString(1, ans);
ResultSet rs=stmt.executeQuery();
while(rs.next())
{
	if(q1.equals(rs.getString("qone")))
	{
		count=count+1;
	}
		if(q2.equals(rs.getString("qtwo")))
	{
		count=count+1;
	}
			if(q3.equals(rs.getString("qthree")))
	{
		count=count+1;
	}
				if(q4.equals(rs.getString("qfour")))
	{
		count=count+1;
	}
				if(q5.equals(rs.getString("qfive")))
	{
		count=count+1;
	}			if(q6.equals(rs.getString("qsix")))
	{
		count=count+1;
	}			if(q7.equals(rs.getString("qseven")))
	{
		count=count+1;
	}			if(q8.equals(rs.getString("qeight")))
	{
		count=count+1;
	}			if(q9.equals(rs.getString("qnine")))
	{
		count=count+1;
	}			if(q10.equals(rs.getString("qten")))
	{
		count=count+1;
	}
	if(count<=7)
	{
		out.println("<h1>sorry DUDE........you.....Failed...try another attempt "+count+"</h1>");
	}
	else{
		out.println("<h1>Congratulations......!!!! you passed buddy "+count+"</h1>");
	}
}
}
catch(Exception e)
{
	out.println("error"+e);
}         
               
               
               }
if(input.equals("Quiz2"))
               {
               
      out.write("    \n");
      out.write("              <style>\n");
      out.write("                   .but\n");
      out.write("                {\n");
      out.write("                 height:1350px;\n");
      out.write("                }\n");
      out.write("                   </style>\n");
      out.write("                 <form action=\"#\" method=\"post\">\n");
      out.write("                       <h1>Quiz2</h1>\n");
      out.write("<p>1. Which of the following escape sequence represents carriage return?<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"\\r\">\\r<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"\\n\">\\n<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"\\n\\r\">\\n\\r<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"\\c\">\\c<br/></p>\n");
      out.write("<p>2. Which of the following escape sequence represents tab?<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"\\t\">\\t<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"\\t\\r\">\\t\\r<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"\\b\">\\b<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"\\a\">\\a<br/></p>\n");
      out.write("<p>3. Which of the following is called insertion/put to operator?<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"<<\"> <<    <br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\">>\"> >>    <br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\">\">  >     <br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"<\">  <     <br/></p>\n");
      out.write("<p>4. Which of the following is called extraction/get from operator?<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"<<\"><< <br/> \n");
      out.write("<input type=\"radio\" name=\"4\" value=\">>\"> >>    <br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\">\">  >     <br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"<\">  <     <br/></p>\n");
      out.write("<p>5. A language which has the capability to generate new data types are called ________________<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"Extensible\">Extensible <br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"Overloaded\">Overloaded  <br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"Encapsulated\">Encapsulated <br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"Reprehensible\">Reprehensible <br/></p> \n");
      out.write("<p>6. Wrapping data and its related functionality into a single entity is known as _____________<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"Abstraction\">Abstraction<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"Encapsulation\">Encapsulation<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"Polymorphism\">Polymorphism<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"Modularity\">Modularity<br/>\n");
      out.write("<p>7. How structures and classes in C++ differ?<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"In Structures, members are public by default whereas, in Classes, they are private by default\">In Structures, members are public by default whereas, in Classes, they are private by default<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"In Structures, members are private by default whereas, in Classes, they are public by default\">In Structures, members are private by default whereas, in Classes, they are public by default<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"Structures by default hide every member whereas classes do not\">Structures by default hide every member whereas classes do not<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"Structures cannot have private members whereas classes can have\"> Structures cannot have private members whereas classes can have<br/></p>\n");
      out.write("<p>8. What does polymorphism in OOPs mean?<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"Concept of allowing overiding of functions\">Concept of allowing overiding of functions<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"Concept of hiding data\">Concept of hiding data<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"Concept of keeping things in differnt modules/files\">Concept of keeping things in differnt modules/files<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"Concept of wrapping things into a single unit\">Concept of wrapping things into a single unit<br/>\n");
      out.write("<p>9. Which concept allows you to reuse the written code?<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"Encapsulation\">Encapsulation<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"Abstraction\">Abstraction<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"Inheritance\">Inheritance<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"Polymorphism\">Polymorphism<br/></p>\n");
      out.write("<p>10. Which of the following shows multiple inheritances?<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"A->B->C\">A->B->C<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"A->B; A->C\">A->B; A->C<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"A,B->C\">A,B->C<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"B->A\">B->A<br/></p>\n");
      out.write("<input type=\"hidden\" value=\"");
out.print(input);
      out.write("\" name=\"ans\" class=\"but1\">\n");
      out.write("<input type=\"submit\" value=\"Send\" name=\"q1\" class=\"but1\">\n");
      out.write("<input type=\"reset\" value=\"Clear\" class=\"but1\" name=\"s1\">         \n");
      out.write("  </form>\n");
      out.write("                    ");

               }  
if(input.equals("Quiz3"))
               {
               
      out.write("    \n");
      out.write("               <style>\n");
      out.write("                   .but\n");
      out.write("                {\n");
      out.write("                 height:1350px;\n");
      out.write("                }\n");
      out.write("                   </style>\n");
      out.write("                   <form action=\"#\" method=\"post\">\n");
      out.write("                       <h1>Quiz3</h1>\n");
      out.write("<p>1. How access specifiers in Class helps in Abstraction?<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">They does not helps in any way<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"They allows us to show only required things to outer world\">They allows us to show only required things to outer world<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">They help in keeping things together<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">Abstraction concept is not used in classes<br/>\n");
      out.write("<p>2. C++ is ______________<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">a) procedural programming language<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">b) object oriented programming language<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">c) functional programming language<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"both procedural and object oriented programming language\">both procedural and object oriented programming language<br/></p>\n");
      out.write("<p>3. What does modularity mean?<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">Hiding part of program<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"Subdividing program into small independent parts\">Subdividing program into small independent parts<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">Overriding parts of program<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">Wrapping things into single unit<br/></p>\n");
      out.write("<p>4. What happens when objects s1 and s2 are added?<br/>\n");
      out.write("<b>string s1 = \"Hello\";</b>\n");
      out.write("<b>string s2 = \"World\";</b>\n");
      out.write("<b>string s3 = (s1+s2).substr(5);</b><br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">Error because s1+s2 will result into string and no string has substr() function<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">Segmentation fault as two string cannot be added in C++<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"The statements runs perfectly\">The statements runs perfectly<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">Run-time error<br/></p>\n");
      out.write("<p>5. What is operator overloading in C++?<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">Overriding the operator meaning by the user defined meaning for user defined data type\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">Redefining the way operator works for user defined types\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">Ability to provide the operators with some special meaning for user defined data type\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"All of the mentioned\">All of the mentioned\n");
      out.write("<p>6. What is the syntax of overloading operator + for class A?<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"A operator+(argument_list){}\">A operator+(argument_list){}<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">A operator[+](argument_list){}<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">int +(argument_list){}<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">int [+](argument_list){}<br/></p>\n");
      out.write("<p>7. How many approaches are used for operator overloading?<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">1<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">2<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"3\">3<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">4<br/></p>\n");
      out.write("<p>8. Which of the following operator cannot be overloaded?<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">+<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"?:\">?:<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">–<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">%<br/></p>\n");
      out.write("<p>9. Which of the following operator can be overloaded?<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">?:<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">::<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">.<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"==\">==<br/></p>\n");
      out.write("<p>10. Which of the following operator cannot be used to overload when that function is declared as friend function?<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">-=<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">||<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">==<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"[]\">[]<br/></p>\n");
      out.write("<input type=\"hidden\" value=\"");
out.print(input);
      out.write("\" name=\"ans\" class=\"but1\">\n");
      out.write("<input type=\"submit\" value=\"Send\" name=\"q1\" class=\"but1\">\n");
      out.write("<input type=\"reset\" value=\"Clear\" class=\"but1\" name=\"s1\">         \n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");

               } 
if(input.equals("Quiz4"))
               {
               
      out.write("    \n");
      out.write("               <style>\n");
      out.write("                   .but\n");
      out.write("                {\n");
      out.write("                 height:2200px;\n");
      out.write("                }\n");
      out.write("                   </style>\n");
      out.write("                <form action=\"#\" method=\"post\">\n");
      out.write("                   <h1>Quiz4</h1>\n");
      out.write("<p>1. In case of non-static member functions how many maximum object arguments a unary operator overloaded function can take?<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">1<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">2<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">3<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"0\">0<br/></p>\n");
      out.write("<p>2. In case of non-static member functions how many maximum object arguments a binary operator overloaded function can take?<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">1<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">2<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">3<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"0\">0<br/></p>\n");
      out.write("<p>3. In the case of friend operator overloaded functions how many maximum object arguments a unary operator overloaded function can take?<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"1\">1<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">2<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">3<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">0<br/></p>\n");
      out.write("<p>4. In the case of friend operator overloaded functions how many maximum object arguments a binary operator overloaded function can take?<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">1<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"2\">2<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">3<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">0<br/>\n");
      out.write("<p>5. What is a binary operator?<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">Operator that performs its action on a single operand<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"Operator that performs its action on two operand\">Operator that performs its action on two operand<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">Operator that performs its action on three operand<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">Operator that performs its action on any number of operands<br/></p>\n");
      out.write("<p>6. Which is the correct example of a binary operator?<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">++< br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">—<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">Dereferencing operator(*)<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"+\">+<br/></p>\n");
      out.write("<p>7. Which is the correct example of a unary operator?<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\"> &<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">==<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"—\">—<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">/<br/></p>\n");
      out.write("<p>8. Which is called ternary operator?<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"?:\"> ?:<br/> \n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\"> &&<br/> \n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\"> |||<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\"> === <br/></p>\n");
      out.write("<p>9. Which is the correct statement about operator overloading?<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">Only arithmetic operators can be overloaded<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">Only non-arithmetic operators can be overloaded<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">Precedence of operators are changed after overlaoding<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"Associativity and precedence of operators does not change\">Associativity and precedence of operators does not change<br/></p>\n");
      out.write("<p>10. Pick the incorrect statements out of the following.<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">Operator overloading does not disturbs the precedence of operators<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"Arity of operators can be changed using operator overloading\">Arity of operators can be changed using operator overloading<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">No new operators can be created<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">All of the mentioned<br/></p>\n");
      out.write("<input type=\"hidden\" value=\"");
out.print(input);
      out.write("\" name=\"ans\" class=\"but1\">\n");
      out.write("<input type=\"submit\" value=\"Send\" name=\"q1\" class=\"but1\">\n");
      out.write("<input type=\"reset\" value=\"Clear\" class=\"but1\" name=\"s1\">         \n");
      out.write("</form>\n");
      out.write("                    ");

               }
if(input.equals("Quiz5"))
               {
               
      out.write("    \n");
      out.write("               <style>\n");
      out.write("                   .but\n");
      out.write("                {\n");
      out.write("                 height:2200px;\n");
      out.write("                }\n");
      out.write("                   </style>\n");
      out.write("<form action=\"#\" method=\"post\">\n");
      out.write("                       <h1>Quiz5</h1>\n");
      out.write(" \n");
      out.write("<p>1. What will be the output of the following C++ code?<br/>\n");
      out.write("<b>#include <iostream></b><br/>\n");
      out.write("<b>#include <string></b><br/>\n");
      out.write("<b>using namespace std;</b><br/>\n");
      out.write("<b>class A</b><br/>\n");
      out.write("<b>{static int a;</b><br/>\n");
      out.write(" <b>public:</b><br/>\n");
      out.write("<b>\tvoid show(){</b><br/>\n");
      out.write("<b>a++;</b><br/>\n");
      out.write("<b>cout<<\"a: \"<<a<<endl; </b>\n");
      out.write("<b> }</b> <br/>\n");
      out.write("<b>\tvoid operator.()</b><br/>\n");
      out.write("<b>        {\t\tcout<<\"Objects are added\\n\";\t}</b><br/>\n");
      out.write("<b>};</b><br/>\n");
      out.write("<b>class B</b><br/>\n");
      out.write("<b>{  public: };</b><br/>\n");
      out.write(" <b>int main(int argc, char const *argv[])</b><br/>\n");
      out.write("<b>{ A a1, a2;</b><br/>\n");
      out.write("<b>\treturn 0; }</b><br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">Run-time Error<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">Runs perfectly<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">Segmentation fault<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"Compile-time error\">Compile-time error<br/></p>\n");
      out.write("\n");
      out.write("<p>2. What is the use of function call operator?<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\"> overloading the methods<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"overloading the objects\">overloading the objects<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">overloading the parameters<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">overloading the string<br/></p>\n");
      out.write("<p>3. Pick out the correct statement.<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"virtual functions does not give the ability to write a templated function\">virtual functions does not give the ability to write a templated function<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">virtual functions does not give the ability to rewrite a templated function<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">virtual functions does give the ability to write a templated function<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">virtual functions does not give the ability to rewrite a simple function<br/>\n");
      out.write("<p>4. What will happen when the function call operator is overloaded?<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">It will not modify the functions<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">It will modify the functions<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">It will modify the object<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"It will modify the operator to be interpreted\">It will modify the operator to be interpreted<br/></p>\n");
      out.write("<p>5. What is the use of functor?<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"It makes the object “callable” like a function\">It makes the object “callable” like a function<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">It makes the class “callable” like a function<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">It makes the attribute “callable” like a function<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">It makes the argument “callable” like a function<br/></p>\n");
      out.write("<p>6. What is the role of a constructor in classes?<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">To modify the data whenever required<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">To destroy an object<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"To initialize the data members of an object when it is created\">To initialize the data members of an object when it is created<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">To call private functions from the outer world<br/>\n");
      out.write("<p>7. Why constructors are efficient instead of a function init() defined by the user to initialize the data members of an object?<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">Because user may forget to call init() using that object leading segmentation fault<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">Because user may call init() more than once which leads to overwriting values<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">Because user may forget to define init() function<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"All of the mentioned\">All of the mentioned<br/></p>\n");
      out.write("<p>8. What is a copy constructor?<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">A constructor that allows a user to move data from one object to another<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"A constructor to initialize an object with the values of another object\">A constructor to initialize an object with the values of another object<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">A constructor to check the whether to objects are equal or not<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">A constructor to kill other copies of a given object.<br/>\n");
      out.write("<p>9. What happens if a user forgets to define a constructor inside a class?<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">Error occurs<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">Segmentation fault<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">Objects are not created properly<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"Compiler provides a default constructor to avoid faults/errors\">Compiler provides a default constructor to avoid faults/errors<br/></p>\n");
      out.write("<p>10. How many parameters does a default constructor require?<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">1<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">2<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"0\">0<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">3<br/></p>\n");
      out.write("<input type=\"hidden\" value=\"");
out.print(input);
      out.write("\" name=\"ans\" class=\"but1\">\n");
      out.write("<input type=\"submit\" value=\"Send\" name=\"q1\" class=\"but1\"/>\n");
      out.write("<input type=\"reset\" value=\"Clear\" class=\"but1\" name=\"s1\">         \n");
      out.write("</form>\n");
      out.write("              ");

               } 


}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}

      out.write("\n");
      out.write("           </div>\n");
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
