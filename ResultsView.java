package QR;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ResultsView extends JPanel
{
    private JLabel label;
    private JButton button;
    private JLabel resultsfield;
    private JPanel panel;
	private JLabel lblWelcomeToQuickroom;
    private String results;
	
	public ResultsView()
	{
		//temp code to later be replaced
		final Object rows[][] = { { "one", "1" }, { "two", "2" }, { "three", "3" }, { "four", "4" },

	    };
	    final Object headers[] = { "English", "#" };
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(800, 520));
		panel.setBackground(Color.BLUE);
		
		final JTable table = new JTable(rows, headers);
	    JScrollPane scrollPane = new JScrollPane(table);
	    panel.add(scrollPane, BorderLayout.CENTER);
	    scrollPane.setCorner(JScrollPane.UPPER_RIGHT_CORNER, new JButton("..."));


		lblWelcomeToQuickroom = new JLabel("Results:");
		lblWelcomeToQuickroom.setFont(new Font("Times New Roman", Font.BOLD, 28));
		panel.add(lblWelcomeToQuickroom);
        
		resultsfield = new JLabel(results);
        panel.add(resultsfield);

        add(panel);    
	}
	public void setResults(String results)
	{
		this.results=results;
	}
	
}
