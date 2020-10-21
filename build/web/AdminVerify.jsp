<html>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%
String ValidUser=request.getParameter("Fname");
String ValidPass=request.getParameter("Repassword");
try
{   
Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ocms","root","");
PreparedStatement stmt=conn.prepareStatement("select *from courseadmin where name=? and password=? ");
stmt.setString(1,ValidUser);
stmt.setString(2, ValidPass);
ResultSet rs=stmt.executeQuery();
if(rs.next())
{
    String course=rs.getString("course");
    if(course.equals("C"))
    {
        String li="AdminC.jsp";
        response.sendRedirect(li);
    }
    else if(course.equals("C++"))
	{
	String li="Admincplus.jsp";
	response.sendRedirect(li);
	}
	else if(course.equals("Java"))
	{
	String li="AdminJava.jsp";
	response.sendRedirect(li);
	}
}
}
catch(Exception e)
{
	out.println("error"+e);
}
%>
</body>
</html>
