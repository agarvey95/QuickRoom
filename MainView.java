package QR;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainView extends JFrame
{	
	private JPanel HomePanel;
	private JMenuBar MenuBar;
	
	private JMenuItem Home;
	private JMenuItem Exit;
	
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
        //edit later
        MenuBar.add(new JMenuItem("Login"));
	
	 MenuBar.add(Register); 
        Register.addActionListener()
        {
        	public void actiionPerformed(ActionEvent e)
        	{
        		panel = new JPanel();
        		panel.setPreferredSize(new Dimension(800,520));
        		panel.setLayout(new BorderLayout());
        		panel.setBackground(Color.RED);
        		
        		
        		title = new JLabel("Please enter your information to add an account");
        		title.setFont(new Font( "Times New Roman", Font.BOLD, 28));
        		panel.add(title, BorderLayout.NORTH);
        		
        		panel1 = new JPanel( new GridLayout(6,2));
        		fname = new JLabel("First Name:");
        		f = new JTextField(20);
        		
        		
        		lname = new JLabel("Last Name");
        		l = new JTextField(20);
        		
        		userName = new JLabel("Username :");
        		u = new JTextField(20);
        		
        		password = new JLabel("Password :");
        		p = new JTextField(20);
        		
        		creditcard = new JLabel("Credit Card number :");
        		cc = new JTextField(16);
        		
        		
        		panel2 = new JPanel();
        		confirm = new JButton("Confirm");
        		confirm.addActionListener(i);
        		panel2.add(confirm);
        		
        		
        		
        		panel1.add(fname);
        		panel1.add(f);
        		panel1.add(lname);
        		panel1.add(l);
        		panel1.add(userName);
        		panel1.add(u);
        		panel1.add(password);
        		panel1.add(p);
        		panel1.add(creditcard);
        		panel1.add(cc);
        		
        		panel.add(panel1, BorderLayout.CENTER);
        		panel.add(panel2, BorderLayout.SOUTH);
        		
			}
			
        	}
        }
        
        
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

