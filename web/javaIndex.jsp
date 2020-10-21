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
<li><a class="active" href="javaIndex.jsp">Java</a></li>
<li><a href="javaquiz.jsp">Quiz</a></li>
<li>  <a href="JavaCourseMaterial.jsp">Course Material</a><li>
<li> <a href="javaVideo.jsp">Course Videos</a></li>
<li>  <a href="http://localhost:8080/">Complier</a></li>
<li class="nn"><a href="index.html"><b>Logout</b></a></li>
</ul>
</div>

  <h2>About java course</h2>
  <p><b>Java is a general-purpose programming language that is class-based, object-oriented, and designed to have as few implementation dependencies as possible.
          It is intended to let application developers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.
          Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture.
          The syntax of Java is similar to C and C++, but it has fewer low-level facilities than either of them.</p><br>
  
<p>Java was originally developed by James Gosling at Sun Microsystems (which has since been acquired by Oracle) and released in 1995 as a core component of Sun Microsystems' Java platform.
The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses. 
As of May 2007, in compliance with the specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GNU General Public License. 
Meanwhile, others have developed alternative implementations of these Sun technologies, such as the GNU Compiler for Java (bytecode compiler), GNU Classpath (standard libraries), and IcedTea-Web (browser plugin for applets).</p>



<div id="foot">copyright reserved saravanan0298@gmail.com<div></body>

</body>
</html>