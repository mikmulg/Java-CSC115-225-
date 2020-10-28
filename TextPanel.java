//a program by Mikayla Mulgrew
//this program analyzes a segment of text and returns a few statistics

//import classes from swing, awt, and event packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextPanel extends JPanel{
	
	//initialize components and variables
	private JTextArea textArea;
	private JLabel labelOne, labelTwo;
	private JButton buttonOne;
	private int wordCount = 0;
	private int avgLength = 0;
	 
	
	public TextPanel(){
		
		//set layout for panel being added to the frame
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		setBackground(Color.lightGray);
		
		//create a JText area with LineWrap
		textArea = new JTextArea(10,20);
		textArea.setLineWrap(true);
		
		//create a button to analyze text area
		//button has added action listener that instantiates AnalyzeButton()
		buttonOne = new JButton("ANALYZE");
		buttonOne.setPreferredSize(new Dimension(40,40));
		buttonOne.addActionListener(new AnalyzeButton());
		
		//create a scrollpane to add to the text area with a titled border
		JScrollPane scrollTextArea = new JScrollPane(textArea);
		scrollTextArea.setBorder(BorderFactory.createTitledBorder("Enter Text Below: "));
		
		//create a JPanel with a word count label
		JPanel panelTwo = new JPanel();
		panelTwo.setBorder(BorderFactory.createLineBorder(Color.blue, 1));
		labelOne = new JLabel("Word Count: ");
		panelTwo.add(labelOne);
		
		//create a JPanel with a word length average label
		JPanel panelThree = new JPanel();
		panelThree.setBorder(BorderFactory.createLineBorder(Color.blue, 1));
		labelTwo = new JLabel("Word Length Average: ");
		panelThree.add(labelTwo);
	
		//add all components to original frame with rigid areas
		add(Box.createRigidArea(new Dimension(0,25)));
		add(scrollTextArea);
		add(Box.createRigidArea(new Dimension(0,25)));
		add(buttonOne);
		add(Box.createRigidArea(new Dimension(0,25)));
		add(panelTwo);
		add(panelThree);
	}
	
	//create an action listener class for the button
	private class AnalyzeButton implements ActionListener{
		
		//override actionPerformed from ActionListener
		public void actionPerformed(ActionEvent event){
			
			//get text from the text area
			String text = textArea.getText();
			
			//split text from textArea and add to words list 
			String words[] = text.split(" ");
			
			//count words and calculate average word length
			wordCount = words.length;
			avgLength = text.length()/wordCount;
			
			//return labels with calculated statistics
			labelOne.setText("Word Count: " + wordCount);
			labelTwo.setText("Word Length Average: " + avgLength);

		}
		
	}
	
	public static void main(String[] args){
		
		//create a frame
		JFrame frameOne = new JFrame("Text Analyzer");
		frameOne.setSize(250,300);
		
		//set close operation of frame
		frameOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//call on TextPanel() add to frame
		frameOne.getContentPane().add(new TextPanel());
		frameOne.pack();
		frameOne.setVisible(true);
		
		
	}
}