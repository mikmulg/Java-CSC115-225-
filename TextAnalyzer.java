//a program by Mikayla Mulgrew
//this program analyzes a segment of text and returns a few statistics

//import packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextAnalyzer{
	
	public static void main(String[] args){
		
		//create a new frame
		JFrame window = new JFrame("Text Analyzer");
		window.setSize(300,300);
		
		//set close operation
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.getContentPane().add(new TextAnalyzerPanel());
		window.pack();
		window.setVisible(true);
	}
}