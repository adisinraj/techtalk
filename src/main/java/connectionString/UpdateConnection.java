package connectionString;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateConnection {

	public static ResultSet getResultSet(String username){
		
		Connection con=ConnectionString.connectionString();
		PreparedStatement ps;
		ResultSet resultset = null;
		try {
			ps = con.prepareStatement("select * from techtalksdetails where presenter=?");
			ps.setString(1,username);
			 resultset=ps.executeQuery();
			
		} catch (SQLException e) {
		
			System.out.println("inside catch");
			e.printStackTrace();
		}
		
		
		return resultset;
		
		
		
	}
}
