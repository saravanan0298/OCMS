<html>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%
String Fname=request.getParameter("Fname");
String Lname=request.getParameter("Lname");
String DOB=request.getParameter("DOB");
String Age=request.getParameter("Age");
String Sex=request.getParameter("Gender");
String phoneno=request.getParameter("PhoneNo");
String Qualification=request.getParameter("degree");
String password=request.getParameter("Repassword");
String email=request.getParameter("email");
String course=request.getParameter("course");
int Ageint=Integer.parseInt(Age);
try
{
	Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ocms","root",""); 
Statement st=conn.createStatement();
String strQuery = "SELECT COUNT(*) FROM signup where email='"+email+"'";
ResultSet rs = st.executeQuery(strQuery);
rs.next();
String Countrow = rs.getString(1);
System.out.println(Countrow);
if(Countrow.equals("0")){
PreparedStatement stmt=conn.prepareStatement("insert into signup values(?,?,?,?,?,?,?,?,?,?)");
stmt.setString(1,Fname);
stmt.setString(2,Lname);
stmt.setString(3, DOB);
stmt.setInt(4,Ageint);
stmt.setString(5,Sex);
stmt.setString(6,phoneno);
stmt.setString(7,Qualification);
stmt.setString(8,email);
stmt.setString(9,course);
stmt.setString(10,password);
stmt.executeUpdate();
String li="SuccessfullyRegistered.html";
response.sendRedirect(li);
}
else{
    String li="RestrictUser.html";
            response.sendRedirect(li);
       System.out.println("User name or Email already exists !");
}
}
catch(Exception e)
{
	out.println("error"+e);
}
%>
</body>
</html>









