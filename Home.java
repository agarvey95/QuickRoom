import java.util.Scanner;

public class Home {

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("1: for new acc, 2: to sign in");
		int choice = kb.nextInt();
		
		switch (choice)
		{
		case 1: //do something
			break;
		case 2: menu();
			break;
		}
	}
	private static void menu()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your username");
		String username = kb.nextLine();
		System.out.println("Please enter your password");
		String password = kb.nextLine();
		
		Login check = new Login(username, password);

	    if(check.auth()) 
	    {	
	        System.out.println("You are logged in");
	    }
	    else
	    {
	    	System.out.println("Incorrect corrdentials");
	    	main(null);
	    }
	}

}
