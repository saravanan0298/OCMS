package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class quiz_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<li><a href=\"cindex.html\">C</a></li>\n");
      out.write("<li><a href=\"quiz.jsp\" class=\"active\">Quiz</a></li>\n");
      out.write("<li>  <a href=\"ccourseMaterial.jsp\">Course Material</a><li>\n");
      out.write("<li> <a href=\"ccoursevideo.jsp\">Course Videos</a></li>\n");
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
      out.write("<P>1. \"C\" is designed by ______:<BR>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"Dennis Ritchie\">Dennis Ritchie<BR>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"quatre\">quatre<BR>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"soleil\">soleil<BR>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"poisson\">poisson<BR>\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("<P>2. Which year C introduced ?<BR>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"1972\">1972<BR>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"valise\">valise<BR>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"soleil\">soleil<BR>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"poisson\">poisson<BR>\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("<P>3. C Language developed at _____?<BR>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"Bell Laboratory\">Bell Laboratory<BR>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"valise\">valise<BR>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"soleil\">soleil<BR>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"poisson\">poisson<BR>\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("<P>4. What are the key features of C programming language _____?<BR>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"platform-dependent language\">platform-dependent language\n");
      out.write("<BR>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"C offers the possibility to break down a large program into small modules.\">C offers the possibility to break down a large program into small modules.<BR>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"the possibility of a programmer to control the language.\">the possibility of a programmer to control the language.<BR>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"C comes with support for system programming and hence it compiles and executes with high speed when compared to other high-level languages.\">C comes with support for system programming and hence it compiles and executes with high speed when compared to other high-level languages.<BR>\n");
      out.write("</p>\n");
      out.write("<P>5. “C” was primarily developed as a_____?<BR>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"Systems Programing Language\">Systems Programing Language<BR>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"General Purpose Language\">General Purpose Language<BR>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"Data Processing Language\">Data Processing Language<BR>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"None\">None<BR>\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("<P>6. “C” is a_____?<BR>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"High Level Language\">High Level Language<BR>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"Low Level Language\">Low Level Language<BR>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"High Level Language with some low level features\">High Level Language with some low level features<BR>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"Low level language with some high level features\">Low level language with some high level features<BR>\n");
      out.write("</p>\n");
      out.write("<P>7. Length of the string “Correct” is_____?<BR>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"7\">7<BR>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"8\">8<BR>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"6\">6<BR>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\" Implementation dependent\"> Implementation dependent<BR>\n");
      out.write("</p>\n");
      out.write("<P>8. Most suitable option for  “C” literal is_____?<BR>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"A string\">A string<BR>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"A string constant\">A string constant<BR>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"A character\">A character<BR>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"An alphabet\">An alphabet<BR>\n");
      out.write("</p>\n");
      out.write("<P>9. The “const” feature can be applied to_____?<BR>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"An identifier\">An identifier<BR>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"An array\">An array<BR>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"An array argument\">An array argument<BR>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"All\">All<BR>\n");
      out.write("</p>\n");
      out.write("<P>10. Pick the operator that associate from the right_____?<BR>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"? :\">? :<BR>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"+ =\">+ =<BR>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"=\">=<BR>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"All\">All<BR>\n");
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
PreparedStatement stmt=conn.prepareStatement("select * from cquizone where qus=?");
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
      out.write("                       <p>1.Bitwise operators can operate upon?<br>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"double and chars\">double and chars<br>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"floats and doubles\">floats and doubles<br>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"ints and floats\">ints and floats<br>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"ints and chars\">ints and chars<br></p>\n");
      out.write("<p>2.What is C Tokens?<br>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"The smallest individual units of c program\">The smallest individual units of c program<br>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"The basic element recognized by the compiler\">The basic element recognized by the compiler<br>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"The largest individual units of program\">The largest individual units of program<br>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"A & B Both\">A & B Both<br></p>\n");
      out.write("<p>3. For 16-bit compiler allowable range for integer constants is ______ ?<br>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"-3.4e38 to 3.4e38\">-3.4e38 to 3.4e38<br>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"-32767 to 32768\">-32767 to 32768<br>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"-32768 to 32767\">-32768 to 32767<br>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"-32767 to 32768\">-32668 to 32667<br></p>\n");
      out.write("<p>4. C programs are converted into machine language with the help of<br>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"An Editor\">An Editor<br>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"A compiler\">A compiler<br>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"An operating system\">An operating system<br>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"None of the above\">None of the above<br></p>\n");
      out.write("<p>5. A C variable cannot start with<br>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"An alphabet\">An alphabet<br>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"A number\">A number<br>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"A special symbol other than underscore\">A special symbol other than underscore<br>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"both (b) and (c)\">both (b) and (c)<br></p>\n");
      out.write("<p>6. Which of the following is allowed in a C Arithmetic instruction<br>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"[]\">[]<br>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"{}\">{}<br>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"()\">()<br>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"None of the above\">None of the above<br></p>\n");
      out.write("<p>7. Which of the following shows the correct hierarchy of arithmetic operations in C<br>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"/ + * -\">/ + * -<br>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"* - / +\">* - / +<br>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"+ - / *\">+ - / *<br>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"* / + -\">* / + -<br></p>\n");
      out.write("<p>8. What is an array?<br>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"An array is a collection of variables that are of the dissimilar data type.\">An array is a collection of variables that are of the dissimilar data type.<br>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"An array is a collection of variables that are of the same data type.\">An array is a collection of variables that are of the same data type.<br>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"An array is not a collection of variables that are of the same data type.\">An array is not a collection of variables that are of the same data type.<br>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"None of the above.\">None of the above.<br></p>\n");
      out.write("<p>9. What is right way to Initialization array?<br>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"int num[6] = { 2, 4, 12, 5, 45, 5 } ;\">int num[6] = { 2, 4, 12, 5, 45, 5 } ;<br>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"int n{} = { 2, 4, 12, 5, 45, 5 } ;\">int n{} = { 2, 4, 12, 5, 45, 5 } ;<br>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"int n{6} = { 2, 4, 12 } ;\">int n{6} = { 2, 4, 12 } ;<br>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"int n(6) = { 2, 4, 12, 5, 45, 5 } ;\">int n(6) = { 2, 4, 12, 5, 45, 5 } ;<br></p>\n");
      out.write("<p>10. An array elements are always stored in _________ memory locations.<br>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"Sequential\">Sequential<br>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"Random\">Random<br>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"Sequential and Random\">Sequential and Random<br>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"None of the above\">None of the above<br></p>\n");
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
      out.write("                       <p>1. Which is the right way to declare constant in C?<br>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"int constant var =10;\">int constant var =10;<br>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"int const var = 10;\">int const var = 10;<br>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"const int var = 10;\">const int var = 10;<br>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"B & C Both\">B & C Both<br></p>\n");
      out.write("<p>2. Which operators are known as Ternary Operator?<br>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"::,\">::, ?<br>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"?, :\">?, :<br>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"?, ;;\">?, ;;<br>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"None of the above\">None of the above<br></p>\n");
      out.write("<p>3. In switch statement, each case instance value must be _______?<br>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"Constant\">Constant<br>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"Variable\">Variable<br>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"Symbol\">Symbolc<br>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"None of the above\">None of the above<br></p>\n");
      out.write("<p>4. What is the work of break keyword?<br>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"Halt execution of program\">Halt execution of program<br>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"Restart execution of program\">Restart execution of program<br>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"Exit from loop or switch statement\">Exit from loop or switch statement<br>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"None of the above\">None of the above<br></p>\n");
      out.write("<p>5. What is function?<br>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"Function is a block of statements that perform some specific task.\">Function is a block of statements that perform some specific task.<br>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"Function is the fundamental modular unit. A function is usually designed to perform a specific\n");
      out.write("task.\">Function is the fundamental modular unit. A function is usually designed to perform a specific\n");
      out.write("task.<br>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"Function is a block of code that performs a specific task. It has a name and it is reusable\">Function is a block of code that performs a specific task. It has a name and it is reusable<br>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"All the above\">All the above<br></p>\n");
      out.write("<p>6. Which one of the following sentences is true ?<br>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"The body of a while loop is executed at least once.\">The body of a while loop is executed at least once.<br>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"The body of a do ... while loop is executed at least once.\">The body of a do ... while loop is executed at least once.<br>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"The body of a do ... while loop is executed zero or more times.\">The body of a do ... while loop is executed zero or more times.<br>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"A for loop can never be used in place of a while loop.\">A for loop can never be used in place of a while loop.<br></p>\n");
      out.write("<p>7. A binary tree with 27 nodes has _______ null branches.<br>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"54\">54<br>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"27\">27<br>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"26\">26<br>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"None of the above\">None of the above<br></p>\n");
      out.write("<p>8. Which one of the following is not a linear data structure?<br>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"Array\">Array<br>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"Binary Tree\">Binary Tree<br>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"Queue\">Queue<br>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"Queue\">Stack<br></p>\n");
      out.write("<p>9. Recursive functions are executed in a?<br>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"First In First Out Order\">First In First Out Order<br>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"Load Balancing\">Load Balancing<br>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"Parallel Fashion\">Parallel Fashion<br>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"Last In First Out Order\">Last In First Out Order<br></p>\n");
      out.write("<p>10. The statement print f (\"%d\", 10 ? 0 ? 5 : 1 : 12); will print?<br>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"10\">10<br>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"0\">0<br>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"12\">12<br>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"1\">1<br></p>\n");
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
      out.write("                       <p>1. What will be the output of the following arithmetic expression ?<br>\n");
      out.write("<b>5+3*2%10-8*6</b><br>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"-37\">-37<br>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"-42\">-42<br>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"-32\">-32<br>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"-28\">-28<br></p>\n");
      out.write("<p>2. What will be the output of the following statement ?<br>\n");
      out.write("<b>int a=10; printf(\"%d &i\",a,10);</b><br>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"error\">error<br>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"10\">10<br>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"10 10\">10 10<br>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"none of these\">none of these<br></p>\n");
      out.write("<p>3. What will be the output of the following statement ?<br>\n");
      out.write("<b>printf(\"%X%x%ci%x\",11,10,'s',12);</b><br>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"error\">error<br>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"basc\">basc<br>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"Bas94c\">Bas94c<br>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"none of these\">none of these<br></p>\n");
      out.write("<p>4. What will be the output of the following statements ?<br>\n");
      out.write("<b>int a = 4, b = 7,c; c = a = = b; printf(\"%i\",c);</b><br>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"0\">0<br>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"error\">error<br>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"1\">1<br>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"garbage value\">garbage value<br></p>\n");
      out.write("<p>5. What will be the output of the following statements ?<br>\n");
      out.write("<b>int a = 5, b = 2, c = 10, i = a>b</b><br>\n");
      out.write("<b>void main()</b><br>\n");
      out.write("<b>{ printf(\"hello\"); main(); }</b><br>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"1\">1<br>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"2\">2<br>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"infinite number of times\">infinite number of times<br>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"none of these\">none of these<br></p>\n");
      out.write("<p>6. What will be output if you will compile and execute the following c code?<br>\n");
      out.write("<b>struct marks{</b><br>\n");
      out.write("<b>int p:3;</b></br>\n");
      out.write("<b>int c:3;</b></br>\n");
      out.write("<b>int m:2;</b></br>\n");
      out.write("<b>};</b></br>\n");
      out.write("<b>void main(){</b></br>\n");
      out.write("<b>struct marks s={2,-6,5};</b></br>\n");
      out.write("<b>printf(\"%d %d %d\",s.p,s.c,s.m);</b></br>\n");
      out.write("<b>}</b></br>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"2 -6 5\">2 -6 5<br>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"2 -6 1\">2 -6 1<br>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"2 2 1\">2 2 1<br>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"Compiler error\">Compiler error<br>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"None of these\">None of these<br>\n");
      out.write("<p>7. What will be the output of the following statements ?<br>\n");
      out.write("<b>int x[4] = {1,2,3}; printf(\"%d %d %D\",x[3],x[2],x[1]);</b><br>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"03%D\">03%D<br>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"000\">000<br>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"032\">032<br>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"321\">321<br></p>\n");
      out.write("<p>8.Output of following program?<br>\n");
      out.write("<b>#include <stdio.h></b><br/>\n");
      out.write("<b>int main()</b><br/>\n");
      out.write("<b>{</b><br/>\n");
      out.write("<b>    int i = 5;</b><br>\n");
      out.write("<b>    printf(\"%d %d %d\", i++, i++, i++);</b></br>\n");
      out.write("<b>    return 0;</b></br>\n");
      out.write("<b>}</b></br>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"7 6 5\">7 6 5<br>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"6 7 5\">6 7 5<br>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"5 6 7\">5 6 7<br>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"Compiler Dependent\">Compiler Dependent<br></p>\n");
      out.write("<p>9.In C, parameters are always<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"Passed by value\">Passed by value<br>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"Passed by reference\">Passed by reference<br>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"Non-pointer variables are passed by value and pointers are passed by reference\">Non-pointer variables are passed by value and pointers are passed by reference<br>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"Passed by value result\">Passed by value result<br></p>\n");
      out.write("<p>10.Which of the following is true about return type of functions in C?<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"Functions can return any type\">Functions can return any type<br>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"Functions can return any type except array and functions\">Functions can return any type except array and functions<br>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"Functions can return any type except array, functions and union\">Functions can return any type except array, functions and union<br>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"Functions can return any type except array, functions, function pointer and union\">Functions can return any type except array, functions, function pointer and union<br></p>\n");
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
      out.write(" <p>1. What will be the output of following program ?<br>\n");
      out.write("<b>#include</b><br>\n");
      out.write("<b>main()</b><br>\n");
      out.write("<b>{</b><br>\n");
      out.write("<b>int x,y = 10;</b><br>\n");
      out.write("<b>x = y * NULL;</b><br>\n");
      out.write("<b>printf(\"%d\",x);</b><br>\n");
      out.write("<b>}</b><br>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"error\">error<br>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"0\">0<br>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"10\">10<br>\n");
      out.write("<input type=\"radio\" name=\"1\" value=\"garbage value\">garbage value<br></p>\n");
      out.write("<p>2. What will be the output of following statements ?<br>\n");
      out.write("<b>char x[ ] = \"hello hi\"; printf(\"%d%d\",sizeof(*x),sizeof(x));</b><br>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"88\">88<br>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"88\">18<br>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"88\">29<br>\n");
      out.write("<input type=\"radio\" name=\"2\" value=\"88\">19<br></p>\n");
      out.write("<p>3. What will be the output of the following statements ?<br>\n");
      out.write("<b>int a=5,b=6,c=9,d; d=(ac?1:2):(c>b?6:8)); printf(\"%d\",d);</b><br>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"1\">1<br>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"2\">2<br>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"6\">6<br>\n");
      out.write("<input type=\"radio\" name=\"3\" value=\"Error\">Error<br></p>\n");
      out.write("<p>4. What will be the output of the following statements ?<br>\n");
      out.write("<b>int i = 3;</b><br>\n");
      out.write("<b>printf(\"%d%d\",i,i++);</b><br>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"34\">34<br>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"43\">43<br>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"44\">44<br>\n");
      out.write("<input type=\"radio\" name=\"4\" value=\"33\">33<br></p>\n");
      out.write("<p>5. What will be the output of the following program ?<br>\n");
      out.write("<b>#include</b><br>\n");
      out.write("<b>void main()</b><br>\n");
      out.write("<b>{</b><br>\n");
      out.write("<b>int a = 36, b = 9;</b><br>\n");
      out.write("<b>printf(\"%d\",a>>a/b-2);</b><br>\n");
      out.write("<b>}</b><br>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"9\">9<br>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"7\">7<br>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"5\">5<br>\n");
      out.write("<input type=\"radio\" name=\"5\" value=\"none of these\">none of these<br></p>\n");
      out.write("<p>6. int testarray[3][2][2] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};<br>\n");
      out.write("What value does testarray[2][1][0] in the sample code above contain?<br>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"11\">11<br>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"7\">7<br>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"5\">5<br>\n");
      out.write("<input type=\"radio\" name=\"6\" value=\"9\">9<br></p>\n");
      out.write("<p>7.Output of following program?<br>\n");
      out.write("<b>#include <stdio.h></b><br>\n");
      out.write("<b>int main()</b><br>\n");
      out.write("<b>{</b><br>\n");
      out.write("<b>  printf(\"%d\", main);</b><br> \n");
      out.write("<b>  return 0;</b><br>\n");
      out.write("<b>}</b><br>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"Address of main function\">Address of main function<br>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"Compiler Error\">Compiler Error<br>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"Runtime Error\">Runtime Error<br>\n");
      out.write("<input type=\"radio\" name=\"7\" value=\"Some random value\">Some random value<br></p>\n");
      out.write("<p>8.What’s going to happen when we compile and run the following C program snippet?<br>\n");
      out.write("<b>#include \"stdio.h\"</b><br>\n");
      out.write("<b>int main()</b><br>\n");
      out.write("<b>{</b><br>\n");
      out.write("<b> int a = 10;</b> <br>\n");
      out.write("<b>printf(\"=%d %d=\",(a+1));</b><br> \n");
      out.write("<b>return 0;</b><br>\n");
      out.write("<b>}</b><br>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"=11 0=\">=11 0=<br>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"=11 X= where X would depend on Compiler implementation\">=11 X= where X would depend on Compiler implementatio<br>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"Undefined behaviour\">Undefined behaviour<br>\n");
      out.write("<input type=\"radio\" name=\"8\" value=\"Compiler Error due to missing argument for second %d\">Compiler Error due to missing argument for second %d<br></p>\n");
      out.write("<p>9.output?<br/>\n");
      out.write("<b>#include <stdio.h></b><br>\n");
      out.write("<b>int i;</b><br/>\n");
      out.write("<b>int main()</b><br/>\n");
      out.write("<b>{</b>\n");
      out.write("<b>if (i);</b>\n");
      out.write("<b>else</b>\n");
      out.write("<b>printf(\"Ëlse\");</b><\n");
      out.write("<b>return 0;</b><b>}</b>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"if block is executed\">if block is executed<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"else block is executed\">else block is executed<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"It is unpredictable as i is not initialized.\">It is unpredictable as i is not initialized.<br/>\n");
      out.write("<input type=\"radio\" name=\"9\" value=\"Error: misplaced else\">Error: misplaced else<br/></p>\n");
      out.write("<p>10.output?<br/>\n");
      out.write("<b>#include<stdio.h></b><br/>\n");
      out.write("<b>int main()</b><br/>\n");
      out.write("<b>{</b><br/>\n");
      out.write("<b>int n;</b><br/>\n");
      out.write("<b>for (n = 9; n!=0; n--)</b><br/>\n");
      out.write("<b>printf(\"n = %d\", n--);<b><br/>\n");
      out.write("<b>return 0;</b><br/>\n");
      out.write("<b>}</b><br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"9 7 5 3 1\">9 7 5 3 1<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"9 8 7 6 5 4 3 2 1\">9 8 7 6 5 4 3 2 1<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"Infinite Loop\">Infinite Loop<br/>\n");
      out.write("<input type=\"radio\" name=\"10\" value=\"9 7 5 3\">9 7 5 3<br/></p>\n");
      out.write("<input type=\"hidden\" value=\"");
out.print(input);
      out.write("\" name=\"ans\" class=\"but1\">\n");
      out.write("<input type=\"submit\" value=\"Send\" name=\"q1\" class=\"but1\"/>\n");
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
