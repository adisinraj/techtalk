package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connectionString.ConnectionString;

public class RegisterService {
	

	public boolean register(String userid, String name, String password) {
		boolean executed=false;
		try {
			
			
			Connection con=ConnectionString.connectionString();
		
			PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?)");
			ps.setString(1,userid);
			ps.setString(2,name);
			ps.setString(3,password);
			
			int execute=ps.executeUpdate();
			if(execute>0)
				executed=true;
		
			System.out.println(executed);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return executed;
		
	}

	
}
