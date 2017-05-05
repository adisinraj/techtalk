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
<form method="post" action="AddtalkController">
<br><input type="text" placeholder="Enter Date" name="date">
<br><input  type="text" placeholder="Enter Name" name="name">
<br><input type="text" placeholder="Enter Title" name="title">
<br><div class="row uniform 50%">
		<div class="12u">
				<textarea name="description" id="message" placeholder="Enter Description" rows="6"></textarea>
		</div>
	</div>
<br>
<input type="submit" value="Add" >

</form>

</body>
</html>