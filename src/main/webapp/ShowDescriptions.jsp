
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="connectionString.DescriptionConnection"%>

<%@page import="connectionString.ConnectionString" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% String s=(String) session.getAttribute("username");
	 
	if(s==null)
		response.sendRedirect("Login.jsp");
	%>

<head>
		<title>Elements - Alpha by HTML5 UP</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />
		
	


</head>
<body>
<div style="text-align: center">

	<div>
		<input type="text" value="Welcome ,<%= request.getParameter("username") %>" disabled="enable"> 
		<form method="post" action="RequestController"><input type="submit" value="Request TechTalks" ></form>
		<form action="Logout" method="post"><input type="submit" value="Logout"></form></div>
<table>
<tbody>
<tr>
<td name="date">Date</td>
<td name="title">Title</td>
<td name="descriptions">Descriptions</td>
<td name="presenter">Presenter</td>
</tr>
<% 


	ResultSet rs=DescriptionConnection.getResultSet();
    //System.out.println("in show desc:"+rs);
	 while(rs.next())
	 {
		out.print("<tr>");
		out.print("<td>"+rs.getDate(1)+"</td>");
		out.print("<td>"+rs.getString(2)+"</td>");
		out.print("<td>"+rs.getString(3)+"</td>");
		out.print("<td>"+rs.getString(4)+"</td>");
		out.println("<td><a href=RegisterToTalk.java>click to register</a></td>");
			
		out.print("</tr>");
		
	 }
 
%>





</tbody>

</table>
</div>
</body>
</html>