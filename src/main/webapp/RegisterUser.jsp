<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

		<title>TechTalks by Aditya</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
	
		<link rel="stylesheet" href="assets/css/main.css" />
	
</head>
<body>
<h1 style="text-align: center ; font-size: 50px">Register Here</h1>
<div style="text-align: center">
<form action="RegisterServlet" method="post">

<br><input type="text" name="userid" placeholder="EmailId">
<br><input type="text" name="name" placeholder="Name">
<br><input type="password" name="password" placeholder="Password">
<br><input type="submit" value="Register">

</form>
</div>

</body>
</html>