package QR;


public class MainView extends JFrame
{	
	private JPanel HomePanel;
	private JMenuBar MenuBar;
	
	private JMenuItem Home;
	private JMenuItem Exit;
	private JMenuItem Register;
	private JMenuItem Login;
	
	ActionListener i;
	
	
	public void createPanel()
	{
		//set methods
		this.HomePanel = new HomeView();
		this.MenuBar = new JMenuBar();
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
        setPreferredSize(new Dimension(810, 600));
        setResizable(false);       
        
		getContentPane().add(HomePanel, BorderLayout.CENTER);
        pack();
        setVisible(true);
        createMenu();
	}
	public void createMenu()
	{
		MenuBar.setOpaque(true);
        MenuBar.setBackground(new Color(154, 165, 127));
        MenuBar.setPreferredSize(new Dimension(200, 20));
        /*
         *Anthony can you find the code to make all the menu items be on the right hand of the screen instead
         *of spaced out the way they are? 
         */
        
        Home = new JMenuItem("Home");
        Register = new JMenuItem("Register");
        Login = new JMenuItem("Login");
        Exit = new JMenuItem("Exit");
        
        MenuBar.add(Home);
        Home.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                Runner.removeAll();
                Runner.switchHome(); 
            }
        });
        
       MenuBar.add(Login); 
       Login.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		JTextField userName = new JTextField();
        		JTextField passWord = new JPasswordField();
        		Object [] message = {
        		    "Username:", userName,
        		    "Password:", passWord
        		};

        		int inputbox = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
        		if (inputbox == JOptionPane.OK_OPTION) {
        		    if (userName.getText().equals("h") && passWord.getText().equals("h")) {
        		        System.out.println("Login Successful!");
        		        //Enter code for user transfers to new GUI page.
        		    } else {
        		        System.out.println("Login Failed.");
        		    }
        		} else {
        		    System.out.println("Login Cancelled.");      		
        	}}});
        
       	MenuBar.add(Register); 
       	Register.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		//JTextField createUsername = new JTextField();
        		//JTextField CreatePassword = new JPasswordField();
        		//add methods to store into database.
        	}});
       	
        MenuBar.add(Exit);
        Exit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                System.exit(0);
            }
        });
        
        setJMenuBar(MenuBar);
	}
}
