<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/quiz.css">
<style>
#header
{
background-color:#900C3F;
color:white;
text-align:center;
padding:6px;
}
#navigation
{
line-height:100px;
background-color:blue;
height:500px;
width:100px;
float:left;
padding:5px;
}
#section
{
width:600px;
padding:10px;
}
#foot
{
	position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   background-color:#002475;
   color: white;
   text-align: center;
}
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  border: 1px solid #e7e7e7;
  background-color: #f3f3f3;
}

li {
  float: left;
}

li a {
  display: block;
  color: #666;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a.active {
  color: white;
  background-color:#117A65;
}
h2
{
position:absolute;
top:150px;
left:560px;
}
.but
{
    position:absolute;
    top:150px;
    left:8px;
    width:200px;
    height:auto;
    padding:80px 40px;
    box-sizing:border-box;
    background:lightseagreen;
}
.button
{
  background-color:#900C3F;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;  
}
.set1
{
 position:absolute;
    top:200px;
    left:250px;   
}
.but1
{
 background-color:#900C3F;
  border: none;
  color: white;
  padding: 10px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;     
}
.nn{
    float:right;
}
</style>
</head>
<body>
<form action="" method="post">
<div id="header">
<h1>V_LEARN</h1>
</div>
    
<ul>
<li><a href="javaIndex.jsp">Java</a></li>
<li><a href="javaquiz.jsp" class="active">Quiz</a></li>
<li>  <a href="JavaCourseMaterial.jsp">Course Material</a><li>
<li> <a href="javaVideo.jsp">Course Videos</a></li>
<li>  <a href="http://localhost:8080/">Complier</a></li>
<li class="nn">  <a href="index.html"><b>Logout</b></a></li>
</ul>

<div class="but">
    <input type="submit" class="button" name="q1" value="Quiz1"><br><br>
    <input type="submit" class="button" name="q1" value="Quiz2"><br><br>
    <input type="submit" class="button" name="q1" value="Quiz3"><br><br>
    <input type="submit" class="button" name="q1" value="Quiz4"><br><br>
    <input type="submit" class="button" name="q1" value="Quiz5">
</div>
<h2>Welcome to Quiz section</h2>

<div id="foot">copyright saravanan0298@gmail.com</div>
</form>
</body>
</html>
<div class="set1">
<%@page import="java.sql.*,java.util.*"%>
<%
String input=request.getParameter("q1");
try
{
if(input.equals("Quiz1"))
               {
               %>    
               <style>
                   .but
                {
                 height:1350px;
                }
                   </style>

    <form action="#" method="post">
        <h1>Quiz1</h1>
<p>1. Java programs are<br/>
<input type="radio" name="1" value="123">Faster than others<br/>
<input type="radio" name="1" value="Platform independent">Platform independent<br/>
<input type="radio" name="1" value="123">Not reusable<br/>
<input type="radio" name="1" value="123">Not scalable<br/></p>

<p>2. Java has its origin in<br/>
<input type="radio" name="2" value="123">C programming language<br/>
<input type="radio" name="2" value="123">PERRL<br/>
<input type="radio" name="2" value="123">COBOL<br/>
<input type="radio" name="2" value="Oak programming language">Oak programming language<br/></p>

<p>3. Which one of the following is true for Java<br/>
<input type="radio" name="3" value="Java is object-oriented and interpreted">Java is object-oriented and interpreted<br/>
<input type="radio" name="3" value="123">Java is efficient and faster than C<br/>
<input type="radio" name="3" value="123">Java is the choice of everyone.<br/>
<input type="radio" name="3" value="123">Java is not robust.<br/></p>

<p>4. The command javac is used to<br/>
<input type="radio" name="4" value="123">debug a java program<br/>
<input type="radio" name="4" value="compile a java program">compile a java program<br/>
<input type="radio" name="4" value="123">interpret a java program<br/>
<input type="radio" name="4" value="123">execute a java program<br/></p>

<p>5. Java servlets are an efficient and powerful solution for creating ………….. for the web.<br/>
<input type="radio" name="5" value="Dynamic content">Dynamic content<br/>
<input type="radio" name="5" value="123">Static content<br/>
<input type="radio" name="5" value="123">Hardware<br/>
<input type="radio" name="5" value="123">Both a and b<br/></p>

<p>6. Filters were officially introduced in the Servlet ……………… specification.<br/>
<input type="radio" name="6" value="123">2.1<br/>
<input type="radio" name="6" value="2.3">2.3<br/>
<input type="radio" name="6" value="123">2.2<br/>
<input type="radio" name="6" value="123">2.4<br/></p>

<p>7. Which is the root class of all AWT events<br/>
<input type="radio" name="7" value="123">java.awt.ActionEvent<br/>
<input type="radio" name="7" value="java.awt.AWTEvent">java.awt.AWTEvent<br/>
<input type="radio" name="7" value="123">java.awt.event.AWTEvent<br/>
<input type="radio" name="7" value="123">ava.awt.event.Event<br/></p>

<p>8. OOP features are<br/>
i) Increasing productivity ii) Reusability<br/>
iii) Decreasing maintenance cost iv) High vulnerability<br/>
<input type="radio" name="8" value="123">1,2 & 4<br/>
<input type="radio" name="8" value="1,2 & 3">1,2 & 3<br/>
<input type="radio" name="8" value="123">1, 2 & 4<br/>
<input type="radio" name="8" value="123">none of the above<br/></p>

<p>9. break statement is used to<br/>
i) get out of method ii) end a program<br/>
iii) get out of a loop iv) get out of the system<br/>
<input type="radio" name="9" value="123">1 & 2<br/>
<input type="radio" name="9" value="123">1,2 & 3<br/>
<input type="radio" name="9" value="123">1 & 3<br/>
<input type="radio" name="9" value="3">3<br/></p>

<p>10. Native-protocol pure Java converts ……….. into the ………… used by DBMSs directly.<br/>
<input type="radio" name="10" value="JDBC calls, network protocol">JDBC calls, network protocol<br/>
<input type="radio" name="10" value="123">ODBC class, network protocol<br/>
<input type="radio" name="10" value="123">ODBC class, user call<br/>
<input type="radio" name="10" value="123">JDBC calls, user call<br/></p>
<input type="hidden" value="<%out.print(input);%>" name="ans" class="but1">
<input type="submit" value="Send" name="q1" class="but1"></a>
<input type="reset" value="Clear" class="but1">         
</form>

     <%
                  
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
               %>    
              <style>
                   .but
                {
                 height:1350px;
                }
                   </style>
                 <form action="#" method="post">
                       <h1>Quiz2</h1>
<p>1. The JDBC-ODBC bridge allows ……….. to be used as ………..<br/>
<input type="radio" name="1" value="123">JDBC drivers, ODBC drivers<br/>
<input type="radio" name="1" value="123">Drivers, Application<br/>
<input type="radio" name="1" value="ODBC drivers, JDBC drivers">ODBC drivers, JDBC drivers<br/>
<input type="radio" name="1" value="123">Application, drivers<br/></p>

<p>2. Which of the following is true about Java.<br/>
<input type="radio" name="2" value="123">Java does not support overloading.<br/>
<input type="radio" name="2" value="123">Java has replaced the destructor function of C++<br/>
<input type="radio" name="2" value="123">There are no header files in Java.<br/>
<input type="radio" name="2" value="All of the above.">All of the above.<br/></p>

<p>3. ……………. are not machine instructions and therefore, Java interpreter generates machine code that can be directly executed by the machine that is running the Java program.<br/>
<input type="radio" name="3" value="123">Compiled Instructions<br/>
<input type="radio" name="3" value="123">Compiled code<br/>
<input type="radio" name="3" value="byte code">byte code<br/>
<input type="radio" name="3" value="123">Java mid code<br/></p>

<p>4. The command javac<br/>
<input type="radio" name="4" value="123">Converts a java program into binary code<br/>
<input type="radio" name="4" value="Converts a java program into bytecode">Converts a java program into bytecode<br/>
<input type="radio" name="4" value="123">Converts a java program into machine language<br/>
<input type="radio" name="4" value="123">None of the above.<br/></p>

<p>5. Which of the following is not the Java primitive type<br/>
<input type="radio" name="5" value="123">Byte<br/>
<input type="radio" name="5" value="123">Float<br/>
<input type="radio" name="5" value="123">Character<br/>
<input type="radio" name="5" value="Long double">Long double<br/></p>

<p>6. Command to execute compiled java program is<br/>
<input type="radio" name="6" value="java">java<br/>
<input type="radio" name="6" value="123">javac<br/>
<input type="radio" name="6" value="123">run<br/>
<input type="radio" name="6" value="123">javaw<br/></p>

<p>7. Java Servlet<br/>
<b>i) is a key component of server-side Java development</b><br/>
<b>ii) is a small pluggable extension to a server that enhances functionality</b><br/>
<b>iii) runs only in Windows Operating System</b><br/>
<b>iv) allows developers to customize any java enabled server</b><br/>
<input type="radio" name="7" value="123">i, ii & iii are true<br/>
<input type="radio" name="7" value="123">i, iii & iv are true<br/>
<input type="radio" name="7" value="123">ii, iii & iv are true<br/>
<input type="radio" name="7" value="i, ii & iv are true">i, ii & iv are true<br/></p>

<p>8. Inner classes are<br/>
<input type="radio" name="8" value="123">anonymous classes<br/>
<input type="radio" name="8" value="nested classes">nested classes<br/>
<input type="radio" name="8" value="123">subclasses<br/>
<input type="radio" name="8" value="123">derived classes<br/></p>

<p>9. How many times does the following code segment execute<br/>
<b>int x=1, y=10, z=1;</b><br/>
<b>do{y–; x++; y-=2; y=z; z++} while (y>1 && z<10);</b><br/>
<input type="radio" name="9" value="1">1<br/>
<input type="radio" name="9" value="123">10<br/>
<input type="radio" name="9" value="123">5<br/>
<input type="radio" name="9" value="123">infinite<br/></p>

<p>10. State whether the following statement is true or false for EJB.<br/>
<b>1. EJB exists in the middle-tier</b><br/>
<b>2. EJB specifies an execution environment</b><br/>
<b>3. EJB supports transaction processing</b><br/>
<input type="radio" name="10" value="1-true, 2. true, 3. true">1-true, 2. true, 3. true<br/>
<input type="radio" name="10" value="123">1- true, 2. false, 3. true<br/>
<input type="radio" name="10" value="123">1- false, 2- false, 3- false<br/>
<input type="radio" name="10" value="123">1-true, 2-true, 3-false<br/></p>
<input type="hidden" value="<%out.print(input);%>" name="ans" class="but1">
<input type="submit" value="Send" name="q1" class="but1">
<input type="reset" value="Clear" class="but1" name="s1">         
  </form>
                    <%
               }  
if(input.equals("Quiz3"))
               {
               %>    
               <style>
                   .but
                {
                 height:1350px;
                }
                   </style>
                   <form action="#" method="post">
                       <h1>Quiz3</h1>
<p>1.A ……… an object cannot be modified after it is created.<br/>
<input type="radio" name="1" value="123">double<br/>
<input type="radio" name="1" value="123">int<br/>
<input type="radio" name="1" value="string">string<br/>
<input type="radio" name="1" value="123">main<br/></p>

<p>2. ……… is a special member function.<br/>

<input type="radio" name="2" value="123">method<br/>
<input type="radio" name="2" value="123">class<br/>
<input type="radio" name="2" value="123">use defined function<br/>
<input type="radio" name="2" value="constructor">constructor<br/></p>

<p>3. A …….. class may not have any abstract method.<br/>

<input type="radio" name="3" value="123">abstract<br/>
<input type="radio" name="3" value="123">static<br/>
<input type="radio" name="3" value="final">final<br/>
<input type="radio" name="3" value="123">public<br/></p>

<p>4. Keyword ………. is always a reference to the object.<br/>

<input type="radio" name="4" value="123">new<br/>
<input type="radio" name="4" value="this">this<br/>
<input type="radio" name="4" value="123">invoke<br/>
<input type="radio" name="4" value="123">class<br/></p>
<p>5. ……… operators are overloaded for string objects?<br/>

<input type="radio" name="5" value="123">-,+<br/>
<input type="radio" name="5" value="+,=">+,=<br/>
<input type="radio" name="5" value="123"><<,>><br/>
<input type="radio" name="5" value="123">++,–<br/></p>

<p>6. ……. is a small unit of a process.<br/>

<input type="radio" name="6" value="123">method<br/>
<input type="radio" name="6" value="thread">thread<br/>
<input type="radio" name="6" value="123">applet<br/>
<input type="radio" name="6" value="123">steam<br/></p>
<p>7. ……. is valid for if statement?<br/>

<input type="radio" name="7" value="123"> An integer expression<br/>
<input type="radio" name="7" value="A Boolean expression"> A Boolean expression<br/>
<input type="radio" name="7" value="123">A character expression<br/>
<input type="radio" name="7" value="123">A legal expression<br/></p>

<p>8. A wrapper class is a wrapper around a ……. data type.<br/>
<input type="radio" name="8" value="123">normal<br/>
<input type="radio" name="8" value="123">central<br/>
<input type="radio" name="8" value="primitive">primitive<br/>
<input type="radio" name="8" value="123">concrete<br/></p>

<p>9. …….. statement is valid for array declaration.<br/>
<input type="radio" name="9" value="123">int number();<br/>
<input type="radio" name="9" value="123">float number();<br/>
<input type="radio" name="9" value="float number[];">float number[];<br/>
<input type="radio" name="9" value="123">count int[];<br/></p>

<p>10. ……. operators which concatenates two strings.<br/>
<input type="radio" name="10" value="+">+<br/>
<input type="radio" name="10" value="123">++<br/>
<input type="radio" name="10" value="123">–<br/>
<input type="radio" name="10" value="123">+-<br/></p>
<input type="hidden" value="<%out.print(input);%>" name="ans" class="but1">
<input type="submit" value="Send" name="q1" class="but1">
<input type="reset" value="Clear" class="but1" name="s1">         
</form>


                    <%
               } 
if(input.equals("Quiz4"))
               {
               %>    
               <style>
                   .but
                {
                 height:2200px;
                }
                   </style>
                <form action="#" method="post">
                   <h1>Quiz4</h1>
<p>1. Which of the following statement is/are true?<br/>
<b>i) The name of a java program file must match the name of the class with the extension .java</b><br/>
<b>ii) Two methods cannot have the same name in java</b><br/>
<input type="radio" name="1" value="i- only">i- only<br/>
<input type="radio" name="1" value="123">ii- only<br/>
<input type="radio" name="1" value="123">Both I and ii<br/>
<input type="radio" name="1" value="123">None of the above<br/></p>

<p>2. Which of the following represent(s) of a hexadecimal number?<br/>
<input type="radio" name="2" value="570">570<br/>
<input type="radio" name="2" value="123">(hex)5<br/>
<input type="radio" name="2" value="123">0X9F<br/>
<input type="radio" name="2" value="123">0X5<br/></p>

<p>3. …….. can appear only wherein the body of a Java method.<br/></p>
<input type="radio" name="3" value="123">definition<br/>
<input type="radio" name="3" value="declaration">declaration<br/>
<input type="radio" name="3" value="123">determine<br/>
<input type="radio" name="3" value="123">package<br/></p>

<p>4. State whether the following statement is True or False?<br/>
<b>i) The modulus operator(%) can be used only with integer operands</b><br/>
<b>ii) Declarations can appear anywhere in the body of a Java method</b><br/>

<input type="radio" name="4" value="123">i-True, ii-False<br/>
<input type="radio" name="4" value="i-False, ii-True">i-False, ii-True<br/>
<input type="radio" name="4" value="123">i-True, ii-True<br/>
<input type="radio" name="4" value="123">i-False, ii-False<br/></p>

<p>5. Which of the following will produce a value of 22 if x=22.9?<br/>
<input type="radio" name="5" value="123">ceil(x)<br/>
<input type="radio" name="5" value="123">round(x)<br/>
<input type="radio" name="5" value="int(x)">int(x)<br/>
<input type="radio" name="5" value="123">abs(x)<br/></p>

<p>6. …….. is passed to a method by use of call by reference.<br/>
<input type="radio" name="6" value="123">Variables<br/>
<input type="radio" name="6" value="Objects">Objects<br/>
<input type="radio" name="6" value="123">Methods<br/>
<input type="radio" name="6" value="123">Operators<br/></p>

<p>7. What will be the output of below program?<br/>
<b>public class Test {</b><br/>
<b>public static void main(String[] args){</b></br>
<b>String x = "abc";String y = "abc";</b><br/>
<b>x.concat(y);</b><br/>
<b>System.out.print(x);}}</b><br/>
<input type="radio" name="7" value="123">abcabc<br/>
<input type="radio" name="7" value="abc">abc<br/>
<input type="radio" name="7" value="123">null<br/></p>
<p>8. What will be the output of below program?<br/>
<b>public class Test {</b><br/>
<b>public static String toString(){</b><br/>
<b>System.out.println("Test toString called");</b><br/>
<b>return "";}</b><br/>
<b>public static void main(String args[]){</b><br/>
<b>System.out.println(toString());}}</b><br/>
<input type="radio" name="8" value="123">"Test toString called"<br/>
<input type="radio" name="8" value="Compile time error">Compile time error<br/>
<input type="radio" name="8" value="123">"Test@7fh2bd8" (Object class toString() method is being called)<br/></p>

<p>9. What will be the output of below program?<br/>
<b>public class Test {</b><br/>
<b>public static void main(String[] args) {</b><br/>
<b>String s1 = "abc";</b><br/>
<b>String s2 = "abc";</b><br/>
<b>System.out.println("s1 == s2 is:" + s1 == s2);}}</b><br/>
<input type="radio" name="9" value="123">s1 == s2 is:true<br/>
<input type="radio" name="9" value="false">false<br/>
<input type="radio" name="9" value="123">s1 == s2 is:false<br/>
<input type="radio" name="9" value="123">true<br/></p>
<p>10. Which of the following will produce a value of 10 if x=9.7?<br/>
<input type="radio" name="10" value="123">floor(x)<br/>
<input type="radio" name="10" value="123">abs(x)<br/>
<input type="radio" name="10" value="123">rint(x)<br/>
<input type="radio" name="10" value="round(x)">round(x)<br/></p>
<input type="hidden" value="<%out.print(input);%>" name="ans" class="but1">
<input type="submit" value="Send" name="q1" class="but1">
<input type="reset" value="Clear" class="but1" name="s1">         
</form>
                    <%
               }
if(input.equals("Quiz5"))
               {
               %>    
               <style>
                   .but
                {
                 height:2200px;
                }
                   </style>
<form action="#" method="post">
                       <h1>Quiz5</h1>

<p>1.Which of the following are not the methods of the Thread class?<br/>
<input type="radio" name="1" value="123">yield()<br/>
<input type="radio" name="1" value="123">sleep(long msec)<br/>
<input type="radio" name="1" value="go()">go()<br/>
<input type="radio" name="1" value="123">stop()<br/></p>
<p>2.Division operator has ____ precedence over multiplication operator<br/>
<input type="radio" name="2" value="123">Heighest<br/>
<input type="radio" name="2" value="123">Least<br/>
<input type="radio" name="2" value="Equal">Equal<br/>
<input type="radio" name="2" value="123">None of These<br/></p>
<p>3.What is the full form of JVM ?<br/>
<input type="radio" name="3" value="123">Java Very Large Machine<br/>
<input type="radio" name="3" value="123">Java Verified Machine<br/>
<input type="radio" name="3" value="123">Java Very Small Machine<br/>
<input type="radio" name="3" value="Java Virtual Machine">Java Virtual Machine<br/></p>
<p>4.In Java code, the line that begins with /* and ends with */ is known as?<br/>
<input type="radio" name="3" value="Multiline comment">Multiline comment<br/>
<input type="radio" name="3" value="123">Single line comment<br/>
<input type="radio" name="3" value="123">Both A & B<br/>
<input type="radio" name="3" value="123">None of these<br/></p>
<p>5.What will be the output of the program?<br/>
<b>try</b><br/> 
<b>{</b><br/> 
<b>    int x = 0;  int y = 5 / x;</b><br/> 
<b>}</b><br/> 
<b>catch (Exception e) {System.out.println("Exception"); }</b><br/> 
<b>catch (ArithmeticException ae) {System.out.println(" Arithmetic Exception"); }</b><br/> 
<b>System.out.println("finished");</b><br/>
<input type="radio" name="5" value="123">finished<br/>
<input type="radio" name="5" value="123">Exception<br/>
<input type="radio" name="5" value="Compilation fails.">Compilation fails.<br/>
<input type="radio" name="5" value="123">Arithmetic Exception<br/></p>
<p>6.What will be the output of the program?<br/>
<b>class Equals</b><br>
<b>{public static void main(String [] args) </b><br/>
 <b>{</b><br/>
   <b> int x = 100;  double y = 100.1;</b><br/>
    <b>    boolean b = (x = y); </b></br>
     <b>   System.out.println(b);    }}</b></br>
<input type="radio" name="6" value="123">true<br/>
<input type="radio" name="6" value="123">false<br/>
<input type="radio" name="6" value="Compilation fails">Compilation fails<br/>
<input type="radio" name="6" value="123">An exception is thrown at runtime<br/></p>
<p>7.What will be the output of the program?<br/>
<b>public class vlearn</b><br/>
<b>{    public static void main(String[] args)</b><br/> 
<b>{   try </b><br/>
<b>{          return;}</b><br/> 
<b> finally </b><br/>
 <b>  {           System.out.println( "Finally" );   } } }</b><br>
<input type="radio" name="7" value="Finally">Finally	<br/>
<input type="radio" name="7" value="123">Compilation fails.<br/>
<input type="radio" name="7" value="123">The code runs with no output.<br/>
<input type="radio" name="7" value="123">An exception is thrown at runtime.<br/></p>
<p>8.What will be the output of below program?<br/>
<b>import java.io.IOException;</b><br/>
<b>public class Test {</b>
<b>public static void main(String[] args) {</b><br/>
<b>try {</b><br/>
<b>throw new IOException("Hello");</b><br/>
<b>}catch(IOException | Exception e) {</b><br/>
<b>System.out.println(e.getMessage());	}}}</b><br/>
<input type="radio" name="8" value="Compile time error">Compile time error<br/>
<input type="radio" name="8" value="123">Prints "Hello"<br/>
<input type="radio" name="8" value="123">Runtime Error<br/></p>
<p>9. What will be output of below program?<br/>
<b>public class Test {</b><br/>
<b>public void main(String[] args){</b><br/>		
<b>int x = 10*20-20;</b><br/>	
<b>System.out.println(x);}}</b><br/>	
<input type="radio" name="9" value="Runtime Error">Runtime Error<br/>
<input type="radio" name="9" value="123">Prints 180<br/><br/>
<input type="radio" name="9" value="123">Prints 0<br/>
<input type="radio" name="9" value="123">Compile time error.<br/></p>
<p>10. What will be the output of the below program?<br/>
<b>public class Test{</b><br/>
<b>public static void main(String[] args){</b><br/>		
<b>char c = 65;</b><br/>
<b>System.out.println("c = "+c);} }</b><br/>
<input type="radio" name="10" value="123">Compile Time Error<br/>
<input type="radio" name="10" value="Prints "c = A"">Prints "c = A"<br/>
<input type="radio" name="10" value="123">Runtime Error<br/>
<input type="radio" name="10" value="123">Prints "c = 65"<br/></p>
<input type="hidden" value="<%out.print(input);%>" name="ans" class="but1">
<input type="submit" value="Send" name="q1" class="but1"/>
<input type="reset" value="Clear" class="but1" name="s1">         
</form>
              <%
               } 


}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>
           </div>
