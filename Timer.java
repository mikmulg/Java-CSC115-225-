//a program by Mikayla Mulgrew
//this program works as a stopwatch 

//import packages
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class Timer extends JPanel{
	
	//initialize
	private JButton start, stop, reset;
	private JPanel buttonPanel, timerPanel, legendPanel;
	private JLabel timerDisplay, legend;

	
	//private int count = 0;
	private int elapsedSeconds = 0;
	
	//constructor
	public Timer(){
		
		setLayout(new BorderLayout());
		
		//create buttons
		start = new JButton("START");
		stop = new JButton("STOP");
		reset = new JButton("RESET");
		
		//set mnemonics for buttons
		start.setMnemonic(KeyEvent.VK_A);
		stop.setMnemonic(KeyEvent.VK_O);
		reset.setMnemonic(KeyEvent.VK_R);
		
		//add listener to buttons
		start.addActionListener(new ButtonClick());
		stop.addActionListener(new ButtonClick());
		reset.addActionListener(new ButtonClick());

		//create label
		timerDisplay = new JLabel("00.0 seconds", JLabel.CENTER);
		legend = new JLabel("alt A - START, alt O - STOP, alt R - RESET");
		
		//create panel with timer
		timerPanel = new JPanel();
		timerPanel.setBorder(BorderFactory.createEtchedBorder());
		timerPanel.add(timerDisplay);
		
		//create panel with buttons
		buttonPanel = new JPanel();
		buttonPanel.add(start);
		buttonPanel.add(stop);
		buttonPanel.add(reset);
		
		//creat a panel with the legend
		legendPanel = new JPanel();
		legendPanel.add(legend);
		
		//add panels to frame
		add(timerPanel, BorderLayout.NORTH);
		add(buttonPanel, BorderLayout.CENTER);
		add(legendPanel, BorderLayout.SOUTH);
		
		
	}
	
	private class ButtonClick implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			if (event.getSource() == start){
		
				timerDisplay.setText("Start was pressed.");
						
			}else if (event.getSource() == stop){
				
				timerDisplay.setText("Stop was pressed.");
				
			}else if (event.getSource() == reset){
				
				timerDisplay.setText("00.0 seconds");
				
			}
		}
	}
}