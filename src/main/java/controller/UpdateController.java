package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UpdateService;


public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String date=request.getParameter("date");
		String title=request.getParameter("title");
		String description=request.getParameter("description");
		
		int updated=UpdateService.update(username,date,title,description);
		//System.out.println(updated);
		if(updated>0)
		request.getRequestDispatcher("AdminPage.jsp").forward(request, response);
	}

}
