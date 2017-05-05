package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connectionString.ConnectionString;

public class UpdateService {
	
	public static int update(String username, String date, String title, String description){
		int i = 0;
		Connection con=ConnectionString.connectionString();
		try {
			PreparedStatement ps=con.prepareStatement("update techtalksdetails set date=?,title=?,description=?,presenter=? where presenter=?");
			ps.setString(1,date);		
			ps.setString(2,title);
			ps.setString(3,description);
			ps.setString(4,username);
			ps.setString(5,username);
			
			 i= ps.executeUpdate();
			
			//System.out.println("inside update connection "+i);
			
		} catch (SQLException e) {
			System.out.println("inside update catch");
			e.printStackTrace();
		}
		return i;
		
		
	}
}
