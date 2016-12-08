package qr;

import java.sql.*;

public class Connection {

	private static String url = "jdbc:mysql://localhost:3306/quickroom1?autoReconnect=true&useSSL=false";
	private static String 	USERNAME = "root";
	private static String PASSWORD = "applepi1!";
	
	
	public static java.sql.Connection getConnection()
	{
		try
		{
			java.sql.Connection c = DriverManager.getConnection(url, USERNAME, PASSWORD);	
			return c;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	

}
