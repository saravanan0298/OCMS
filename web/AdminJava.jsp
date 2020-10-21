<%-- 
    Document   : index
    Created on : 18 Mar, 2020, 5:48:43 PM
    Author     : sara
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- 
    Document   : index
    Created on : 18 Mar, 2020, 5:48:43 PM
    Author     : sara
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- 
    Document   : index
    Created on : 18 Mar, 2020, 5:48:43 PM
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
.nn
{
float: right;    
}
</style>
</head>
<body>
<div id="header">
<h1>V_LEARN</h1>
</div>

<div>
    
<ul>
<li class="nn"><a href="index.html"><b>Logout</b></a></li>
</ul>
</div>
    <center>
        <h2>WELCOME TO  JAVA COURSE MATERIAL SECTION</h2>
        <form action="JavaUploadServlet" method="post" enctype="multipart/form-data">
            <table width="400px" align="center" border="2">
                <tr>
                    <td align="center" colspan="2">FORM DETAILS</td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td>
                        <input type="text" required="required" name="firstname">
                    </td>
                </tr>
                </tr>
                                <tr>
                    <td>Select File</td>
                    <td>
                        <input type="file" required="required" name="file1">
                    </td>
                </tr>
                                <tr>
                    <td></td>
                    <td>
                        <input type="submit"  value="submit">
                    </td>
                </tr>
            </table>
            
        </form>
    </center>

<div id="foot">copyright reserved saravanan0298@gmail.com<div></body>
</body>
</html>
