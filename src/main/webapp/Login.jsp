<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<title>TechTalks by Aditya</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
	
		<link rel="stylesheet" href="assets/css/main.css" />
		
	</head>
	<body>
	
	
		<div id="page-wrapper">

			<!-- Header -->
				<header id="header">
					<h1><a href="index.html">TechTalks</a> by Aditya</h1>
					<nav id="nav">
						<ul>
							
							<li><a href="RegisterUser.jsp" class="button">Sign Up</a></li>
						</ul>
					</nav>
				</header>

			<!-- Main -->
				<section id="main" class="container 75%">
					<header>
						<h2>Login</h2>
						<p>Please enter username and password.</p>
					</header>
					<div class="box">
						<form method="post" action="LoginServlet">
							<div class="row uniform 50%">
								<div class="6u 12u(mobilep)">
									<input type="text" name="username" id="name" value="" placeholder="Name" />
								</div>
								
								<div class="6u 12u(mobilep)">
									<input type="password" name="password" id="email" value="" placeholder="Password" />
								</div>
								
								
							</div>
							
							<div class="row uniform">
								<div class="12u">
									<ul class="actions align-center">
										<li><input type="submit" value="Login" /></li>
									</ul>
								</div>
							</div>
						</form>
					</div>
				</section>

			

		</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.dropotron.min.js"></script>
			<script src="assets/js/jquery.scrollgress.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="assets/js/main.js"></script>

	</body>
</html>