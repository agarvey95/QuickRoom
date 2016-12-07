package QR;

import javax.swing.JPanel;

public class Runner 
{
	private static MainView main;
	private static HomeView home;
	private static ResultsView results;

	public void setValues(MainView main, HomeView home, ResultsView results)
	{
		this.main = main;
		this.home = home;	
		this.results = results;
	}
	public static void removeAll()
	{
		main.getContentPane().removeAll();
		main.revalidate(); 
		main.repaint();
		main.pack();
	}
	public static void switchResults(String resultstxt)
	{
		results.setResults(resultstxt);
		main.add(results);
		main.revalidate(); 
		main.repaint();
		main.pack();
          
	}
	public static void switchHome()
	{
		main.add(home);
		main.revalidate(); 
		main.repaint();
		main.pack(); 
	}
	
}
