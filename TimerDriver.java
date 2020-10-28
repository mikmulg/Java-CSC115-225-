//this a program by Mikayla Mulgrew
//this is the driver for Timer

//import packages
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class TimerDriver{
	
	public static void main(String[] args){
		
		//create a frame
		JFrame newFrame = new JFrame("STOPWATCH");
		//set closing operation for frame
		newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//call on stopwatch, add to frame
		newFrame.getContentPane().add(new Timer());
		newFrame.pack();
		newFrame.setVisible(true);
	}
}