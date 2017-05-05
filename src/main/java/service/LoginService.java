package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import connectionString.ConnectionString;
import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class LoginService {
	HttpSession session;
	PreparedStatement ps;
	public boolean authenticate(String userid,String password){
		try{

		
		        
				Connection con=ConnectionString.connectionString();
				PreparedStatement ps =con.prepareStatement
		                             ("select * from user where email=? and password=?");
		         ps.setString(1,userid);
		         ps.setString(2, password);
		         ResultSet rs =ps.executeQuery();
		         if(rs.next())
		         {
		        	 //String id=rs.getString("email");
		        	 //String name=rs.getString("name");
		        	 //System.out.println(id+" "+name);
		        	
		        	 return true;
		         }
		        
		      }catch(Exception e)
		      {
		    	  System.out.println("inside catch");
		          e.printStackTrace();
		      }
		return false;
		
		
			
		}
		
}

