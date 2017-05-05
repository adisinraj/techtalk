package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.DeleteService;

public class DeleteController extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("inside delete controller"+request.getParameter("username"));
		/*String username=request.getParameter("username");
		int deleted=DeleteService.delete(username);
		if(deleted>0)
			response.sendRedirect("ShowDescriptions.jsp");
		*/
	}

}
