<%@page import="connectionString.UpdateConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="UpdateController">
<%
	ResultSet rs=UpdateConnection.getResultSet(request.getParameter("username"));
	while(rs.next())
	{%>
		<br>Date<input type="date" name="date" value="<%=rs.getString(1)%>">
		<br>Presenter<input type="text" name="username" value="<%=rs.getString(4)%>">
		<br>Title<input type="text" name="title" value="<%=rs.getString(2)%>">
		<br>Description<input type="text" name="description" value="<%= rs.getString(3)%>">
	<%	
	}
%>	
<br><input type="submit" value="Update">
</form>
</body>
</html>