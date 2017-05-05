<%@page import="service.DeleteService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%

	
	String username=request.getParameter("username");
	DeleteService.delete(username);
	response.sendRedirect("AdminPage.jsp");
	

%>
<form action="DeleteController" method="post">

<input type="submit" value="Delete" onClick="return confirm('Are you sure?')">

</form>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
</body>
</html>