package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter out;
   
    public LoginServlet() {
     
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		HttpSession session=request.getSession();
		
		if(username.equals("admin") && password.equals("admin"))
		{
			System.out.println("admin");
			session.setAttribute("username", username);
			response.sendRedirect("AdminPage.jsp");
		//	getServletContext().getRequestDispatcher("/AdminPage.jsp").forward(request, response);
		
		}
		else{
		LoginService loginservice=new LoginService();
		boolean respond=loginservice.authenticate(username, password);
		System.out.println(respond);
		if(respond)
			response.sendRedirect("ShowDescriptions.jsp?username="+username);
		else
			response.sendRedirect("Error.jsp");
		}
	}

}
