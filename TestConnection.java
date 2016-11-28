import java.sql.*;
public class TestConnection {

	public static void main(String[] args) {
	
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://mysql3.gear.host:3306/quickroom1?autoReconnect=true&useSSL=false", "agarvey95","QuickRoom1!");
			
			if( con != null)
			{
				System.out.println("You are connected");
			}
			
			else
			{
				System.out.println("You are not connected");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
