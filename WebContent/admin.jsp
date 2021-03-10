<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="UserRegistration">
<%
if (session.getAttribute("username")==null)
{
	response.sendRedirect("login.jsp");
	
}
%>

<h3>Admin Module</h3>
<br>
<h4>User Profile!</h4>
<a href="Userdetails">USER DETAILS</a>

<c:forEach var="user" items="${ arr } ">
<c:out value="${user }"/><br>
</c:forEach>

</form>


</body>
</html>