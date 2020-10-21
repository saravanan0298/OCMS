<html>
<body  text ="blue">
<form>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%
String q1=request.getParameter("1");
String q2=request.getParameter("2");
String q3=request.getParameter("3");
int count=0;
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ocms","root","");
PreparedStatement stmt=conn.prepareStatement("select *from quiz");
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
	out.println("You score is"+count);
	if(count<=2)
	{
		out.println("fail");
	}
	else{
		out.println("pass");
	}
}
}
catch(Exception e)
{
	out.println("error"+e);
}
%>
</form>
</body>
</html>
