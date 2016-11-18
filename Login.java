import java.util.HashMap;

public class Login 
{
	private String username;
	private String password;
	HashMap<String, String> accounts = new HashMap<String, String>();
	
	public Login(String user, String pass)
	{
		username = user;
		password = pass;
		accounts.put("testacc", "testpwd");
	}
	

public boolean auth()
{
	if(accounts.containsKey(username) && (accounts.containsValue(password)))
	{
		return true;
	}
	else
		return false;
}
private void CreateAccount()
{
	
}
	
	
}
