package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connectionString.ConnectionString;

public class DeleteService {

	public static void delete(String username){
	
		
		Connection con=ConnectionString.connectionString();
		try {
			PreparedStatement query=con.prepareStatement("delete from techtalksdetails where presenter=?");
			query.setString(1,username);
			int deleted=query.executeUpdate();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
