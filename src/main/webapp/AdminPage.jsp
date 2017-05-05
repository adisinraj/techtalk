
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
		
		<input type="button" value="Accept Requests">
		<form method="post" action="Logout"><input type="submit" value="Logout"></form>
		
		<a href="Addtalk.jsp"><input type="button" value="Add TechTalks"></a>	
	</div>
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
   
	 while(rs.next())
	 {
		out.print("<tr>");
		out.print("<td>"+rs.getDate(1)+"</td>");
		out.print("<td>"+rs.getString(2)+"</td>");
		out.print("<td>"+rs.getString(3)+"</td>");
		out.print("<td>"+rs.getString(4)+"</td>");
		
		 request.setAttribute("username", rs.getString(4));
		
		%>
		
		
		
		 <td><a href="Delete.jsp?username=<%=rs.getString(4) %>"><button>Click to delete</button></a></td>
			<td><a href="Update.jsp?username=<%=rs.getString(4) %>"><button>Click to update</button></a></td>
		
		<%
		
		out.print("</tr>");
		
	 }
	
%>





</tbody>

</table>
</div>
</body>
</html>