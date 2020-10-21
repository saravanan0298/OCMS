package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class javaquiz_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<li><a href=\"cindex.html\">Java</a></li>\n");
      out.write("<li><a href=\"javaquiz.jsp\" class=\"active\">Quiz</a></li>\n");
      out.write("<li>  <a href=\"ccourseMaterial.jsp\">Course Material</a><li>\n");
      out.write("<li> <a href=\"cv.html\">Course Videos</a></li>\n");
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
      out.write("<p>1. Java programs are<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">Faster than others<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"Platform independent\">Platform independent<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">Not reusable<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">Not scalable<br/></p>\n");
      out.write("\n");
      out.write("<p>2. Java has its origin in\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">C programming language<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">PERRL<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">COBOL<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"Oak programming language\">Oak programming language<br/></p>\n");
      out.write("\n");
      out.write("<p>3. Which one of the following is true for Java<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"Java is object-oriented and interpreted\">Java is object-oriented and interpreted<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">Java is efficient and faster than C<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">Java is the choice of everyone.<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">Java is not robust.<br/></p>\n");
      out.write("\n");
      out.write("<p>4. The command javac is used to<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">debug a java program<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"compile a java program\">compile a java program<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">interpret a java program<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">execute a java program<br/></p>\n");
      out.write("\n");
      out.write("<p>5. Java servlets are an efficient and powerful solution for creating ………….. for the web.<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"Dynamic content\">Dynamic content<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">Static content<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">Hardware<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">Both a and b<br/></p>\n");
      out.write("\n");
      out.write("<p>6. Filters were officially introduced in the Servlet ……………… specification.<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">2.1<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"2.3\">2.3<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">2.2<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">2.4<br/></p>\n");
      out.write("\n");
      out.write("<p>7. Which is the root class of all AWT events<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">java.awt.ActionEvent<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"java.awt.AWTEvent\">java.awt.AWTEvent<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">java.awt.event.AWTEvent<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">ava.awt.event.Event<br/></p>\n");
      out.write("\n");
      out.write("<p>8. OOP features are<br/>\n");
      out.write("i) Increasing productivity ii) Reusability<br/>\n");
      out.write("iii) Decreasing maintenance cost iv) High vulnerability<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">1,2 & 4<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"1,2 & 3\">1,2 & 3<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">1, 2 & 4<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">none of the above<br/></p>\n");
      out.write("\n");
      out.write("<p>9. break statement is used to<br/>\n");
      out.write("i) get out of method ii) end a program<br/>\n");
      out.write("iii) get out of a loop iv) get out of the system<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">1 & 2<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">1,2 & 3<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">1 & 3<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"3\">3<br/></p>\n");
      out.write("\n");
      out.write("<p>10. Native-protocol pure Java converts ……….. into the ………… used by DBMSs directly.<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"JDBC calls, network protocol\">JDBC calls, network protocol<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">ODBC class, network protocol<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">ODBC class, user call<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">JDBC calls, user call<br/></p>\n");
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
PreparedStatement stmt=conn.prepareStatement("select * from javaquiz where qus=?");
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
      out.write("<p>1. The JDBC-ODBC bridge allows ……….. to be used as ………..<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">JDBC drivers, ODBC drivers<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">Drivers, Application<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"ODBC drivers, JDBC drivers\">ODBC drivers, JDBC drivers<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">Application, drivers<br/></p>\n");
      out.write("\n");
      out.write("<p>2. Which of the following is true about Java.<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">Java does not support overloading.<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">Java has replaced the destructor function of C++<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">There are no header files in Java.<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"All of the above.\">All of the above.<br/></p>\n");
      out.write("\n");
      out.write("<p>3. ……………. are not machine instructions and therefore, Java interpreter generates machine code that can be directly executed by the machine that is running the Java program.<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">Compiled Instructions<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">Compiled code<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"byte code\">byte code<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">Java mid code<br/></p>\n");
      out.write("\n");
      out.write("<p>4. The command javac<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">Converts a java program into binary code<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"Converts a java program into bytecode\">Converts a java program into bytecode<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">Converts a java program into machine language<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">None of the above.<br/></p>\n");
      out.write("\n");
      out.write("<p>5. Which of the following is not the Java primitive type<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">Byte<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">Float<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">Character<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"Long double\">Long double<br/></p>\n");
      out.write("\n");
      out.write("<p>6. Command to execute compiled java program is<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"java\">java<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">javac<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">run<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">javaw<br/></p>\n");
      out.write("\n");
      out.write("<p>7. Java Servlet<br/>\n");
      out.write("<b>i) is a key component of server-side Java development</b><br/>\n");
      out.write("<b>ii) is a small pluggable extension to a server that enhances functionality</b><br/>\n");
      out.write("<b>iii) runs only in Windows Operating System</b><br/>\n");
      out.write("<b>iv) allows developers to customize any java enabled server</b><br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">i, ii & iii are true<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">i, iii & iv are true<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">ii, iii & iv are true<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"i, ii & iv are true\">i, ii & iv are true<br/></p>\n");
      out.write("\n");
      out.write("<p>8. Inner classes are<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">anonymous classes<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"nested classes\">nested classes<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">subclasses<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">derived classes<br/></p>\n");
      out.write("\n");
      out.write("<p>9. How many times does the following code segment execute<br/>\n");
      out.write("<b>int x=1, y=10, z=1;</b><br/>\n");
      out.write("<b>do{y–; x++; y-=2; y=z; z++} while (y>1 && z<10);</b><br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"1\">1<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">10<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">5<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">infinite<br/></p>\n");
      out.write("\n");
      out.write("<p>10. State whether the following statement is true or false for EJB.<br/>\n");
      out.write("<b>1. EJB exists in the middle-tier</b><br/>\n");
      out.write("<b>2. EJB specifies an execution environment</b><br/>\n");
      out.write("<b>3. EJB supports transaction processing</b><br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"1-true, 2. true, 3. true\">1-true, 2. true, 3. true<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">1- true, 2. false, 3. true<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">1- false, 2- false, 3- false<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">1-true, 2-true, 3-false<br/></p>\n");
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
      out.write("<p>1.A ……… an object cannot be modified after it is created.<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">double<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">int<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"string\">string<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">main<br/></p>\n");
      out.write("\n");
      out.write("<p>2. ……… is a special member function.<br/>\n");
      out.write("\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">method<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">class<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">use defined function<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"constructor\">constructor<br/></p>\n");
      out.write("\n");
      out.write("<p>3. A …….. class may not have any abstract method.<br/>\n");
      out.write("\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">abstract<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">static<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"final\">final<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">public<br/></p>\n");
      out.write("\n");
      out.write("<p>4. Keyword ………. is always a reference to the object.<br/>\n");
      out.write("\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">new<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"this\">this<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">invoke<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">class<br/></p>\n");
      out.write("<p>5. ……… operators are overloaded for string objects?<br/>\n");
      out.write("\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">-,+<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"+,=\">+,=<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\"><<,>><br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">++,–<br/></p>\n");
      out.write("\n");
      out.write("<p>6. ……. is a small unit of a process.<br/>\n");
      out.write("\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">method<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"thread\">thread<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">applet<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">steam<br/></p>\n");
      out.write("<p>7. ……. is valid for if statement?<br/>\n");
      out.write("\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\"> An integer expression<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"A Boolean expression\"> A Boolean expression<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">A character expression<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">A legal expression<br/></p>\n");
      out.write("\n");
      out.write("<p>8. A wrapper class is a wrapper around a ……. data type.<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">normal<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">central<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"primitive\">primitive<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">concrete<br/></p>\n");
      out.write("\n");
      out.write("<p>9. …….. statement is valid for array declaration.<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">int number();<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">float number();<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"float number[];\">float number[];<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">count int[];<br/></p>\n");
      out.write("\n");
      out.write("<p>10. ……. operators which concatenates two strings.<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"+\">+<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">++<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">–<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">+-<br/></p>\n");
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
      out.write("<p>1. Which of the following statement is/are true?<br/>\n");
      out.write("<b>i) The name of a java program file must match the name of the class with the extension .java</b><br/>\n");
      out.write("<b>ii) Two methods cannot have the same name in java</b><br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"i- only\">i- only<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">ii- only<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">Both I and ii<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">None of the above<br/></p>\n");
      out.write("\n");
      out.write("<p>2. Which of the following represent(s) of a hexadecimal number?<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"570\">570<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">(hex)5<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">0X9F<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">0X5<br/></p>\n");
      out.write("\n");
      out.write("<p>3. …….. can appear only wherein the body of a Java method.<br/></p>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">definition<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"declaration\">declaration<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">determine<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">package<br/></p>\n");
      out.write("\n");
      out.write("<p>4. State whether the following statement is True or False?<br/>\n");
      out.write("<b>i) The modulus operator(%) can be used only with integer operands</b><br/>\n");
      out.write("<b>ii) Declarations can appear anywhere in the body of a Java method</b><br/>\n");
      out.write("\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">i-True, ii-False<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"i-False, ii-True\">i-False, ii-True<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">i-True, ii-True<br/>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"123\">i-False, ii-False<br/></p>\n");
      out.write("\n");
      out.write("<p>5. Which of the following will produce a value of 22 if x=22.9?<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">ceil(x)<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">round(x)<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"int(x)\">int(x)<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">abs(x)<br/></p>\n");
      out.write("\n");
      out.write("<p>6. …….. is passed to a method by use of call by reference.<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">Variables<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"Objects\">Objects<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">Methods<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">Operators<br/></p>\n");
      out.write("\n");
      out.write("<p>7. What will be the output of below program?<br/>\n");
      out.write("<b>public class Test {</b><br/>\n");
      out.write("<b>public static void main(String[] args){</b></br>\n");
      out.write("<b>String x = \"abc\";String y = \"abc\";</b><br/>\n");
      out.write("<b>x.concat(y);</b><br/>\n");
      out.write("<b>System.out.print(x);}}</b><br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">abcabc<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"abc\">abc<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">null<br/></p>\n");
      out.write("<p>8. What will be the output of below program?<br/>\n");
      out.write("<b>public class Test {</b><br/>\n");
      out.write("<b>public static String toString(){</b><br/>\n");
      out.write("<b>System.out.println(\"Test toString called\");</b><br/>\n");
      out.write("<b>return \"\";}</b><br/>\n");
      out.write("<b>public static void main(String args[]){</b><br/>\n");
      out.write("<b>System.out.println(toString());}}</b><br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">\"Test toString called\"<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"Compile time error\">Compile time error<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">\"Test@7fh2bd8\" (Object class toString() method is being called)<br/></p>\n");
      out.write("\n");
      out.write("<p>9. What will be the output of below program?<br/>\n");
      out.write("<b>public class Test {</b><br/>\n");
      out.write("<b>public static void main(String[] args) {</b><br/>\n");
      out.write("<b>String s1 = \"abc\";</b><br/>\n");
      out.write("<b>String s2 = \"abc\";</b><br/>\n");
      out.write("<b>System.out.println(\"s1 == s2 is:\" + s1 == s2);}}</b><br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">s1 == s2 is:true<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"false\">false<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">s1 == s2 is:false<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">true<br/></p>\n");
      out.write("<p>10. Which of the following will produce a value of 10 if x=9.7?<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">floor(x)<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">abs(x)<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">rint(x)<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"round(x)\">round(x)<br/></p>\n");
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
      out.write("\n");
      out.write("<p>1.Which of the following are not the methods of the Thread class?<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">yield()<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">sleep(long msec)<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"go()\">go()<br/>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"123\">stop()<br/></p>\n");
      out.write("<p>2.Division operator has ____ precedence over multiplication operator<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">Heighest<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">Least<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"Equal\">Equal<br/>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"123\">None of These<br/></p>\n");
      out.write("<p>3.What is the full form of JVM ?<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">Java Very Large Machine<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">Java Verified Machine<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">Java Very Small Machine<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"Java Virtual Machine\">Java Virtual Machine<br/></p>\n");
      out.write("<p>4.In Java code, the line that begins with /* and ends with */ is known as?<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"Multiline comment\">Multiline comment<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">Single line comment<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">Both A & B<br/>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"123\">None of these<br/></p>\n");
      out.write("<p>5.What will be the output of the program?<br/>\n");
      out.write("<b>try</b><br/> \n");
      out.write("<b>{</b><br/> \n");
      out.write("<b>    int x = 0;  int y = 5 / x;</b><br/> \n");
      out.write("<b>}</b><br/> \n");
      out.write("<b>catch (Exception e) {System.out.println(\"Exception\"); }</b><br/> \n");
      out.write("<b>catch (ArithmeticException ae) {System.out.println(\" Arithmetic Exception\"); }</b><br/> \n");
      out.write("<b>System.out.println(\"finished\");</b><br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">finished<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">Exception<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"Compilation fails.\">Compilation fails.<br/>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"123\">Arithmetic Exception<br/></p>\n");
      out.write("<p>6.What will be the output of the program?<br/>\n");
      out.write("<b>class Equals</b><br>\n");
      out.write("<b>{public static void main(String [] args) </b><br/>\n");
      out.write(" <b>{</b><br/>\n");
      out.write("   <b> int x = 100;  double y = 100.1;</b><br/>\n");
      out.write("    <b>    boolean b = (x = y); </b></br>\n");
      out.write("     <b>   System.out.println(b);    }}</b></br>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">true<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">false<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"Compilation fails\">Compilation fails<br/>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"123\">An exception is thrown at runtime<br/></p>\n");
      out.write("<p>7.What will be the output of the program?<br/>\n");
      out.write("<b>public class vlearn</b><br/>\n");
      out.write("<b>{    public static void main(String[] args)</b><br/> \n");
      out.write("<b>{   try </b><br/>\n");
      out.write("<b>{          return;}</b><br/> \n");
      out.write("<b> finally </b><br/>\n");
      out.write(" <b>  {           System.out.println( \"Finally\" );   } } }</b><br>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"Finally\">Finally\t<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">Compilation fails.<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">The code runs with no output.<br/>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"123\">An exception is thrown at runtime.<br/></p>\n");
      out.write("<p>8.What will be the output of below program?<br/>\n");
      out.write("<b>import java.io.IOException;</b><br/>\n");
      out.write("<b>public class Test {</b>\n");
      out.write("<b>public static void main(String[] args) {</b><br/>\n");
      out.write("<b>try {</b><br/>\n");
      out.write("<b>throw new IOException(\"Hello\");</b><br/>\n");
      out.write("<b>}catch(IOException | Exception e) {</b><br/>\n");
      out.write("<b>System.out.println(e.getMessage());\t}}}</b><br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"Compile time error\">Compile time error<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">Prints \"Hello\"<br/>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"123\">Runtime Error<br/></p>\n");
      out.write("<p>9. What will be output of below program?<br/>\n");
      out.write("<b>public class Test {</b><br/>\n");
      out.write("<b>public void main(String[] args){</b><br/>\t\t\n");
      out.write("<b>int x = 10*20-20;</b><br/>\t\n");
      out.write("<b>System.out.println(x);}}</b><br/>\t\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"Runtime Error\">Runtime Error<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">Prints 180<br/><br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">Prints 0<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"123\">Compile time error.<br/></p>\n");
      out.write("<p>10. What will be the output of the below program?<br/>\n");
      out.write("<b>public class Test{</b><br/>\n");
      out.write("<b>public static void main(String[] args){</b><br/>\t\t\n");
      out.write("<b>char c = 65;</b><br/>\n");
      out.write("<b>System.out.println(\"c = \"+c);} }</b><br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">Compile Time Error<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"Prints \"c = A\"\">Prints \"c = A\"<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">Runtime Error<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"123\">Prints \"c = 65\"<br/></p>\n");
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
