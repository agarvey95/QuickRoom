import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Room extends JFrame {
	
	final static int FRAME_HEIGHT = 400;
	final static int FRAME_WIDTH = 250;
	
	JLabel City;
	JLabel Country;
	JLabel State;
	JLabel Max_Occupancy;
	JTextField ci;
	JTextField con;
	JTextField s;
	JTextField mx;
	JButton add;
	
	ActionListener i;
	
	public Room()
	{
		JLabel instruction = new JLabel("Please Enter the Room Information");
		add(instruction, BorderLayout.NORTH);
		
		createContainer();
		createPanel1();
		createPanel2();
		createPanel3();
		createPanel4();
		
		
		class input implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				insertData();
				
			}
			
		}
		
		i = new input();
		JPanel button = new JPanel();
		add = new JButton("Confirm");
		add.addActionListener(i);
		button.add(add);
		add(button, BorderLayout.SOUTH);
		
		
		setSize(FRAME_HEIGHT, FRAME_WIDTH);
	}


	


	private void createContainer() {
		JPanel Container = new JPanel();
		JPanel  panel1 = createPanel1();
		JPanel panel2 = createPanel2();
		JPanel panel3 = createPanel3();
		JPanel panel4 = createPanel4();
		
		Container.add(panel1);
		Container.add(panel3);
		Container.add(panel2);
		Container.add(panel4);
		
		add(Container, BorderLayout.CENTER);
		
		
	}


	private JPanel createPanel4() {
		JPanel panel4 = new JPanel();
		panel4.setLayout( new GridLayout(1,1));
		Max_Occupancy = new JLabel("Max Occupancy:");
		mx = new JTextField(20);
		panel4.add(Max_Occupancy);
		panel4.add(mx);
		
		return panel4;
		
	}


	private JPanel createPanel3() {
		JPanel panel3 = new JPanel();
		panel3.setLayout( new GridLayout(1,1));
		State = new JLabel("State:");
		s = new JTextField(20);
		panel3.add(State);
		panel3.add(s);
		
		return panel3;
		
	}


	private JPanel createPanel2() {
		JPanel panel2 = new JPanel();
		panel2.setLayout( new GridLayout(1,1));
		Country = new JLabel("Country:");
		con = new JTextField(20);
		panel2.add(Country);
		panel2.add(con);
		
		return panel2;
		
	}


	private JPanel createPanel1() {
		
		JPanel panel1 = new JPanel();
		panel1.setLayout( new GridLayout(1,1));
		City = new JLabel("City:");
		ci = new JTextField(20);
		panel1.add(City);
		panel1.add(ci);
		
		return panel1;
		
	}
	
	
	private void insertData()
	{
		Connection c = null;
		try
		{
			
			c = DriverManager.getConnection("jdbc:mysql://mysql3.gear.host:3306/quickroom1?autoReconnect=true&useSSL=false", "agarvey95","QuickRoom1!");
		
			
			
			PreparedStatement ps = c.prepareStatement("insert into room(City, State, Country, Max_Occupancy) values(?,?,?,?)");
			
			ps.setString(1, ci.getText());
			ps.setString(2, s.getText());
			ps.setString(3, con.getText());
			ps.setString(4, mx.getText());
			
			ps.executeUpdate();
			
			
			ps.close();
			c.close();
		
			
			JOptionPane.showMessageDialog(null, "The Room information has been added");
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		
		
}
	
	public static void main(String [] args)
	{
		JFrame frame = new Room();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
