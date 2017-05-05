package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connectionString.ConnectionString;

public class AddtalkService {
	
	public static int insertDetail(String name,String date, String title, String description)
	{
		int inserted = 0;
	//	Date date=new Date();
	//	SimpleDateFormat ft = new SimpleDateFormat ("y-MM-dd");
	//	System.out.println(ft.format(date1));
	//	System.out.println(description +"  "+title);
		Connection con=ConnectionString.connectionString();
			try {
			
			
			
			PreparedStatement ps=con.prepareStatement("insert into techtalksdetails(presenter,date,title,description) values(?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,date);
			ps.setString(3,title);
			ps.setString(4,description);
			
		
			 inserted=ps.executeUpdate();
			
		
	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return inserted;	
		
	}

}
