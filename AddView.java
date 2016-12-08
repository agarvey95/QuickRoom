package qr;


import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.*;


@SuppressWarnings("serial")
public class AddView extends JFrame {
	
	
	private JPanel panel;
	private JPanel panel1;
	private JPanel panel2;
	
	private JLabel fname;
	private JLabel lname;
	private JLabel userName;
	private JLabel password;
	private JLabel creditcard;
	
	
	private JTextField f;
	private JTextField l;
	private JTextField u; 
	private JTextField p;
	private JTextField cc;
	
	
	
	private JButton confirm;
	private JLabel title;
	
	ActionListener i;
	java.sql.Connection conn;

	
	
	public AddView()
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
	
	class Listener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent confirmClick) {
			
			String input1 = f.getText();
			String input2 = l.getText();
			String input3 = u.getText();
			String input4 = p.getText();
			String input5 = cc.getText();
			checkCreditCard();
			try
			{
				conn = Connection.getConnection();
				
				String sql = "INSERT INTO ACCOUNT (First_name, Last_name, User_name,Password, Credit_Card_Number) VALUES ( ?,?,?,?,?)";
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ps.setString(1, input1);
				ps.setString(2, input2);
				ps.setString(3, input3);
				ps.setString(4,  input4);
				ps.setString(5, input5);
				
				ps.executeUpdate(sql);
				ps.close();
				conn.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
			
		}
		
	}
	
       public void checkCreditCard()
	{
		if(digits != 16 )
		{
			JOptionPane.showMessageDialog(null, "Invalid Credit Card Number");
		}
	}
}
