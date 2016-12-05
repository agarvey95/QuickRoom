
import java.awt.Dimension;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main
{
	private JFrame frame;
	private JPanel MainPanel;	
	private JPanel HomePanel;
	private JPanel RefPanel;
	private JMenuBar menuBar;
	private JMenu menu;
	
	
    public static void main(String[] args) 
    
    {           
        SwingUtilities.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {  
            	HomeView view = new HomeView();
                //HomeModel model = new HomeModel(view);
                Main ref = new Main();
                ref.createFrame();  
            }
        });
        
    }
	private void createFrame()
	{
		frame = new JFrame("QuickRoom");                                             
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
        frame.setPreferredSize(new Dimension(810, 600));
        frame.setResizable(false);       
        frame.setVisible(true);
        
        createMenu();
        frame.setJMenuBar(menuBar);
        
        pages(1);
	}
	private void createMenu()
	{
		menuBar = new JMenuBar();
		menu = new JMenu("A Menu");
		menu.setMnemonic(KeyEvent.VK_A); //idk what this does tbh
		menu.getAccessibleContext().setAccessibleDescription(
		        "The only menu in this program that has menu items");
		menuBar.add(menu);
	}
	public void pages(int page)
	{

        switch (page) {
            case 1:     HomePanel = new HomeView();
            	
            	    	frame.add(HomePanel);
            
            			frame.pack();;
            break;
        			  
			case 2:     //new reference
    
						MainPanel.remove(HomePanel);
						
						//MainPanel.add();
						frame.pack();;
			break;
  }
        
        
	}
	
}