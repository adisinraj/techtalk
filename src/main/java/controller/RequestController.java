package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectionString.ConnectionString;


public class RequestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  PrintWriter out;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		Connection con=ConnectionString.connectionString();
		try {
			PreparedStatement ps=con.prepareStatement("select * from user where name=?");
			
			ps.setString(1, username);
			ResultSet rs=ps.executeQuery();
			System.out.println(username);
			while(rs.next())
			{
				out.print(rs.getString("email")+" "+rs.getString("name"));
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
