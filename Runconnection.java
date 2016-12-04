import java.sql.Connection;

public class Runconnection {

	// Establishes a connection to  the database
	public static void main(String[] args) {
		
		Manager mg = new Manager();
		
		Connection conn = null;
		if( conn == null)
		{
			mg.getConnection();
			
		}
	
		

	}

}
