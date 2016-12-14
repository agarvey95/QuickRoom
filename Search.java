package qr;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
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

public class Search extends JPanel
{
    private JLabel label;
    
    private JButton ChicagoButton;
    private JButton DallasButton;
    private JButton DCButton;
    private JButton LAButton;
    private JButton NYCButton;
    private JButton RomeButton;
    private JButton TorontoButton;
    private JButton BostonButton;
    
    private JTextField txtfield;
    private JPanel panel;
	private JLabel lblWelcomeToQuickroom;
	private static JTable table;
	
	private String url = "jdbc:mysql://localhost:3306/quickroom1?autoReconnect=true&useSSL=false";
	private static String 	USERNAME = "root";
	private static String PASSWORD = "applepi1!";
	private static java.sql.Connection c = null;
    
	public Search()
	{
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(800, 520));
		panel.setBackground(Color.RED);

		
        
        
        
        ChicagoButton = new JButton("Chicago");        
        panel.add(ChicagoButton); 
        ChicagoButton.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		@SuppressWarnings("unused")
				class Chicago
        		{
        			private JPanel panel;
        			private JLabel label;
        			private JButton one;
					private JButton two;
					private JButton three;
					private JButton four;
					private JButton five;
					private JButton six;
					private JButton seven;
					private JButton eight;
					private JButton nine;
					private JButton ten;
					private JButton eleven;
					private JButton twelve;
					private JButton thirteen;
					private JButton fourteen;
					private JButton fifteen;
					private JButton sixteen;
					private JLabel label1;
        			
        			public Chicago()
        			{
        				createPanel();
        				label1 = new JLabel("Chicago");
        				add(label1);
        				add(panel);
        			}

					private JPanel createPanel() {
						
						panel = new JPanel();
						panel.setLayout(new GridLayout(4,4));
						
						
						
						
						one = new JButton("S-101");
						one.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from chicago where Room_name = 'S-101'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
									
							
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
							
						
						panel.add(one);
					
						
						
						
						two = new JButton("S-102");
						two.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from chicago where Room_name = 'S-102'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(two);
						
						
						three = new JButton("S-103");
						three.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from chicago where Room_name = 'S-103'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(three);
						
						
						four = new JButton ("S-104");
						four.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from chicago where Room_name = 'S-104'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(four);
						
						
						five = new JButton ("S-201");
						five.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from chicago where Room_name = 'S-201'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(five);
						
						
						six = new JButton ("S-202");
						six.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from chicago where Room_name = 'S-202'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(six);
						
						
						seven = new JButton("S-203");
						seven.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from nyc where Room_name = 'S-203'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(seven);
						
						
						eight = new JButton("S-204");
						eight.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from chicago where Room_name = 'S-204'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(eight);
						
						
						nine = new JButton ("S-301");
						nine.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from chicago where Room_name = 'S-301'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(nine);
						
						
						ten = new JButton ("S- 302");
						ten.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from chicago where Room_name = 'S-302'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(ten);
						
						
						eleven = new JButton("S-303");
						eleven.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from chicago where Room_name = 'S-303'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(eleven);
						
						
						twelve = new JButton ("S-304");
						twelve.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from chicago where Room_name = 'S-304'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(twelve);
						
						
						thirteen = new JButton("S-401");
						thirteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from chicago where Room_name = 'S-401'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(thirteen);
						
						
						fourteen = new JButton ("S-402");
						fourteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from chicago where Room_name = 'S-402'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(fourteen);
						
						
						fifteen = new JButton("S-403");
						fifteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from chicago where Room_name = 'S-403'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(fifteen);
						
						
						sixteen = new JButton("S-404");
						sixteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from chicago where Room_name = 'S-404'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(sixteen);
						
						
						
						return panel;
						
					}
        		}
        		      		
        	}});
        
        DallasButton = new JButton("Dallas");        
        panel.add(DallasButton); 
        DallasButton.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		class Dallas
        		{
        			private JPanel panel;
        			private JLabel label;
        			private JButton one;
					private JButton two;
					private JButton three;
					private JButton four;
					private JButton five;
					private JButton six;
					private JButton seven;
					private JButton eight;
					private JButton nine;
					private JButton ten;
					private JButton eleven;
					private JButton twelve;
					private JButton thirteen;
					private JButton fourteen;
					private JButton fifteen;
					private JButton sixteen;
					private JLabel label2;
        			
        			public Dallas()
        			{
        				createPanel();
        				
        				add(panel);
        				
        				label2 = new JLabel("Dallas");
        				add(label2);
        			}

					private JPanel createPanel() {
						
						panel = new JPanel();
						panel.setLayout(new GridLayout(4,4));
						
						one = new JButton("S-101");
						one.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dallas where Room_name = 'S-101'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
									
							
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
							
						
						panel.add(one);
						
						
						
						two = new JButton("S-102");
						two.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dallas where Room_name = 'S-102'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(two);
						
						
						three = new JButton("S-103");
						three.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dallas where Room_name = 'S-103'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(three);
						
						
						four = new JButton ("S-104");
						four.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dallas where Room_name = 'S-104'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(four);
						
						
						five = new JButton ("S-201");
						five.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dallas where Room_name = 'S-201'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(five);
						
						
						six = new JButton ("S-202");
						six.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dallas where Room_name = 'S-202'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(six);
						
						
						seven = new JButton("S-203");
						seven.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dallas where Room_name = 'S-203'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(seven);
						
						
						eight = new JButton("S-204");
						eight.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dallas where Room_name = 'S-204'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(eight);
						
						
						nine = new JButton ("S-301");
						nine.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dallas where Room_name = 'S-301'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(nine);
						
						
						ten = new JButton ("S- 302");
						ten.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dallas where Room_name = 'S-302'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(ten);
						
						
						eleven = new JButton("S-303");
						eleven.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dallas where Room_name = 'S-303'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(eleven);
						
						
						twelve = new JButton ("S-304");
						twelve.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dallas where Room_name = 'S-304'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(twelve);
						
						
						thirteen = new JButton("S-401");
						thirteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dallas where Room_name = 'S-401'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(thirteen);
						
						
						fourteen = new JButton ("S-402");
						fourteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dallas where Room_name = 'S-402'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(fourteen);
						
						
						fifteen = new JButton("S-403");
						fifteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dallas where Room_name = 'S-403'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(fifteen);
						
						
						sixteen = new JButton("S-404");
						sixteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dallas where Room_name = 'S-404'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(sixteen);
						
						
						
						return panel;
						
					}
        		}
        		      		
        	}});
        		      		
        
        
        DCButton = new JButton("Washington DC");        
        panel.add(DCButton); 
        DCButton.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		class Washington
        		{
        			private JPanel panel;
        			private JLabel label;
        			private JButton one;
					private JButton two;
					private JButton three;
					private JButton four;
					private JButton five;
					private JButton six;
					private JButton seven;
					private JButton eight;
					private JButton nine;
					private JButton ten;
					private JButton eleven;
					private JButton twelve;
					private JButton thirteen;
					private JButton fourteen;
					private JButton fifteen;
					private JButton sixteen;
					private JLabel label3;
        			
        			public Washington()
        			{
        				createPanel();
        				label3 = new JLabel("Washington DC");
        				
        				add(panel);
        			}

					private JPanel createPanel() {
						
						panel = new JPanel();
						panel.setLayout(new GridLayout(4,4));
						
						one = new JButton("S-101");
						one.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dc where Room_name = 'S-101'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
									
							
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
							
						
						panel.add(one);
						
						
						
						two = new JButton("S-102");
						two.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dc where Room_name = 'S-102'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(two);
						
						
						three = new JButton("S-103");
						three.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dc where Room_name = 'S-103'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(three);
						
						
						four = new JButton ("S-104");
						four.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dc where Room_name = 'S-104'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(four);
						
						
						five = new JButton ("S-201");
						five.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dc where Room_name = 'S-201'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(five);
						
						
						six = new JButton ("S-202");
						six.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dc where Room_name = 'S-202'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(six);
						
						
						seven = new JButton("S-203");
						seven.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dc where Room_name = 'S-203'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(seven);
						
						
						eight = new JButton("S-204");
						eight.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dc where Room_name = 'S-204'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(eight);
						
						
						nine = new JButton ("S-301");
						nine.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dc where Room_name = 'S-301'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(nine);
						
						
						ten = new JButton ("S- 302");
						ten.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dc where Room_name = 'S-302'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(ten);
						
						
						eleven = new JButton("S-303");
						eleven.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dc where Room_name = 'S-303'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(eleven);
						
						
						twelve = new JButton ("S-304");
						twelve.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dc where Room_name = 'S-304'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(twelve);
						
						
						thirteen = new JButton("S-401");
						thirteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dc where Room_name = 'S-401'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(thirteen);
						
						
						fourteen = new JButton ("S-402");
						fourteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dc where Room_name = 'S-402'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(fourteen);
						
						
						fifteen = new JButton("S-403");
						fifteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dc where Room_name = 'S-403'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(fifteen);
						
						
						sixteen = new JButton("S-404");
						sixteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from dc where Room_name = 'S-404'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(sixteen);
						
						
						
						return panel;
						
					}
        		}
        		      		
        	}});
        		      		
       
        
      LAButton = new JButton("Los Angeles");        
        panel.add(LAButton); 
        LAButton.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		class LosAngeles
        		{
        			private JPanel panel;
        			private JLabel label;
        			private JButton one;
					private JButton two;
					private JButton three;
					private JButton four;
					private JButton five;
					private JButton six;
					private JButton seven;
					private JButton eight;
					private JButton nine;
					private JButton ten;
					private JButton eleven;
					private JButton twelve;
					private JButton thirteen;
					private JButton fourteen;
					private JButton fifteen;
					private JButton sixteen;
        			
        			public LosAngeles()
        			{
        				createPanel();
        				
        				add(panel);
        			}

					private JPanel createPanel() {
						
						panel = new JPanel();
						panel.setLayout(new GridLayout(4,4));
						
						one = new JButton("S-101");
						one.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from los_angeles where Room_name = 'S-101'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
									
							
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
							
						
						panel.add(one);
						
						
						
						two = new JButton("S-102");
						two.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from los_angeles where Room_name = 'S-102'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(two);
						
						
						three = new JButton("S-103");
						three.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from los_anageles where Room_name = 'S-103'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(three);
						
						
						four = new JButton ("S-104");
						four.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from los_angeles where Room_name = 'S-104'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(four);
						
						
						five = new JButton ("S-201");
						five.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from los_angeles where Room_name = 'S-201'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(five);
						
						
						six = new JButton ("S-202");
						six.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from los_angeles where Room_name = 'S-202'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(six);
						
						
						seven = new JButton("S-203");
						seven.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from los_angeles where Room_name = 'S-203'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(seven);
						
						
						eight = new JButton("S-204");
						eight.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from los_angeles where Room_name = 'S-204'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(eight);
						
						
						nine = new JButton ("S-301");
						nine.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from los_angeles where Room_name = 'S-301'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(nine);
						
						
						ten = new JButton ("S- 302");
						ten.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from los_angeles where Room_name = 'S-302'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(ten);
						
						
						eleven = new JButton("S-303");
						eleven.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from los_angeles where Room_name = 'S-303'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(eleven);
						
						
						twelve = new JButton ("S-304");
						twelve.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from los_angeles where Room_name = 'S-304'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(twelve);
						
						
						thirteen = new JButton("S-401");
						thirteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from los_angeles where Room_name = 'S-401'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(thirteen);
						
						
						fourteen = new JButton ("S-402");
						fourteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from rome where Room_name = 'S-402'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(fourteen);
						
						
						fifteen = new JButton("S-403");
						fifteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from los_angeles where Room_name = 'S-403'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(fifteen);
						
						
						sixteen = new JButton("S-404");
						sixteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from los_angeles where Room_name = 'S-404'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(sixteen);
						
						
						
						return panel;
						
					}
        		}
        		      		
        	}});
        		      		
       
        
        NYCButton = new JButton("New York City");        
        panel.add(NYCButton); 
        NYCButton.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		class NYC
        		{
        			private JPanel panel;
        			private JLabel label;
        			private JButton one;
					private JButton two;
					private JButton three;
					private JButton four;
					private JButton five;
					private JButton six;
					private JButton seven;
					private JButton eight;
					private JButton nine;
					private JButton ten;
					private JButton eleven;
					private JButton twelve;
					private JButton thirteen;
					private JButton fourteen;
					private JButton fifteen;
					private JButton sixteen;
        			
        			public NYC()
        			{
        				createPanel();
        				
        				add(panel);
        			}

					private JPanel createPanel() {
						
						panel = new JPanel();
						panel.setLayout(new GridLayout(4,4));
						
						one = new JButton("S-101");
						one.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from nyc where Room_name = 'S-101'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
									
							
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
							
						
						panel.add(one);
						
						
						
						two = new JButton("S-102");
						two.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from nyc where Room_name = 'S-102'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(two);
						
						
						three = new JButton("S-103");
						three.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from nyc where Room_name = 'S-103'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(three);
						
						
						four = new JButton ("S-104");
						four.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from nyc where Room_name = 'S-104'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(four);
						
						
						five = new JButton ("S-201");
						five.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from nyc where Room_name = 'S-201'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(five);
						
						
						six = new JButton ("S-202");
						six.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from nyc where Room_name = 'S-202'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(six);
						
						
						seven = new JButton("S-203");
						seven.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from nyc where Room_name = 'S-203'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(seven);
						
						
						eight = new JButton("S-204");
						eight.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from nyc where Room_name = 'S-204'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(eight);
						
						
						nine = new JButton ("S-301");
						nine.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from nyc where Room_name = 'S-301'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(nine);
						
						
						ten = new JButton ("S- 302");
						ten.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from nyc where Room_name = 'S-302'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(ten);
						
						
						eleven = new JButton("S-303");
						eleven.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from nyc where Room_name = 'S-303'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(eleven);
						
						
						twelve = new JButton ("S-304");
						twelve.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from nyc where Room_name = 'S-304'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(twelve);
						
						
						thirteen = new JButton("S-401");
						thirteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from nyc where Room_name = 'S-401'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(thirteen);
						
						
						fourteen = new JButton ("S-402");
						fourteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from nyc where Room_name = 'S-402'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(fourteen);
						
						
						fifteen = new JButton("S-403");
						fifteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from nyc where Room_name = 'S-403'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(fifteen);
						
						
						sixteen = new JButton("S-404");
						sixteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from nyc where Room_name = 'S-404'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(sixteen);
						
						
						
						return panel;
						
					}
        		}
        		      		
        	}});
        		      	
       
        RomeButton = new JButton("Rome");        
        panel.add(RomeButton); 
        RomeButton.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		class Rome
        		{
        			private JPanel panel;
        			private JLabel label;
        			private JButton one;
					private JButton two;
					private JButton three;
					private JButton four;
					private JButton five;
					private JButton six;
					private JButton seven;
					private JButton eight;
					private JButton nine;
					private JButton ten;
					private JButton eleven;
					private JButton twelve;
					private JButton thirteen;
					private JButton fourteen;
					private JButton fifteen;
					private JButton sixteen;
        			
        			public Rome()
        			{
        				createPanel();
        				
        				add(panel);
        			}

					private JPanel createPanel() {
						
						panel = new JPanel();
						panel.setLayout(new GridLayout(4,4));
						
						one = new JButton("S-101");
						one.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from rome where Room_name = 'S-101'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
									
							
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
							
						
						panel.add(one);
						
						
						
						two = new JButton("S-102");
						two.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from rome where Room_name = 'S-102'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(two);
						
						
						three = new JButton("S-103");
						three.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from rome where Room_name = 'S-103'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(three);
						
						
						four = new JButton ("S-104");
						four.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from rome where Room_name = 'S-104'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(four);
						
						
						five = new JButton ("S-201");
						five.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from rome where Room_name = 'S-201'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(five);
						
						
						six = new JButton ("S-202");
						six.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from rome where Room_name = 'S-202'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(six);
						
						
						seven = new JButton("S-203");
						seven.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from rome where Room_name = 'S-203'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(seven);
						
						
						eight = new JButton("S-204");
						eight.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from rome where Room_name = 'S-204'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(eight);
						
						
						nine = new JButton ("S-301");
						nine.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from rome where Room_name = 'S-301'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(nine);
						
						
						ten = new JButton ("S- 302");
						ten.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from rome where Room_name = 'S-302'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(ten);
						
						
						eleven = new JButton("S-303");
						eleven.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from rome where Room_name = 'S-303'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(eleven);
						
						
						twelve = new JButton ("S-304");
						twelve.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from rome where Room_name = 'S-304'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(twelve);
						
						
						thirteen = new JButton("S-401");
						thirteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from rome where Room_name = 'S-401'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(thirteen);
						
						
						fourteen = new JButton ("S-402");
						fourteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from rome where Room_name = 'S-402'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(fourteen);
						
						
						fifteen = new JButton("S-403");
						fifteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from rome where Room_name = 'S-403'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(fifteen);
						
						
						sixteen = new JButton("S-404");
						sixteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from rome where Room_name = 'S-404'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(sixteen);
						
						
						
						return panel;
						
					}
        		}
        		      		
        	}});
        		      		
      
        
        TorontoButton = new JButton("Toronto");        
        panel.add(TorontoButton); 
        TorontoButton.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		class Toronto
        		{
        			private JPanel panel;
        			private JLabel label;
        			private JButton one;
					private JButton two;
					private JButton three;
					private JButton four;
					private JButton five;
					private JButton six;
					private JButton seven;
					private JButton eight;
					private JButton nine;
					private JButton ten;
					private JButton eleven;
					private JButton twelve;
					private JButton thirteen;
					private JButton fourteen;
					private JButton fifteen;
					private JButton sixteen;
        			
        			public Toronto()
        			{
        				createPanel();
        				
        				add(panel);
        			}

					private JPanel createPanel() {
						
						panel = new JPanel();
						panel.setLayout(new GridLayout(4,4));
						
						one = new JButton("S-101");
						one.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from toronto where Room_name = 'S-101'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
									
							
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
							
						
						panel.add(one);
						
						
						
						two = new JButton("S-102");
						two.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from toronto where Room_name = 'S-102'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(two);
						
						
						three = new JButton("S-103");
						three.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from toronto where Room_name = 'S-103'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(three);
						
						
						four = new JButton ("S-104");
						four.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from toronto where Room_name = 'S-104'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(four);
						
						
						five = new JButton ("S-201");
						five.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from toronto where Room_name = 'S-201'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(five);
						
						
						six = new JButton ("S-202");
						six.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from toronto where Room_name = 'S-202'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(six);
						
						
						seven = new JButton("S-203");
						seven.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from toronto where Room_name = 'S-203'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(seven);
						
						
						eight = new JButton("S-204");
						eight.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from toronto where Room_name = 'S-204'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(eight);
						
						
						nine = new JButton ("S-301");
						nine.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from toronto where Room_name = 'S-301'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(nine);
						
						
						ten = new JButton ("S- 302");
						ten.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from toronto where Room_name = 'S-302'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(ten);
						
						
						eleven = new JButton("S-303");
						eleven.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from toronto where Room_name = 'S-303'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(eleven);
						
						
						twelve = new JButton ("S-304");
						twelve.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from toronto where Room_name = 'S-304'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(twelve);
						
						
						thirteen = new JButton("S-401");
						thirteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from toronto where Room_name = 'S-401'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(thirteen);
						
						
						fourteen = new JButton ("S-402");
						fourteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from toronto where Room_name = 'S-402'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(fourteen);
						
						
						fifteen = new JButton("S-403");
						fifteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from toronto where Room_name = 'S-403'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(fifteen);
						
						
						sixteen = new JButton("S-404");
						sixteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from toronto where Room_name = 'S-404'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(sixteen);
						
						
						
						return panel;
						
					}
        		}
        		      		
        	}});
        		      		
        
        BostonButton = new JButton("Boston");
        panel.add(BostonButton); 
        RomeButton.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		class Boston
        		{
        			private JPanel panel;
        			private JLabel label;
        			private JButton one;
					private JButton two;
					private JButton three;
					private JButton four;
					private JButton five;
					private JButton six;
					private JButton seven;
					private JButton eight;
					private JButton nine;
					private JButton ten;
					private JButton eleven;
					private JButton twelve;
					private JButton thirteen;
					private JButton fourteen;
					private JButton fifteen;
					private JButton sixteen;
        			
        			public Boston()
        			{
        				createPanel();
        				
        				add(panel);
        			}

					private JPanel createPanel() {
						
						panel = new JPanel();
						panel.setLayout(new GridLayout(4,4));
						
						one = new JButton("S-101");
						one.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from boston where Room_name = 'S-101'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
									
							
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
							
						
						panel.add(one);
						
						
						
						two = new JButton("S-102");
						two.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from boston where Room_name = 'S-102'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(two);
						
						
						three = new JButton("S-103");
						three.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from boston where Room_name = 'S-103'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(three);
						
						
						four = new JButton ("S-104");
						four.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from boston where Room_name = 'S-104'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(four);
						
						
						five = new JButton ("S-201");
						five.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from boston where Room_name = 'S-201'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(five);
						
						
						six = new JButton ("S-202");
						six.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from boston where Room_name = 'S-202'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(six);
						
						
						seven = new JButton("S-203");
						seven.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from boston where Room_name = 'S-203'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(seven);
						
						
						eight = new JButton("S-204");
						eight.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from boston where Room_name = 'S-204'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(eight);
						
						
						nine = new JButton ("S-301");
						nine.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from boston where Room_name = 'S-301'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(nine);
						
						
						ten = new JButton ("S- 302");
						ten.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from boston where Room_name = 'S-302'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(ten);
						
						
						eleven = new JButton("S-303");
						eleven.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from nyc where Room_name = 'S-303'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(eleven);
						
						
						twelve = new JButton ("S-304");
						twelve.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from boston where Room_name = 'S-304'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(twelve);
						
						
						thirteen = new JButton("S-401");
						thirteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from boston where Room_name = 'S-401'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(thirteen);
						
						
						fourteen = new JButton ("S-402");
						fourteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from boston where Room_name = 'S-402'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(fourteen);
						
						
						fifteen = new JButton("S-403");
						fifteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from boston where Room_name = 'S-403'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(fifteen);
						
						
						sixteen = new JButton("S-404");
						sixteen.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
						{
								try
								{
									Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
									String sql = "Select Room_name, Con_num,City, Country from boston where Room_name = 'S-404'; ";
									PreparedStatement ps = conn.prepareStatement(sql);
									ResultSet rs =  ps.executeQuery();
									
									while(rs.next())
									{
										rs.getString("Room_name");
										rs.getInt("Con_num");
										rs.getString("City");
										rs.getString("Country");
										
										JOptionPane.showMessageDialog(null, rs);
										
									}
									
									rs.close();
									ps.close();
									conn.close();
								}
								catch(SQLException ex)
								{
									ex.printStackTrace();
								}
										
						}
						});
						panel.add(sixteen);
						
						
						
						return panel;
						
					}
        		}
        		      		
        	}});
        		      		
        
       
        
 
        add(panel);    
	}
	


	
}
