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

import QR.Runner;

public class HomeView extends JPanel
{
    private JLabel label;
    private JButton button;
    private JTextField txtfield;
    private JPanel panel;
	private JLabel lblWelcomeToQuickroom;
    
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
        	
             /*
              * Anthony can u use the string from the textfield to search the databse(city)??
              * and then prase those results into strings here and ill handle the rest.   
              */
                
            }
        };
        button.addActionListener(a);
        add(panel);    
	}
}