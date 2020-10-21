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
<li><a href="cplusIndex.jsp">C++</a></li>
<li><a href="cplusQuiz.jsp" class="active">Quiz</a></li>
<li>  <a href="cplusCourseMaterial.jsp">Course Material</a><li>
<li> <a href="cplusCourseVideo.jsp">Course Videos</a></li>
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
<p>1. Which of the following is the correct syntax of including a user defined header files in C++?<br/>
<input type="radio" name="1" value="#include <userdefined.h>">#include <userdefined.h><br/>
<input type="radio" name="1" value="#include <userdefined>">#include <userdefined><br/>
<input type="radio" name="1" value="#include “userdefined”">#include “userdefined”<br/>
<input type="radio" name="1" value="#include [userdefined]">#include [userdefined]<br/></p>
<p>2. Which of the following is a correct identifier in C++?<br/>
<input type="radio" name="2" value="7var_name">7var_name<br/>
<input type="radio" name="2" value="7VARNAME">7VARNAME<br/>
<input type="radio" name="2" value="VAR_1234">VAR_1234<br/>
<input type="radio" name="2" value="$var_name">$var_name<br/></p>
<p>3. Which of the following is called address operator?<br/>
<input type="radio" name="3" value="*">*<br/>
<input type="radio" name="3" value="&">&<br/>
<input type="radio" name="3" value="_">_<br/>
<input type="radio" name="3" value="%">%<br/></p>
<p>4. Which of the following is used for comments in C++?<br/>
<input type="radio" name="4" value="// comment">// comment<br/>
<input type="radio" name="4" value="/* comment */">/* comment */<br/>
<input type="radio" name="4" value="both // comment or /* comment */">both // comment or /* comment */<br/>
<input type="radio" name="4" value="// comment */">// comment */<br/></p>
<p>5. What are the actual parameters in C++?<br/>
<input type="radio" name="5" value="Parameters with which functions are called">Parameters with which functions are called<br/>
<input type="radio" name="5" value="Parameters which are used in the definition of a function">Parameters which are used in the definition of a function<br/>
<input type="radio" name="5" value="Variables other than passed parameters in a function">Variables other than passed parameters in a function<br/>
<input type="radio" name="5" value="Variables that are never used in the function">Variables that are never used in the function<br/></p>
<p>6. What are the formal parameters in C++?<br/>
<input type="radio" name="6" value="Parameters with which functions are called">Parameters with which functions are called<br/>
<input type="radio" name="6" value="Parameters which are used in the definition of the function">Parameters which are used in the definition of the function<br/>
<input type="radio" name="6" value="Variables other than passed parameters in a function">Variables other than passed parameters in a function<br/>
<input type="radio" name="6" value="Variables that are never used in the function">Variables that are never used in the function<br/></p>
<p>7. Which function is used to read a single character from the console in C++?<br/>
<input type="radio" name="7" value="cin.get(ch)">cin.get(ch)<br/>
<input type="radio" name="7" value="getline(ch)">getline(ch)<br/>
<input type="radio" name="7" value="read(ch)">read(ch)<br/>
<input type="radio" name="7" value="scanf(ch)">scanf(ch)<br/></p>
<p>8. Which function is used to write a single character to console in C++?<br/>
<input type="radio" name="8" value="cout.put(ch)">cout.put(ch)<br/>
<input type="radio" name="8" value="cout.putline(ch)">cout.putline(ch)<br/>
<input type="radio" name="8" value="write(ch)">write(ch)<br/>
<input type="radio" name="8" value="printf(ch)">printf(ch)<br/></p>
<p>9. What are the escape sequences?<br/>
<input type="radio" name="9" value="Set of characters that convey special meaning in a program">Set of characters that convey special meaning in a program<br/>
<input type="radio" name="9" value="Set of characters that whose use are avoided in C++ programs">Set of characters that whose use are avoided in C++ programs<br/>
<input type="radio" name="9" value="Set of characters that are used in the name of the main function of the program">Set of characters that are used in the name of the main function of the program<br/>
<input type="radio" name="9" value="Set of characters that are avoided in cout statements">Set of characters that are avoided in cout statements<br/>
</p>
<p>10. Who created C++?<br/>
<input type="radio" name="10" value="Bjarne Stroustrup">Bjarne Stroustrup<br/>
<input type="radio" name="10" value="Dennis Ritchie">Dennis Ritchie<br/>
<input type="radio" name="10" value="Ken Thompson">Ken Thompson<br/>
<input type="radio" name="10" value="Brian Kernighan">Brian Kernighan<br/>
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
               %>    
              <style>
                   .but
                {
                 height:1350px;
                }
                   </style>
                 <form action="#" method="post">
                       <h1>Quiz2</h1>
<p>1. Which of the following escape sequence represents carriage return?<br/>
<input type="radio" name="1" value="\r">\r<br/>
<input type="radio" name="1" value="\n">\n<br/>
<input type="radio" name="1" value="\n\r">\n\r<br/>
<input type="radio" name="1" value="\c">\c<br/></p>
<p>2. Which of the following escape sequence represents tab?<br/>
<input type="radio" name="2" value="\t">\t<br/>
<input type="radio" name="2" value="\t\r">\t\r<br/>
<input type="radio" name="2" value="\b">\b<br/>
<input type="radio" name="2" value="\a">\a<br/></p>
<p>3. Which of the following is called insertion/put to operator?<br/>
<input type="radio" name="3" value="<<"> <<    <br/>
<input type="radio" name="3" value=">>"> >>    <br/>
<input type="radio" name="3" value=">">  >     <br/>
<input type="radio" name="3" value="<">  <     <br/></p>
<p>4. Which of the following is called extraction/get from operator?<br/>
<input type="radio" name="4" value="<<"><< <br/> 
<input type="radio" name="4" value=">>"> >>    <br/>
<input type="radio" name="4" value=">">  >     <br/>
<input type="radio" name="4" value="<">  <     <br/></p>
<p>5. A language which has the capability to generate new data types are called ________________<br/>
<input type="radio" name="5" value="Extensible">Extensible <br/>
<input type="radio" name="5" value="Overloaded">Overloaded  <br/>
<input type="radio" name="5" value="Encapsulated">Encapsulated <br/>
<input type="radio" name="5" value="Reprehensible">Reprehensible <br/></p> 
<p>6. Wrapping data and its related functionality into a single entity is known as _____________<br/>
<input type="radio" name="6" value="Abstraction">Abstraction<br/>
<input type="radio" name="6" value="Encapsulation">Encapsulation<br/>
<input type="radio" name="6" value="Polymorphism">Polymorphism<br/>
<input type="radio" name="6" value="Modularity">Modularity<br/>
<p>7. How structures and classes in C++ differ?<br/>
<input type="radio" name="7" value="In Structures, members are public by default whereas, in Classes, they are private by default">In Structures, members are public by default whereas, in Classes, they are private by default<br/>
<input type="radio" name="7" value="In Structures, members are private by default whereas, in Classes, they are public by default">In Structures, members are private by default whereas, in Classes, they are public by default<br/>
<input type="radio" name="7" value="Structures by default hide every member whereas classes do not">Structures by default hide every member whereas classes do not<br/>
<input type="radio" name="7" value="Structures cannot have private members whereas classes can have"> Structures cannot have private members whereas classes can have<br/></p>
<p>8. What does polymorphism in OOPs mean?<br/>
<input type="radio" name="8" value="Concept of allowing overiding of functions">Concept of allowing overiding of functions<br/>
<input type="radio" name="8" value="Concept of hiding data">Concept of hiding data<br/>
<input type="radio" name="8" value="Concept of keeping things in differnt modules/files">Concept of keeping things in differnt modules/files<br/>
<input type="radio" name="8" value="Concept of wrapping things into a single unit">Concept of wrapping things into a single unit<br/>
<p>9. Which concept allows you to reuse the written code?<br/>
<input type="radio" name="9" value="Encapsulation">Encapsulation<br/>
<input type="radio" name="9" value="Abstraction">Abstraction<br/>
<input type="radio" name="9" value="Inheritance">Inheritance<br/>
<input type="radio" name="9" value="Polymorphism">Polymorphism<br/></p>
<p>10. Which of the following shows multiple inheritances?<br/>
<input type="radio" name="10" value="A->B->C">A->B->C<br/>
<input type="radio" name="10" value="A->B; A->C">A->B; A->C<br/>
<input type="radio" name="10" value="A,B->C">A,B->C<br/>
<input type="radio" name="10" value="B->A">B->A<br/></p>
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
<p>1. How access specifiers in Class helps in Abstraction?<br/>
<input type="radio" name="1" value="123">They does not helps in any way<br/>
<input type="radio" name="1" value="They allows us to show only required things to outer world">They allows us to show only required things to outer world<br/>
<input type="radio" name="1" value="123">They help in keeping things together<br/>
<input type="radio" name="1" value="123">Abstraction concept is not used in classes<br/>
<p>2. C++ is ______________<br/>
<input type="radio" name="2" value="123">a) procedural programming language<br/>
<input type="radio" name="2" value="123">b) object oriented programming language<br/>
<input type="radio" name="2" value="123">c) functional programming language<br/>
<input type="radio" name="2" value="both procedural and object oriented programming language">both procedural and object oriented programming language<br/></p>
<p>3. What does modularity mean?<br/>
<input type="radio" name="3" value="123">Hiding part of program<br/>
<input type="radio" name="3" value="Subdividing program into small independent parts">Subdividing program into small independent parts<br/>
<input type="radio" name="3" value="123">Overriding parts of program<br/>
<input type="radio" name="3" value="123">Wrapping things into single unit<br/></p>
<p>4. What happens when objects s1 and s2 are added?<br/>
<b>string s1 = "Hello";</b>
<b>string s2 = "World";</b>
<b>string s3 = (s1+s2).substr(5);</b><br/>
<input type="radio" name="4" value="123">Error because s1+s2 will result into string and no string has substr() function<br/>
<input type="radio" name="4" value="123">Segmentation fault as two string cannot be added in C++<br/>
<input type="radio" name="4" value="The statements runs perfectly">The statements runs perfectly<br/>
<input type="radio" name="4" value="123">Run-time error<br/></p>
<p>5. What is operator overloading in C++?<br/>
<input type="radio" name="5" value="123">Overriding the operator meaning by the user defined meaning for user defined data type
<input type="radio" name="5" value="123">Redefining the way operator works for user defined types
<input type="radio" name="5" value="123">Ability to provide the operators with some special meaning for user defined data type
<input type="radio" name="5" value="All of the mentioned">All of the mentioned
<p>6. What is the syntax of overloading operator + for class A?<br/>
<input type="radio" name="6" value="A operator+(argument_list){}">A operator+(argument_list){}<br/>
<input type="radio" name="6" value="123">A operator[+](argument_list){}<br/>
<input type="radio" name="6" value="123">int +(argument_list){}<br/>
<input type="radio" name="6" value="123">int [+](argument_list){}<br/></p>
<p>7. How many approaches are used for operator overloading?<br/>
<input type="radio" name="7" value="123">1<br/>
<input type="radio" name="7" value="123">2<br/>
<input type="radio" name="7" value="3">3<br/>
<input type="radio" name="7" value="123">4<br/></p>
<p>8. Which of the following operator cannot be overloaded?<br/>
<input type="radio" name="8" value="123">+<br/>
<input type="radio" name="8" value="?:">?:<br/>
<input type="radio" name="8" value="123">–<br/>
<input type="radio" name="8" value="123">%<br/></p>
<p>9. Which of the following operator can be overloaded?<br/>
<input type="radio" name="5" value="123">?:<br/>
<input type="radio" name="5" value="123">::<br/>
<input type="radio" name="5" value="123">.<br/>
<input type="radio" name="5" value="==">==<br/></p>
<p>10. Which of the following operator cannot be used to overload when that function is declared as friend function?<br/>
<input type="radio" name="10" value="123">-=<br/>
<input type="radio" name="10" value="123">||<br/>
<input type="radio" name="10" value="123">==<br/>
<input type="radio" name="10" value="[]">[]<br/></p>
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
<p>1. In case of non-static member functions how many maximum object arguments a unary operator overloaded function can take?<br/>
<input type="radio" name="1" value="123">1<br/>
<input type="radio" name="1" value="123">2<br/>
<input type="radio" name="1" value="123">3<br/>
<input type="radio" name="1" value="0">0<br/></p>
<p>2. In case of non-static member functions how many maximum object arguments a binary operator overloaded function can take?<br/>
<input type="radio" name="2" value="123">1<br/>
<input type="radio" name="2" value="123">2<br/>
<input type="radio" name="2" value="123">3<br/>
<input type="radio" name="2" value="0">0<br/></p>
<p>3. In the case of friend operator overloaded functions how many maximum object arguments a unary operator overloaded function can take?<br/>
<input type="radio" name="3" value="1">1<br/>
<input type="radio" name="3" value="123">2<br/>
<input type="radio" name="3" value="123">3<br/>
<input type="radio" name="3" value="123">0<br/></p>
<p>4. In the case of friend operator overloaded functions how many maximum object arguments a binary operator overloaded function can take?<br/>
<input type="radio" name="4" value="123">1<br/>
<input type="radio" name="4" value="2">2<br/>
<input type="radio" name="4" value="123">3<br/>
<input type="radio" name="4" value="123">0<br/>
<p>5. What is a binary operator?<br/>
<input type="radio" name="5" value="123">Operator that performs its action on a single operand<br/>
<input type="radio" name="5" value="Operator that performs its action on two operand">Operator that performs its action on two operand<br/>
<input type="radio" name="5" value="123">Operator that performs its action on three operand<br/>
<input type="radio" name="5" value="123">Operator that performs its action on any number of operands<br/></p>
<p>6. Which is the correct example of a binary operator?<br/>
<input type="radio" name="6" value="123">++< br/>
<input type="radio" name="6" value="123">—<br/>
<input type="radio" name="6" value="123">Dereferencing operator(*)<br/>
<input type="radio" name="6" value="+">+<br/></p>
<p>7. Which is the correct example of a unary operator?<br/>
<input type="radio" name="7" value="123"> &<br/>
<input type="radio" name="7" value="123">==<br/>
<input type="radio" name="7" value="—">—<br/>
<input type="radio" name="7" value="123">/<br/></p>
<p>8. Which is called ternary operator?<br/>
<input type="radio" name="8" value="?:"> ?:<br/> 
<input type="radio" name="8" value="123"> &&<br/> 
<input type="radio" name="8" value="123"> |||<br/>
<input type="radio" name="8" value="123"> === <br/></p>
<p>9. Which is the correct statement about operator overloading?<br/>
<input type="radio" name="9" value="123">Only arithmetic operators can be overloaded<br/>
<input type="radio" name="9" value="123">Only non-arithmetic operators can be overloaded<br/>
<input type="radio" name="9" value="123">Precedence of operators are changed after overlaoding<br/>
<input type="radio" name="9" value="Associativity and precedence of operators does not change">Associativity and precedence of operators does not change<br/></p>
<p>10. Pick the incorrect statements out of the following.<br/>
<input type="radio" name="10" value="123">Operator overloading does not disturbs the precedence of operators<br/>
<input type="radio" name="10" value="Arity of operators can be changed using operator overloading">Arity of operators can be changed using operator overloading<br/>
<input type="radio" name="10" value="123">No new operators can be created<br/>
<input type="radio" name="10" value="123">All of the mentioned<br/></p>
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
 
<p>1. What will be the output of the following C++ code?<br/>
<b>#include <iostream></b><br/>
<b>#include <string></b><br/>
<b>using namespace std;</b><br/>
<b>class A</b><br/>
<b>{static int a;</b><br/>
 <b>public:</b><br/>
<b>	void show(){</b><br/>
<b>a++;</b><br/>
<b>cout<<"a: "<<a<<endl; </b>
<b> }</b> <br/>
<b>	void operator.()</b><br/>
<b>        {		cout<<"Objects are added\n";	}</b><br/>
<b>};</b><br/>
<b>class B</b><br/>
<b>{  public: };</b><br/>
 <b>int main(int argc, char const *argv[])</b><br/>
<b>{ A a1, a2;</b><br/>
<b>	return 0; }</b><br/>
<input type="radio" name="1" value="123">Run-time Error<br/>
<input type="radio" name="1" value="123">Runs perfectly<br/>
<input type="radio" name="1" value="123">Segmentation fault<br/>
<input type="radio" name="1" value="Compile-time error">Compile-time error<br/></p>

<p>2. What is the use of function call operator?<br/>
<input type="radio" name="2" value="123"> overloading the methods<br/>
<input type="radio" name="2" value="overloading the objects">overloading the objects<br/>
<input type="radio" name="2" value="123">overloading the parameters<br/>
<input type="radio" name="2" value="123">overloading the string<br/></p>
<p>3. Pick out the correct statement.<br/>
<input type="radio" name="3" value="virtual functions does not give the ability to write a templated function">virtual functions does not give the ability to write a templated function<br/>
<input type="radio" name="3" value="123">virtual functions does not give the ability to rewrite a templated function<br/>
<input type="radio" name="3" value="123">virtual functions does give the ability to write a templated function<br/>
<input type="radio" name="3" value="123">virtual functions does not give the ability to rewrite a simple function<br/>
<p>4. What will happen when the function call operator is overloaded?<br/>
<input type="radio" name="4" value="123">It will not modify the functions<br/>
<input type="radio" name="4" value="123">It will modify the functions<br/>
<input type="radio" name="4" value="123">It will modify the object<br/>
<input type="radio" name="4" value="It will modify the operator to be interpreted">It will modify the operator to be interpreted<br/></p>
<p>5. What is the use of functor?<br/>
<input type="radio" name="5" value="It makes the object “callable” like a function">It makes the object “callable” like a function<br/>
<input type="radio" name="5" value="123">It makes the class “callable” like a function<br/>
<input type="radio" name="5" value="123">It makes the attribute “callable” like a function<br/>
<input type="radio" name="5" value="123">It makes the argument “callable” like a function<br/></p>
<p>6. What is the role of a constructor in classes?<br/>
<input type="radio" name="6" value="123">To modify the data whenever required<br/>
<input type="radio" name="6" value="123">To destroy an object<br/>
<input type="radio" name="6" value="To initialize the data members of an object when it is created">To initialize the data members of an object when it is created<br/>
<input type="radio" name="6" value="123">To call private functions from the outer world<br/>
<p>7. Why constructors are efficient instead of a function init() defined by the user to initialize the data members of an object?<br/>
<input type="radio" name="7" value="123">Because user may forget to call init() using that object leading segmentation fault<br/>
<input type="radio" name="7" value="123">Because user may call init() more than once which leads to overwriting values<br/>
<input type="radio" name="7" value="123">Because user may forget to define init() function<br/>
<input type="radio" name="7" value="All of the mentioned">All of the mentioned<br/></p>
<p>8. What is a copy constructor?<br/>
<input type="radio" name="8" value="123">A constructor that allows a user to move data from one object to another<br/>
<input type="radio" name="8" value="A constructor to initialize an object with the values of another object">A constructor to initialize an object with the values of another object<br/>
<input type="radio" name="8" value="123">A constructor to check the whether to objects are equal or not<br/>
<input type="radio" name="8" value="123">A constructor to kill other copies of a given object.<br/>
<p>9. What happens if a user forgets to define a constructor inside a class?<br/>
<input type="radio" name="9" value="123">Error occurs<br/>
<input type="radio" name="9" value="123">Segmentation fault<br/>
<input type="radio" name="9" value="123">Objects are not created properly<br/>
<input type="radio" name="9" value="Compiler provides a default constructor to avoid faults/errors">Compiler provides a default constructor to avoid faults/errors<br/></p>
<p>10. How many parameters does a default constructor require?<br/>
<input type="radio" name="8" value="123">1<br/>
<input type="radio" name="8" value="123">2<br/>
<input type="radio" name="8" value="0">0<br/>
<input type="radio" name="8" value="123">3<br/></p>
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
