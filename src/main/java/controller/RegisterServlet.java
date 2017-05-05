package controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectionString.ConnectionString;
import service.RegisterService;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String userid = request.getParameter("userid");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		RegisterService regisService=new RegisterService();
		boolean registered=regisService.register(userid,name,password);
		
		if(registered)
			response.sendRedirect("Login.jsp");
		else
			response.sendRedirect("Error.jsp");
		
	}
	
	

}
