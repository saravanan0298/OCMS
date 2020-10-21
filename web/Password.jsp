<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%
String OldPassword = request.getParameter("gmail");
String Newpass = request.getParameter("password");
String conpass = request.getParameter("Repassword");
Connection con = null;
Statement st = null;
String pass = "";
try {
Class.forName("com.mysql.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/ocms";
con = DriverManager.getConnection(url, "root", "");
st = con.createStatement();
ResultSet rs = st.executeQuery("select * from signup where Email= '"+ OldPassword + "'");
if (rs.next()) { 
pass = rs.getString("Email");
} 
if(Newpass.equals(conpass))
{
if (pass.equals(OldPassword)) {
st = con.createStatement();
int i = st.executeUpdate("update signup set password='"+ Newpass + "'where Email='"+OldPassword + "'");
String li="successfullychangePassword.html";
response.sendRedirect(li);
System.out.println("Password changed successfully");
st.close();
con.close();
} else {
    String li="DoesNotMatchPassword.html";
    response.sendRedirect(li);
}
/*}else{
out.println("new password and confirm new password is not matching");
}*/
}
} catch (Exception e) {
out.println(e);
}
%>