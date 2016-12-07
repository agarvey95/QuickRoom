package QR;

import javax.swing.SwingUtilities;

public class Main
{
public static void main(String[] args) 
{           
        SwingUtilities.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {  
            	//creates JFRAME
            	MainView Main = new MainView();
            	HomeView Home = new HomeView();
				ResultsView Results = new ResultsView();

                Main.createPanel();
                //passes to runner method which is a non-static
                Runner pass = new Runner();
                pass.setValues(Main, Home, Results);
            }
        }); 
    } 
}