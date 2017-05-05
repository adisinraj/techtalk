package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AddtalkService;

public class AddtalkController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside add controlller");
		
		String name=request.getParameter("name");
		String date=request.getParameter("date");
		String title=request.getParameter("title");
		String description=request.getParameter("description");
		
		int inserted=AddtalkService.insertDetail(name,date,title,description);
		if(inserted>0){
			response.sendRedirect("ShowDescriptions.jsp");
		 }else
			System.out.println("Not inserted");
		
		
	}

}
