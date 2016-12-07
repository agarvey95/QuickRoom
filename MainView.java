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

