//a program by Mikayla Mulgrew
//this program works as a stopwatch 

//import packages
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class Stopwatch extends JPanel{
	
	//initialize
	private JButton start, stop, reset;
	private JPanel buttonPanel, timerPanel;
	private JLabel timerDisplay;
	private int count = 0;
	private boolean timerRunning = false;
	private Stopwatch timer;
	
	//constructor
	public Stopwatch(){
		
		setLayout(new BorderLayout());
		
		//create buttons
		start = new JButton("START");
		stop = new JButton("STOP");
		reset = new JButton("RESET");
		
		//add listener to buttons
		start.addActionListener(new ButtonClick());
		stop.addActionListener(new ButtonClick());
		reset.addActionListener(new ButtonClick());
		
		//create label
		timerDisplay = new JLabel("00.0 seconds", JLabel.CENTER);
		
		//create panel with timer
		timerPanel = new JPanel();
		timerPanel.setBorder(BorderFactory.createEtchedBorder());
		timerPanel.add(timerDisplay);
		
		
		//create panel with buttons
		buttonPanel = new JPanel();
		buttonPanel.add(start);
		buttonPanel.add(stop);
		buttonPanel.add(reset);
		
		//add panels to frame
		add(timerPanel, BorderLayout.NORTH);
		add(buttonPanel, BorderLayout.SOUTH);
		
		
	}
	
	private class ButtonClick implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			if (event.getSource() == start){
				
				if (count == 0){
					
				
			}else if (event.getSource() == stop){
				
				elapsedTime = System.currentTimeMillis();
				timerRunning = false;
				totalTime = elapsedTime - startingTime;
				clock.setText(totalTime + "milliseconds");
				//System.out.println(totalTime);
				
			}else if (event.getSource() == reset){
				clock.setText("0.0");
			}
			
		}
	}
	
	public void startClock(){
		
		timerRunning = true;
		
		
	}
	
	public void stopClock(){
		
	}
	
	public void updateClock(){
	
	}
	
	
	public static void main(String[] args){
		
		//create a frame
		JFrame newFrame = new JFrame("STOPWATCH");
		//set closing operation for frame
		newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//call on stopwatch, add to frame
		newFrame.getContentPane().add(new Stopwatch());
		newFrame.pack();
		newFrame.setVisible(true);
	}
}