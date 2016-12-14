package QR;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;



import java.sql.*;


import qr.Runner;

public class HomeView extends JPanel
{
    private JLabel label;
    private JButton button;
    private JButton LoginButton;
    private JButton RegisterButton;
    private JTextField txtfield;
    private JPanel panel;
	private JLabel lblWelcomeToQuickroom;
	private static JTable table;
	
	private String url = "jdbc:mysql://localhost:3306/quickroom1?autoReconnect=true&useSSL=false";
	private static String 	USERNAME = "root";
	private static String PASSWORD = "applepi1!";
	private static java.sql.Connection c = null;
    
	public HomeView()
	{
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(800, 520));
		panel.setBackground(Color.RED);

		lblWelcomeToQuickroom = new JLabel("Welcome to QuickRoom");
		lblWelcomeToQuickroom.setFont(new Font("Times New Roman", Font.BOLD, 28));
		panel.add(lblWelcomeToQuickroom);
        
        
        
        LoginButton = new JButton("Login");        
        panel.add(LoginButton); 
        LoginButton.addActionListener(new ActionListener()
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
        
        RegisterButton = new JButton("Register");
        panel.add(RegisterButton);
        RegisterButton.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		JPanel inputPanel = new JPanel();
        		JTextField createFname = new JTextField();
        		JTextField createLname = new JTextField();
        		JTextField createUsername = new JTextField();
        		JTextField createPassword = new JTextField();
        		JTextField createCreditCard = new JTextField();
        		Object [] entry = {
            		    "First Name:", createFname,
            		    "Last Name:", createLname,
            		    "Create a username", createUsername,
            		    "Please enter Credit Card\ninformation for future purposes: ", createCreditCard
            		    
            		};
        		int inputbox = JOptionPane.showConfirmDialog(null, entry, "Login", JOptionPane.OK_CANCEL_OPTION);
        		if (inputbox == JOptionPane.OK_OPTION) {
        			
        		}
        		String input1 = createFname.getText();
        		String input2 = createLname.getText();
        		String input3 = createUsername.getText();
        		String input4 = createPassword.getText();
        		String input5 = createCreditCard.getText();
        		
        		inputPanel.add(createFname);
        		inputPanel.add(createLname);
        		inputPanel.add(createUsername);
        		inputPanel.add(createPassword);
        		inputPanel.add(createCreditCard);
        		
        		try
        		{
        			Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
        			String sql = "INSERT INTO account (First_name, Last_name, User_name, Password, Credit_Card_Number) VALUES (?,?,?,?,?);";
        			
        			PreparedStatement ps = conn.prepareStatement(sql);
        			ps.setString(1, input1);
        			ps.setString(2, input2);
        			ps.setString(3, input3);
        			ps.setString(4, input4);
        			ps.setString(5, input5);
        			
        			ps.executeUpdate();
        			
        			ps.close();
        			conn.close();
        			
        		}
        		catch(SQLException ex)
        		{
        			ex.printStackTrace();
        		}
        		
        		//JOptionPane.showMessageDialog(get, message);
        	}});
        
        ActionListener a = new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	String input = txtfield.getText();  
            	
                Runner.removeAll();
                Runner.switchResults(input);
                Connect.getConnection();
                
    }
              
               
                
            
        };
        button.addActionListener(a);
        add(panel);    
	}
	


	
}
