package connectionString;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionString {

	public static Connection con;
	public static Connection connectionString() {
		//loading drivers for mysql
        try {
			Class.forName("com.mysql.jdbc.Driver");
		
	 //creating connection with the database 
         con=DriverManager.getConnection
                       ("jdbc:mysql://localhost:3306/aditya","root","root");
        

        } catch (ClassNotFoundException e) {
        	// TODO Auto-generated catch block
        	e.printStackTrace();
        } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
        }
        return con;
	}
}
