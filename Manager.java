import java.sql.*;


public class Manager {

	private static Connection conn;
	private static String url = "jdbc:mysql://localhost:3306/quickroom1?autoReconnect=true&useSSL=false";
	private static String user= "root";
	private static String password = "applepi1!";
	
	//Sets up the connection to the Database with the credentials
	public  void setConnection()
	{
		try
		{
		conn = DriverManager.getConnection(url, user, password);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	// Returns the connection that was set up
	public Connection getConnection()
	{
		return conn;
	}
}
