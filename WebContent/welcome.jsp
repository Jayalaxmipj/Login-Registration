<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
if(session.getAttribute("user")==null)
{
	response.sendRedirect("login.jsp");
	
}
%>


<h2>Welcome to $ { user }</h2>
<br>
<div class="container">
<a href="welcome.jsp">Home</a>
<a href="about.jsp">About Us</a>
<a href="admin.jsp">Admin</a>

</div>
<br>
<form action="Logout">
<input type="submit" value="Logout">

</form>



</body>
</html>