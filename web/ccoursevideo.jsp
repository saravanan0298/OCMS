<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/quiz.css">
<style>
    .nn{
    float:right;
}
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
</style>
</head>
<body>
<form action="" method="post">
<div id="header">
<h1>V_LEARN</h1>
</div>
    
<ul>
<li><a href="cindex.jsp">C</a></li>
<li><a href="quiz.jsp" >Quiz</a></li>
<li>  <a href="ccourseMaterial.jsp">Course Material</a><li>
<li> <a href="cplusCourseVideo.html" class="active">Course Videos</a></li>
<li>  <a href="http://localhost:8080/">Complier</a></li>
<li class="nn">  <a href="index.html"><b>Logout</b></a></li>
</ul>

<div class="but">
    <input type="submit" class="button" name="q1" value="Basic C"><br><br>
    <input type="submit" class="button" name="q1" value="CONTROL"><br><br>
    <input type="submit" class="button" name="q1" value="LOOPING"><br><br>
    <input type="submit" class="button" name="q1" value="ARRAY"><br><br>
    <input type="submit" class="button" name="q1" value="STRUCT"><br><br>
</div>
<h2>Welcome to Video section</h2>

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
if(input.equals("Basic C"))
               {
               %>    
               <style>
                   .but
                {
                 height:700px;
                }
                   </style>

    <form action="#" method="post">
<body>
<video width="900" controls>
<source src="1.mp4" type="video/mp4">
</body>
</form>
<%
               }
if(input.equals("CONTROL"))
{
 %>
 <style>
     .but
     {
         height:700px;
     }
 </style>
 <form action="#" method="post">
<body>
<video width="900" controls>
<source src="2.mp4 " type="video/mp4">
</body>
</form>
 <%
               }
if(input.equals("LOOPING"))
{
 %>
 <style>
     .but
     {
         height:700px;
     }
 </style>
 <form action="#" method="post">
<body>
<video width="900" controls>
<source src="3.mp4 " type="video/mp4">
</body>
</form>
 <%
               } 
if(input.equals("ARRAY"))
{
 %>
 <style>
     .but
     {
         height:700px;
     }
 </style>
 <form action="#" method="post">
<body>
<video width="900" controls>
<source src="4.mp4 " type="video/mp4">
</body>
</form>
 <%
               } 
if(input.equals("STRUCT"))
{
 %>
 <style>
     .but
     {
         height:700px;
     }
 </style>
 <form action="#" method="post">
<body>
<video width="900" controls>
<source src="5.mp4 " type="video/mp4">
</body>
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


