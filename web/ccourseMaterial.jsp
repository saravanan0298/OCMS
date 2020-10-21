<%-- 
    Document   : ccourseMaterial
    Created on : 20 Mar, 2020, 11:17:29 AM
    Author     : sara
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

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
    height:1350px;
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
    left:450px;
    
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
.nn
{
float: right;    
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
<li><a href="quiz.jsp">Quiz</a></li>
<li>  <a href="ccourseMaterial.jsp" class="active">Course Material</a><li>
<li> <a href="ccoursevideo.jsp">Course Videos</a></li>
<li>  <a href="http://localhost:8080/">Complier</a></li>
<li class="nn">  <a href="index.html"><b>Logout</b></a></li>
</ul>

<div class="but">
    <input type="submit" class="button" name="q1" value="Download"><br><br>
</div>
<h2>Welcome to Course Download Section</h2>

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
if(input.equals("Download"))
               {
               %>    
               <style>
                   .but
                {
                 height:1350px;
                }
                   </style>

<%@page import="com.servlet.db.DB" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.Connection" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            tr,td,th{
                padding: 20px;
                text-align: center;
            }
        </style>
    </head>
    <body>
       <br/><br/><br/><br/>
    <center>
        <%!
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        %>
        <table border="2">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>File Name</th>
                <th>Download</th>
            </tr>
            <%
                con=DB.getConnection();
                String sql="select *from ccoursematerial";
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()){
                %>
                <tr>
                    <td><%=rs.getInt(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td><%=rs.getString(3)%></td>
                    <td><a href="DownloadServlet?fileName=<%=rs.getString(3)%>">Download</a></td>
                </tr>
                <%
                }
                %> 
        </table><br/>
    </center>
    </body>
</html>
    <% 
               }
}catch(Exception e)
{
    System.out.println(e);
}
%>