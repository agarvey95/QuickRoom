package QuickRoomApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class GUI {

	private JFrame frame;
	private JPanel Welcome;
	private JPanel Account;
	private JPanel Menu;
	private JPanel DisplayRoom;
	private JPanel FirstFloor;
	private JPanel SecondFloor;
	private JPanel ThirdFloor;
	private JPanel FourthFloor;
	private JPanel Login;
	private JTextField Fname;
	private JTextField Lname;
	private JTextField Username;
	private JTextField Password;
	private JTextField CreditCardNumber;
	private JTextField Username1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
	
		
		/*
		 * Creates the First Screen which is the welcome screen, users will be able to register a account or be able to log in. 
		 */
		
		Welcome = new JPanel();
		Welcome.setBackground(Color.CYAN);
		frame.getContentPane().add(Welcome, "name_162028263834690");
		Welcome.setLayout(null);
		
		JLabel lblWelcomeToQuickroom = new JLabel("Welcome to QuickRoom");
		lblWelcomeToQuickroom.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblWelcomeToQuickroom.setBounds(52, 28, 301, 33);
		Welcome.add(lblWelcomeToQuickroom);
		
		JLabel lblPlaseSelect = new JLabel("Plase Select a option");
		lblPlaseSelect.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPlaseSelect.setBounds(117, 100, 162, 35);
		Welcome.add(lblPlaseSelect);
		
		JButton btnRegisterButton = new JButton("Register");
		btnRegisterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Welcome.setVisible(false);
				Account.setVisible(true);
				
			}
		});
		btnRegisterButton.setBounds(42, 174, 104, 33);
		Welcome.add(btnRegisterButton);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.setVisible(true);
				Welcome.setVisible(false);
			
			}
		});
		btnNewButton.setBounds(232, 174, 112, 33);
		Welcome.add(btnNewButton);
		
		/*
		 * Creates the screen in which the User will be able to enter their account information
		 * and the information will be added to the database. 
		 */
		
		Account = new JPanel();
		Account.setBackground(Color.CYAN);
		frame.getContentPane().add(Account, "name_162385251735429");
		Account.setLayout(null);
		
		JLabel lblPleaseEnterYour = new JLabel("Please Enter Your Information");
		lblPleaseEnterYour.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPleaseEnterYour.setBounds(66, 11, 267, 14);
		Account.add(lblPleaseEnterYour);
		
		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setBounds(64, 68, 75, 14);
		Account.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setBounds(66, 93, 89, 14);
		Account.add(lblLastName);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(66, 127, 63, 14);
		Account.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(66, 158, 69, 14);
		Account.add(lblPassword);
		
		JLabel lblCreditCardNumber = new JLabel("Credit Card Number :");
		lblCreditCardNumber.setBounds(24, 183, 124, 14);
		Account.add(lblCreditCardNumber);
		
		Fname = new JTextField();
		Fname.setBounds(165, 65, 124, 20);
		Account.add(Fname);
		Fname.setColumns(10);
		
		Lname = new JTextField();
		Lname.setBounds(165, 91, 124, 20);
		Account.add(Lname);
		Lname.setColumns(10);
		
		Username = new JTextField();
		Username.setBounds(165, 124, 124, 20);
		Account.add(Username);
		Username.setColumns(10);
		
		Password = new JTextField();
		Password.setBounds(165, 155, 124, 20);
		Account.add(Password);
		Password.setColumns(10);
		
		CreditCardNumber = new JTextField();
		CreditCardNumber.setBounds(165, 180, 124, 20);
		Account.add(CreditCardNumber);
		CreditCardNumber.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Method to add User to the account table in the database
				
				Account.setVisible(false);
				Welcome.setVisible(true);
				
			}
		});
		btnConfirm.setBounds(157, 211, 89, 23);
		Account.add(btnConfirm);
		
		
		/*
		 * Creates the Main Menu Page to either Book a Room Or Log out of the System. 
		 */
		
		 Menu = new JPanel();
		Menu.setBackground(Color.CYAN);
		frame.getContentPane().add(Menu, "name_167395164282629");
		Menu.setLayout(null);
		
		JLabel lblPleaseSelectA = new JLabel("Please Select A Option");
		lblPleaseSelectA.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPleaseSelectA.setBounds(121, 24, 183, 14);
		Menu.add(lblPleaseSelectA);
		
		JButton btnBookARoom = new JButton("Book A room");
		btnBookARoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.setVisible(false);
				DisplayRoom.setVisible(true);
			}
		});
		
		
		
		
			
	
		btnBookARoom.setBounds(121, 84, 116, 23);
		Menu.add(btnBookARoom);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(121, 155, 116, 23);
		Menu.add(btnNewButton_1);
		
		
		/*
		 * Creates A Screen in which the User will be able to pick what floor of rooms they want to rent 
		 */
		
		DisplayRoom = new JPanel();
		DisplayRoom.setBackground(Color.CYAN);
		frame.getContentPane().add(DisplayRoom, "name_168795193583823");
		DisplayRoom.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please Select A Room To Book");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(71, 28, 363, 14);
		lblNewLabel.setBackground(Color.WHITE);
		DisplayRoom.add(lblNewLabel);
		
		JButton btnFloor = new JButton("Floor1");
		btnFloor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DisplayRoom.setVisible(false);
				FirstFloor.setVisible(true);
				
			}
		});
		btnFloor.setBounds(31, 141, 89, 23);
		DisplayRoom.add(btnFloor);
		
		JButton btnNewButton_2 = new JButton("Floor 2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DisplayRoom.setVisible(false);
				SecondFloor.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(134, 141, 89, 23);
		DisplayRoom.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Floor 3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DisplayRoom.setVisible(false);
				ThirdFloor.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(235, 141, 89, 23);
		DisplayRoom.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Floor 4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DisplayRoom.setVisible(false);
				FourthFloor.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(334, 141, 89, 23);
		DisplayRoom.add(btnNewButton_4);
		
		/*
		 * Creates the First Floor of Rooms with the option to book a room by clicking a button
		 */
		FirstFloor = new JPanel();
		FirstFloor.setBackground(Color.CYAN);
		frame.getContentPane().add(FirstFloor, "name_169018263774691");
		FirstFloor.setLayout(null);
		
		JButton btnS = new JButton("S-101");
		btnS.setBounds(50, 70, 89, 23);
		FirstFloor.add(btnS);
		
		JButton btnS_1 = new JButton("S-102");
		btnS_1.setBounds(217, 70, 89, 23);
		FirstFloor.add(btnS_1);
		
		JButton btnS_2 = new JButton("S-103");
		btnS_2.setBounds(217, 131, 89, 23);
		FirstFloor.add(btnS_2);
		
		JButton btnS_3 = new JButton("S-104");
		btnS_3.setBounds(50, 131, 89, 23);
		FirstFloor.add(btnS_3);
		
		JLabel lblFirstFloor = new JLabel("First Floor");
		lblFirstFloor.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblFirstFloor.setBounds(134, 32, 105, 14);
		FirstFloor.add(lblFirstFloor);
		
		JButton btnNextFloor = new JButton("Next Floor");
		btnNextFloor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstFloor.setVisible(false);
				SecondFloor.setVisible(true);
			}
		});
		btnNextFloor.setBounds(217, 201, 137, 23);
		FirstFloor.add(btnNextFloor);
		
		JButton btnNewButton_5 = new JButton("Back To Menu");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstFloor.setVisible(false);
				Menu.setVisible(true);
				
			}
		});
		btnNewButton_5.setBounds(52, 201, 129, 23);
		FirstFloor.add(btnNewButton_5);
		
		/*
		 * Creates the second floor with the option to book a room
		 */
		SecondFloor = new JPanel();
		SecondFloor.setBackground(Color.CYAN);
		frame.getContentPane().add(SecondFloor, "name_169666523735107");
		SecondFloor.setLayout(null);
		
		JLabel lblSecondFloor = new JLabel("Second Floor");
		lblSecondFloor.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSecondFloor.setBounds(123, 31, 95, 14);
		SecondFloor.add(lblSecondFloor);
		
		JButton btnS_4 = new JButton("S-201");
		btnS_4.setBounds(32, 92, 89, 23);
		SecondFloor.add(btnS_4);
		
		JButton btnS_5 = new JButton("S-202");
		btnS_5.setBounds(216, 92, 89, 23);
		SecondFloor.add(btnS_5);
		
		JButton btnS_6 = new JButton("S-203");
		btnS_6.setBounds(32, 155, 89, 23);
		SecondFloor.add(btnS_6);
		
		JButton btnS_7 = new JButton("S-204");
		btnS_7.setBounds(216, 155, 89, 23);
		SecondFloor.add(btnS_7);
		
		// Creates a button to go to the Previous floor
		JButton btnNewButton_6 = new JButton("Previous ");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SecondFloor.setVisible(false);
				FirstFloor.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(32, 210, 106, 23);
		SecondFloor.add(btnNewButton_6);
		
		// Creates a button to Go to the next floor of rooms
		JButton btnNextFloor_1 = new JButton("Next");
		btnNextFloor_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SecondFloor.setVisible(false);
				ThirdFloor.setVisible(true);
			}
		});
		btnNextFloor_1.setBounds(216, 210, 89, 23);
		SecondFloor.add(btnNextFloor_1);
		
		
		// Creates the third floor of rooms for the user to choose from
		ThirdFloor = new JPanel();
		ThirdFloor.setBackground(Color.CYAN);
		frame.getContentPane().add(ThirdFloor, "name_169827131902148");
		ThirdFloor.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Third Floor");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(141, 11, 116, 14);
		ThirdFloor.add(lblNewLabel_1);
		
		JButton btnS_8 = new JButton("S-301");
		btnS_8.setBounds(42, 90, 89, 23);
		ThirdFloor.add(btnS_8);
		
		JButton btnS_9 = new JButton("S-302");
		btnS_9.setBounds(230, 90, 89, 23);
		ThirdFloor.add(btnS_9);
		
		JButton btnS_10 = new JButton("S-303");
		btnS_10.setBounds(42, 147, 89, 23);
		ThirdFloor.add(btnS_10);
		
		JButton btnS_11 = new JButton("S-304");
		btnS_11.setBounds(230, 147, 89, 23);
		ThirdFloor.add(btnS_11);
		
		//Creates a button to go to the previous page
		JButton btnNewButton_7 = new JButton("Previous ");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThirdFloor.setVisible(false);
				SecondFloor.setVisible(true);
			}
		});
		btnNewButton_7.setBounds(42, 212, 116, 23);
		ThirdFloor.add(btnNewButton_7);
		
		//Creates a button to go to the next page
		JButton btnNewButton_8 = new JButton("Next ");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThirdFloor.setVisible(false);
				FourthFloor.setVisible(true);
			}
		});
		btnNewButton_8.setBounds(230, 212, 89, 23);
		ThirdFloor.add(btnNewButton_8);
		
		/*
		 * Creates the fourth floor of rooms for the user to pick from
		 */
		FourthFloor = new JPanel();
		FourthFloor.setBackground(Color.CYAN);
		frame.getContentPane().add(FourthFloor, "name_170119185212787");
		FourthFloor.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Fourth Floor");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(151, 11, 131, 14);
		FourthFloor.add(lblNewLabel_2);
		
		JButton btnS_12 = new JButton("S-401");
		btnS_12.setBounds(45, 100, 89, 23);
		FourthFloor.add(btnS_12);
		
		JButton btnS_13 = new JButton("S-402");
		btnS_13.setBounds(218, 100, 89, 23);
		FourthFloor.add(btnS_13);
		
		JButton btnS_14 = new JButton("S-403");
		btnS_14.setBounds(45, 149, 89, 23);
		FourthFloor.add(btnS_14);
		
		JButton btnS_15 = new JButton("S-404");
		btnS_15.setBounds(228, 149, 89, 23);
		FourthFloor.add(btnS_15);
		
		//Creates a button to go to the previous page
		JButton btnPreviousFloor = new JButton("Previous");
		btnPreviousFloor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FourthFloor.setVisible(false);
				ThirdFloor.setVisible(true);
			}
		});
		btnPreviousFloor.setBounds(133, 210, 117, 23);
		FourthFloor.add(btnPreviousFloor);
		
		
		/*
		 * Creates the Login Page where the user enters the username and password
		 */
		
		Login = new JPanel();
		Login.setBackground(Color.CYAN);
		frame.getContentPane().add(Login, "name_205655994237733");
		Login.setLayout(null);
		
		JLabel lblEnterTheLogin = new JLabel("Enter The Login Information");
		lblEnterTheLogin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEnterTheLogin.setBounds(101, 33, 215, 14);
		Login.add(lblEnterTheLogin);
		
		JLabel lblUsername_1 = new JLabel("Username: ");
		lblUsername_1.setBounds(39, 92, 89, 14);
		Login.add(lblUsername_1);
		
		JLabel lblPassword_1 = new JLabel("Password:");
		lblPassword_1.setBounds(39, 142, 73, 14);
		Login.add(lblPassword_1);
		
		Username1 = new JTextField();
		Username1.setBounds(156, 89, 116, 20);
		Login.add(Username1);
		Username1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(156, 139, 116, 20);
		Login.add(passwordField);
		
		// Creates the button to check if the Login information is correct
		JButton btnConfirm_1 = new JButton("Confirm");
		btnConfirm_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if(login == true)
				//{
					Login.setVisible(false);
					Menu.setVisible(true);
				//}
					//else
					//{
						//JOptionPane.showMessageDialog(null, "Login Information incorrect" + "\n " + "Please Enter information again");
					//}
			}
		});
		btnConfirm_1.setBounds(160, 192, 89, 23);
		Login.add(btnConfirm_1);
	}
}
