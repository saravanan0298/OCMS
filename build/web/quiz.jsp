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
<li><a href="cindex.html">C</a></li>
<li><a href="quiz.jsp" class="active">Quiz</a></li>
<li>  <a href="ccourseMaterial.jsp">Course Material</a><li>
<li> <a href="ccoursevideo.jsp">Course Videos</a></li>
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
<P>1. "C" is designed by ______:<BR>
<input type="radio" name="1" value="Dennis Ritchie">Dennis Ritchie<BR>
<input type="radio" name="1" value="quatre">quatre<BR>
<input type="radio" name="1" value="soleil">soleil<BR>
<input type="radio" name="1" value="poisson">poisson<BR>
</p>

<P>2. Which year C introduced ?<BR>
<input type="radio" name="2" value="1972">1972<BR>
<input type="radio" name="2" value="valise">valise<BR>
<input type="radio" name="2" value="soleil">soleil<BR>
<input type="radio" name="2" value="poisson">poisson<BR>
</p>

<P>3. C Language developed at _____?<BR>
<input type="radio" name="3" value="Bell Laboratory">Bell Laboratory<BR>
<input type="radio" name="3" value="valise">valise<BR>
<input type="radio" name="3" value="soleil">soleil<BR>
<input type="radio" name="3" value="poisson">poisson<BR>
</p>

<P>4. What are the key features of C programming language _____?<BR>
<input type="radio" name="4" value="platform-dependent language">platform-dependent language
<BR>
<input type="radio" name="4" value="C offers the possibility to break down a large program into small modules.">C offers the possibility to break down a large program into small modules.<BR>
<input type="radio" name="4" value="the possibility of a programmer to control the language.">the possibility of a programmer to control the language.<BR>
<input type="radio" name="4" value="C comes with support for system programming and hence it compiles and executes with high speed when compared to other high-level languages.">C comes with support for system programming and hence it compiles and executes with high speed when compared to other high-level languages.<BR>
</p>
<P>5. “C” was primarily developed as a_____?<BR>
<input type="radio" name="5" value="Systems Programing Language">Systems Programing Language<BR>
<input type="radio" name="5" value="General Purpose Language">General Purpose Language<BR>
<input type="radio" name="5" value="Data Processing Language">Data Processing Language<BR>
<input type="radio" name="5" value="None">None<BR>
</p>

<P>6. “C” is a_____?<BR>
<input type="radio" name="6" value="High Level Language">High Level Language<BR>
<input type="radio" name="6" value="Low Level Language">Low Level Language<BR>
<input type="radio" name="6" value="High Level Language with some low level features">High Level Language with some low level features<BR>
<input type="radio" name="6" value="Low level language with some high level features">Low level language with some high level features<BR>
</p>
<P>7. Length of the string “Correct” is_____?<BR>
<input type="radio" name="7" value="7">7<BR>
<input type="radio" name="7" value="8">8<BR>
<input type="radio" name="7" value="6">6<BR>
<input type="radio" name="7" value=" Implementation dependent"> Implementation dependent<BR>
</p>
<P>8. Most suitable option for  “C” literal is_____?<BR>
<input type="radio" name="8" value="A string">A string<BR>
<input type="radio" name="8" value="A string constant">A string constant<BR>
<input type="radio" name="8" value="A character">A character<BR>
<input type="radio" name="8" value="An alphabet">An alphabet<BR>
</p>
<P>9. The “const” feature can be applied to_____?<BR>
<input type="radio" name="9" value="An identifier">An identifier<BR>
<input type="radio" name="9" value="An array">An array<BR>
<input type="radio" name="9" value="An array argument">An array argument<BR>
<input type="radio" name="9" value="All">All<BR>
</p>
<P>10. Pick the operator that associate from the right_____?<BR>
<input type="radio" name="10" value="? :">? :<BR>
<input type="radio" name="10" value="+ =">+ =<BR>
<input type="radio" name="10" value="=">=<BR>
<input type="radio" name="10" value="All">All<BR>
</p>
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
               %>    
              <style>
                   .but
                {
                 height:1350px;
                }
                   </style>
                 <form action="#" method="post">
                       <h1>Quiz2</h1>
                       <p>1.Bitwise operators can operate upon?<br>
<input type="radio" name="1" value="double and chars">double and chars<br>
<input type="radio" name="1" value="floats and doubles">floats and doubles<br>
<input type="radio" name="1" value="ints and floats">ints and floats<br>
<input type="radio" name="1" value="ints and chars">ints and chars<br></p>
<p>2.What is C Tokens?<br>
<input type="radio" name="2" value="The smallest individual units of c program">The smallest individual units of c program<br>
<input type="radio" name="2" value="The basic element recognized by the compiler">The basic element recognized by the compiler<br>
<input type="radio" name="2" value="The largest individual units of program">The largest individual units of program<br>
<input type="radio" name="2" value="A & B Both">A & B Both<br></p>
<p>3. For 16-bit compiler allowable range for integer constants is ______ ?<br>
<input type="radio" name="3" value="-3.4e38 to 3.4e38">-3.4e38 to 3.4e38<br>
<input type="radio" name="3" value="-32767 to 32768">-32767 to 32768<br>
<input type="radio" name="3" value="-32768 to 32767">-32768 to 32767<br>
<input type="radio" name="3" value="-32767 to 32768">-32668 to 32667<br></p>
<p>4. C programs are converted into machine language with the help of<br>
<input type="radio" name="4" value="An Editor">An Editor<br>
<input type="radio" name="4" value="A compiler">A compiler<br>
<input type="radio" name="4" value="An operating system">An operating system<br>
<input type="radio" name="4" value="None of the above">None of the above<br></p>
<p>5. A C variable cannot start with<br>
<input type="radio" name="5" value="An alphabet">An alphabet<br>
<input type="radio" name="5" value="A number">A number<br>
<input type="radio" name="5" value="A special symbol other than underscore">A special symbol other than underscore<br>
<input type="radio" name="5" value="both (b) and (c)">both (b) and (c)<br></p>
<p>6. Which of the following is allowed in a C Arithmetic instruction<br>
<input type="radio" name="6" value="[]">[]<br>
<input type="radio" name="6" value="{}">{}<br>
<input type="radio" name="6" value="()">()<br>
<input type="radio" name="6" value="None of the above">None of the above<br></p>
<p>7. Which of the following shows the correct hierarchy of arithmetic operations in C<br>
<input type="radio" name="7" value="/ + * -">/ + * -<br>
<input type="radio" name="7" value="* - / +">* - / +<br>
<input type="radio" name="7" value="+ - / *">+ - / *<br>
<input type="radio" name="7" value="* / + -">* / + -<br></p>
<p>8. What is an array?<br>
<input type="radio" name="8" value="An array is a collection of variables that are of the dissimilar data type.">An array is a collection of variables that are of the dissimilar data type.<br>
<input type="radio" name="8" value="An array is a collection of variables that are of the same data type.">An array is a collection of variables that are of the same data type.<br>
<input type="radio" name="8" value="An array is not a collection of variables that are of the same data type.">An array is not a collection of variables that are of the same data type.<br>
<input type="radio" name="8" value="None of the above.">None of the above.<br></p>
<p>9. What is right way to Initialization array?<br>
<input type="radio" name="9" value="int num[6] = { 2, 4, 12, 5, 45, 5 } ;">int num[6] = { 2, 4, 12, 5, 45, 5 } ;<br>
<input type="radio" name="9" value="int n{} = { 2, 4, 12, 5, 45, 5 } ;">int n{} = { 2, 4, 12, 5, 45, 5 } ;<br>
<input type="radio" name="9" value="int n{6} = { 2, 4, 12 } ;">int n{6} = { 2, 4, 12 } ;<br>
<input type="radio" name="9" value="int n(6) = { 2, 4, 12, 5, 45, 5 } ;">int n(6) = { 2, 4, 12, 5, 45, 5 } ;<br></p>
<p>10. An array elements are always stored in _________ memory locations.<br>
<input type="radio" name="10" value="Sequential">Sequential<br>
<input type="radio" name="10" value="Random">Random<br>
<input type="radio" name="10" value="Sequential and Random">Sequential and Random<br>
<input type="radio" name="10" value="None of the above">None of the above<br></p>
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
                       <p>1. Which is the right way to declare constant in C?<br>
<input type="radio" name="1" value="int constant var =10;">int constant var =10;<br>
<input type="radio" name="1" value="int const var = 10;">int const var = 10;<br>
<input type="radio" name="1" value="const int var = 10;">const int var = 10;<br>
<input type="radio" name="1" value="B & C Both">B & C Both<br></p>
<p>2. Which operators are known as Ternary Operator?<br>
<input type="radio" name="2" value="::,">::, ?<br>
<input type="radio" name="2" value="?, :">?, :<br>
<input type="radio" name="2" value="?, ;;">?, ;;<br>
<input type="radio" name="2" value="None of the above">None of the above<br></p>
<p>3. In switch statement, each case instance value must be _______?<br>
<input type="radio" name="3" value="Constant">Constant<br>
<input type="radio" name="3" value="Variable">Variable<br>
<input type="radio" name="3" value="Symbol">Symbolc<br>
<input type="radio" name="3" value="None of the above">None of the above<br></p>
<p>4. What is the work of break keyword?<br>
<input type="radio" name="4" value="Halt execution of program">Halt execution of program<br>
<input type="radio" name="4" value="Restart execution of program">Restart execution of program<br>
<input type="radio" name="4" value="Exit from loop or switch statement">Exit from loop or switch statement<br>
<input type="radio" name="4" value="None of the above">None of the above<br></p>
<p>5. What is function?<br>
<input type="radio" name="5" value="Function is a block of statements that perform some specific task.">Function is a block of statements that perform some specific task.<br>
<input type="radio" name="5" value="Function is the fundamental modular unit. A function is usually designed to perform a specific
task.">Function is the fundamental modular unit. A function is usually designed to perform a specific
task.<br>
<input type="radio" name="5" value="Function is a block of code that performs a specific task. It has a name and it is reusable">Function is a block of code that performs a specific task. It has a name and it is reusable<br>
<input type="radio" name="5" value="All the above">All the above<br></p>
<p>6. Which one of the following sentences is true ?<br>
<input type="radio" name="6" value="The body of a while loop is executed at least once.">The body of a while loop is executed at least once.<br>
<input type="radio" name="6" value="The body of a do ... while loop is executed at least once.">The body of a do ... while loop is executed at least once.<br>
<input type="radio" name="6" value="The body of a do ... while loop is executed zero or more times.">The body of a do ... while loop is executed zero or more times.<br>
<input type="radio" name="6" value="A for loop can never be used in place of a while loop.">A for loop can never be used in place of a while loop.<br></p>
<p>7. A binary tree with 27 nodes has _______ null branches.<br>
<input type="radio" name="7" value="54">54<br>
<input type="radio" name="7" value="27">27<br>
<input type="radio" name="7" value="26">26<br>
<input type="radio" name="7" value="None of the above">None of the above<br></p>
<p>8. Which one of the following is not a linear data structure?<br>
<input type="radio" name="8" value="Array">Array<br>
<input type="radio" name="8" value="Binary Tree">Binary Tree<br>
<input type="radio" name="8" value="Queue">Queue<br>
<input type="radio" name="8" value="Queue">Stack<br></p>
<p>9. Recursive functions are executed in a?<br>
<input type="radio" name="9" value="First In First Out Order">First In First Out Order<br>
<input type="radio" name="9" value="Load Balancing">Load Balancing<br>
<input type="radio" name="9" value="Parallel Fashion">Parallel Fashion<br>
<input type="radio" name="9" value="Last In First Out Order">Last In First Out Order<br></p>
<p>10. The statement print f ("%d", 10 ? 0 ? 5 : 1 : 12); will print?<br>
<input type="radio" name="10" value="10">10<br>
<input type="radio" name="10" value="0">0<br>
<input type="radio" name="10" value="12">12<br>
<input type="radio" name="10" value="1">1<br></p>
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
                       <p>1. What will be the output of the following arithmetic expression ?<br>
<b>5+3*2%10-8*6</b><br>
<input type="radio" name="1" value="-37">-37<br>
<input type="radio" name="1" value="-42">-42<br>
<input type="radio" name="1" value="-32">-32<br>
<input type="radio" name="1" value="-28">-28<br></p>
<p>2. What will be the output of the following statement ?<br>
<b>int a=10; printf("%d &i",a,10);</b><br>
<input type="radio" name="2" value="error">error<br>
<input type="radio" name="2" value="10">10<br>
<input type="radio" name="2" value="10 10">10 10<br>
<input type="radio" name="2" value="none of these">none of these<br></p>
<p>3. What will be the output of the following statement ?<br>
<b>printf("%X%x%ci%x",11,10,'s',12);</b><br>
<input type="radio" name="3" value="error">error<br>
<input type="radio" name="3" value="basc">basc<br>
<input type="radio" name="3" value="Bas94c">Bas94c<br>
<input type="radio" name="3" value="none of these">none of these<br></p>
<p>4. What will be the output of the following statements ?<br>
<b>int a = 4, b = 7,c; c = a = = b; printf("%i",c);</b><br>
<input type="radio" name="4" value="0">0<br>
<input type="radio" name="4" value="error">error<br>
<input type="radio" name="4" value="1">1<br>
<input type="radio" name="4" value="garbage value">garbage value<br></p>
<p>5. What will be the output of the following statements ?<br>
<b>int a = 5, b = 2, c = 10, i = a>b</b><br>
<b>void main()</b><br>
<b>{ printf("hello"); main(); }</b><br>
<input type="radio" name="5" value="1">1<br>
<input type="radio" name="5" value="2">2<br>
<input type="radio" name="5" value="infinite number of times">infinite number of times<br>
<input type="radio" name="5" value="none of these">none of these<br></p>
<p>6. What will be output if you will compile and execute the following c code?<br>
<b>struct marks{</b><br>
<b>int p:3;</b></br>
<b>int c:3;</b></br>
<b>int m:2;</b></br>
<b>};</b></br>
<b>void main(){</b></br>
<b>struct marks s={2,-6,5};</b></br>
<b>printf("%d %d %d",s.p,s.c,s.m);</b></br>
<b>}</b></br>
<input type="radio" name="6" value="2 -6 5">2 -6 5<br>
<input type="radio" name="6" value="2 -6 1">2 -6 1<br>
<input type="radio" name="6" value="2 2 1">2 2 1<br>
<input type="radio" name="6" value="Compiler error">Compiler error<br>
<input type="radio" name="6" value="None of these">None of these<br>
<p>7. What will be the output of the following statements ?<br>
<b>int x[4] = {1,2,3}; printf("%d %d %D",x[3],x[2],x[1]);</b><br>
<input type="radio" name="7" value="03%D">03%D<br>
<input type="radio" name="7" value="000">000<br>
<input type="radio" name="7" value="032">032<br>
<input type="radio" name="7" value="321">321<br></p>
<p>8.Output of following program?<br>
<b>#include <stdio.h></b><br/>
<b>int main()</b><br/>
<b>{</b><br/>
<b>    int i = 5;</b><br>
<b>    printf("%d %d %d", i++, i++, i++);</b></br>
<b>    return 0;</b></br>
<b>}</b></br>
<input type="radio" name="8" value="7 6 5">7 6 5<br>
<input type="radio" name="8" value="6 7 5">6 7 5<br>
<input type="radio" name="8" value="5 6 7">5 6 7<br>
<input type="radio" name="8" value="Compiler Dependent">Compiler Dependent<br></p>
<p>9.In C, parameters are always<br/>
<input type="radio" name="9" value="Passed by value">Passed by value<br>
<input type="radio" name="9" value="Passed by reference">Passed by reference<br>
<input type="radio" name="9" value="Non-pointer variables are passed by value and pointers are passed by reference">Non-pointer variables are passed by value and pointers are passed by reference<br>
<input type="radio" name="9" value="Passed by value result">Passed by value result<br></p>
<p>10.Which of the following is true about return type of functions in C?<br/>
<input type="radio" name="10" value="Functions can return any type">Functions can return any type<br>
<input type="radio" name="10" value="Functions can return any type except array and functions">Functions can return any type except array and functions<br>
<input type="radio" name="10" value="Functions can return any type except array, functions and union">Functions can return any type except array, functions and union<br>
<input type="radio" name="10" value="Functions can return any type except array, functions, function pointer and union">Functions can return any type except array, functions, function pointer and union<br></p>
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
 <p>1. What will be the output of following program ?<br>
<b>#include</b><br>
<b>main()</b><br>
<b>{</b><br>
<b>int x,y = 10;</b><br>
<b>x = y * NULL;</b><br>
<b>printf("%d",x);</b><br>
<b>}</b><br>
<input type="radio" name="1" value="error">error<br>
<input type="radio" name="1" value="0">0<br>
<input type="radio" name="1" value="10">10<br>
<input type="radio" name="1" value="garbage value">garbage value<br></p>
<p>2. What will be the output of following statements ?<br>
<b>char x[ ] = "hello hi"; printf("%d%d",sizeof(*x),sizeof(x));</b><br>
<input type="radio" name="2" value="88">88<br>
<input type="radio" name="2" value="88">18<br>
<input type="radio" name="2" value="88">29<br>
<input type="radio" name="2" value="88">19<br></p>
<p>3. What will be the output of the following statements ?<br>
<b>int a=5,b=6,c=9,d; d=(ac?1:2):(c>b?6:8)); printf("%d",d);</b><br>
<input type="radio" name="3" value="1">1<br>
<input type="radio" name="3" value="2">2<br>
<input type="radio" name="3" value="6">6<br>
<input type="radio" name="3" value="Error">Error<br></p>
<p>4. What will be the output of the following statements ?<br>
<b>int i = 3;</b><br>
<b>printf("%d%d",i,i++);</b><br>
<input type="radio" name="4" value="34">34<br>
<input type="radio" name="4" value="43">43<br>
<input type="radio" name="4" value="44">44<br>
<input type="radio" name="4" value="33">33<br></p>
<p>5. What will be the output of the following program ?<br>
<b>#include</b><br>
<b>void main()</b><br>
<b>{</b><br>
<b>int a = 36, b = 9;</b><br>
<b>printf("%d",a>>a/b-2);</b><br>
<b>}</b><br>
<input type="radio" name="5" value="9">9<br>
<input type="radio" name="5" value="7">7<br>
<input type="radio" name="5" value="5">5<br>
<input type="radio" name="5" value="none of these">none of these<br></p>
<p>6. int testarray[3][2][2] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};<br>
What value does testarray[2][1][0] in the sample code above contain?<br>
<input type="radio" name="6" value="11">11<br>
<input type="radio" name="6" value="7">7<br>
<input type="radio" name="6" value="5">5<br>
<input type="radio" name="6" value="9">9<br></p>
<p>7.Output of following program?<br>
<b>#include <stdio.h></b><br>
<b>int main()</b><br>
<b>{</b><br>
<b>  printf("%d", main);</b><br> 
<b>  return 0;</b><br>
<b>}</b><br>
<input type="radio" name="7" value="Address of main function">Address of main function<br>
<input type="radio" name="7" value="Compiler Error">Compiler Error<br>
<input type="radio" name="7" value="Runtime Error">Runtime Error<br>
<input type="radio" name="7" value="Some random value">Some random value<br></p>
<p>8.What’s going to happen when we compile and run the following C program snippet?<br>
<b>#include "stdio.h"</b><br>
<b>int main()</b><br>
<b>{</b><br>
<b> int a = 10;</b> <br>
<b>printf("=%d %d=",(a+1));</b><br> 
<b>return 0;</b><br>
<b>}</b><br>
<input type="radio" name="8" value="=11 0=">=11 0=<br>
<input type="radio" name="8" value="=11 X= where X would depend on Compiler implementation">=11 X= where X would depend on Compiler implementatio<br>
<input type="radio" name="8" value="Undefined behaviour">Undefined behaviour<br>
<input type="radio" name="8" value="Compiler Error due to missing argument for second %d">Compiler Error due to missing argument for second %d<br></p>
<p>9.output?<br/>
<b>#include <stdio.h></b><br>
<b>int i;</b><br/>
<b>int main()</b><br/>
<b>{</b>
<b>if (i);</b>
<b>else</b>
<b>printf("Ëlse");</b><
<b>return 0;</b><b>}</b>
<input type="radio" name="9" value="if block is executed">if block is executed<br/>
<input type="radio" name="9" value="else block is executed">else block is executed<br/>
<input type="radio" name="9" value="It is unpredictable as i is not initialized.">It is unpredictable as i is not initialized.<br/>
<input type="radio" name="9" value="Error: misplaced else">Error: misplaced else<br/></p>
<p>10.output?<br/>
<b>#include<stdio.h></b><br/>
<b>int main()</b><br/>
<b>{</b><br/>
<b>int n;</b><br/>
<b>for (n = 9; n!=0; n--)</b><br/>
<b>printf("n = %d", n--);<b><br/>
<b>return 0;</b><br/>
<b>}</b><br/>
<input type="radio" name="10" value="9 7 5 3 1">9 7 5 3 1<br/>
<input type="radio" name="10" value="9 8 7 6 5 4 3 2 1">9 8 7 6 5 4 3 2 1<br/>
<input type="radio" name="10" value="Infinite Loop">Infinite Loop<br/>
<input type="radio" name="10" value="9 7 5 3">9 7 5 3<br/></p>
<input type="hidden" value="<%out.print(input);%>" name="ans" class="but1">
<input type="submit" value="Send" name="q1" class="but1"/>
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
