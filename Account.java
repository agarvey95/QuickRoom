import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Account  extends JFrame {
	
	final static int FRAME_HEIGHT = 400;
	final static int FRAME_WIDTH = 250;
	
	JLabel username;
	JLabel first;
	JLabel last;
	JLabel email;
	JLabel password;
	JLabel credit;
	JTextField u;
	JTextField f;
	JTextField l;
	JTextField em;
	JTextField p;
	JTextField c;
	JButton add;
	
	ActionListener i;
	
	public Account()
	{
		JLabel instruction = new JLabel(" Plase enter the account information");
		add(instruction, BorderLayout.NORTH);
		
		createContiainer();
		createPanel1();
		createPanel2();
		createPanel3();
		createPanel4();
		createPanel5();
		createPanel6();
	
		
		class input implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				insertData();
				
			}
			
		}
		
		i = new input();
		JPanel Button = new JPanel();
		add = new JButton("Confirm");
		add.addActionListener(i);
		Button.add(add);
		
		add(Button, BorderLayout.SOUTH);
		setSize(FRAME_HEIGHT, FRAME_WIDTH);
		
	}
	

	


	private JPanel createPanel6() {
		JPanel panel6 = new JPanel();
		panel6.setLayout(new GridLayout(1,1));
		credit = new JLabel("Credit Card Number: ");
		c= new JTextField(20);
		panel6.add(credit);
		panel6.add(c);
		
		return panel6;
		
	}

	private JPanel createPanel5() {
		JPanel panel5 = new JPanel();
		panel5.setLayout(new GridLayout(1,1));
		email = new JLabel("Email:");
		em= new JTextField(20);
		panel5.add(email);
		panel5.add(em);
		
		return panel5;
		
	}

	private JPanel createPanel4() {
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1,1));
		password = new JLabel("Password:");
		p= new JTextField(20);
		panel4.add(password);
		panel4.add(p);
		
		return panel4;
		
	}

	private JPanel createPanel3() {
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1,1));
		username = new JLabel("User Name:");
		u = new JTextField(20);
		panel3.add(username);
		panel3.add(u);
		
		return panel3;
	}

	private JPanel createPanel2() {
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1,1));
		last = new JLabel("Last Name:");
		l= new JTextField(20);
		panel2.add(last);
		panel2.add(l);
		
		return panel2;
	}

	private JPanel createPanel1() {
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1,1));
		first = new JLabel("First Name:");
		f= new JTextField(20);
		panel1.add(first);
		panel1.add(f);
		
		return panel1;
		
	}

	private void createContiainer() {
		
		JPanel Container = new JPanel();
		
		JPanel panel1 = createPanel1();
		JPanel panel2 = createPanel2();
		JPanel panel3 = createPanel3();
		JPanel panel4 = createPanel4();
		JPanel panel5 = createPanel5();
		JPanel panel6 = createPanel6();
		
		Container.add(panel1);
		Container.add(panel2);
		Container.add(panel3);
		Container.add(panel4);
		Container.add(panel5);
		Container.add(panel6);
		
		add(Container, BorderLayout.CENTER);
		
		
		
		
	}
	
	public void insertData()
	{
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quickroom1?autoReconnect=true&useSSL=false", "root","applepi1!");
			
			String sql = "INSERT INTO ACCOUNT (First_name, Last_name, User_name, Password, Email, Credit_Card,Number) VALUES(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, f.getText());
			ps.setString(2, l.getText());
			ps.setString(3, u.getText());
			ps.setString(4, p.getText());
			ps.setString(5, em.getText());
			ps.setString(6, c.getText());
			
			ps.close();
			con.close();
			
			JOptionPane.showMessageDialog(null, "Account has been added!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
public static void main(String [] args)
{
	JFrame frame = new Account();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}
}
