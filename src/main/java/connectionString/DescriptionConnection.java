package connectionString;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DescriptionConnection {

	public static ResultSet getResultSet(){
		//System.out.println("inside descconn");
		
		Connection con=ConnectionString.connectionString();
		PreparedStatement ps;
		ResultSet resultset = null;
		try {
			ps = con.prepareStatement("select * from techtalksdetails");
			 resultset=ps.executeQuery();
			//  System.out.println("resultset in descconn:"+resultset);
			
		} catch (SQLException e) {
		
			System.out.println("inside catch");
			e.printStackTrace();
		}
		
		
		return resultset;
		
		
		
	}
}
