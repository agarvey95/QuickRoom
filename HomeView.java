package QR;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
import java.sql.*;

import QR.Runner;

public class HomeView extends JPanel
{
    private JLabel label;
    private JButton button;
    private JTextField txtfield;
    private JPanel panel;
	private JLabel lblWelcomeToQuickroom;
    private static JTable table;

	
	java.sql.Connection conn = null;
	public HomeView()
	{
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(800, 520));
		panel.setBackground(Color.RED);

		lblWelcomeToQuickroom = new JLabel("Welcome to QuickRoom");
		lblWelcomeToQuickroom.setFont(new Font("Times New Roman", Font.BOLD, 28));
		panel.add(lblWelcomeToQuickroom);
        
        label = new JLabel("Search for cities:");
        panel.add(label);
        
        
        txtfield = new JTextField(18);
        panel.add(txtfield);
        
        button = new JButton("Submit");        
        panel.add(button); 
        ActionListener a = new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	String input = txtfield.getText(); //temp
                System.out.println(input);  //temp
                Runner.removeAll();
                Runner.switchResults(input);
        	
             try
                {
                	conn = Connection.getConnection();
                	String sql = "SELECT Room_name, City , Country  FROM room WHERE City = ? ";
                	PreparedStatement ps = conn.prepareStatement(sql);
                	
                	ps.setString(1, input);
                	
                	ResultSet rs = ps.executeQuery();
                	
                	table.setModel(DbUtils.resultSetToTableModel(rs)); // Sets the result set into the created table 
                	
                	
                
                }
                catch(SQLException ex)
                {
                	ex.printStackTrace();
                }
                
            }
        };
        button.addActionListener(a);
        add(panel);    
	}
	
	public static void setTable(JTable table) //Setter fot the JTable
	{
		HomeView.table = table;
	}
	
	public static JTable getTable() // Gets The Created Table
	{
		return table;
	}
}
