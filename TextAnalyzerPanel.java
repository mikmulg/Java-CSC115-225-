//a program by Mikayla Mulgrew
//this program analyzes a segment of text and returns a few statistics

//import packages
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TextAnalyzerPanel extends JPanel implements ActionListener{
	
	//variables
	private int wordCount, wordLength;
	
	//labels
	private JLabel words, averageLength;

	//text area
	private JTextArea inputText;
	
	//button
	private JButton calculateButton;
	
	//panel
	private JPanel newPanel;
	
	
	//contructor
	public TextAnalyzerPanel(){
		
		//set up panel
		newPanel = new JPanel();
		//edit text areas appearance
		newPanel.setLayout(new BoxLayout(newPanel, BoxLayout.PAGE_AXIS));
		
		//set up button
		calculateButton = new JButton("ANALYZE");
		calculateButton.addActionListener(this);
		newPanel.add(calculateButton);
		
		//set up text area
		inputText = new JTextArea();
		inputText.setBounds(50,50,50,50);
		inputText.setWrapStyleWord(true);
		inputText.setLineWrap(true);
	
		//set up labels
		words = new JLabel("Number of Words:");
		averageLength = new JLabel("Average Word Length:");
		
		newPanel.add(words);
		newPanel.add(averageLength);
				
		add(newPanel, BorderLayout.SOUTH);
		setPreferredSize(new Dimension(450, 450));
		setBackground(Color.orange);
		
	}
	
	public void actionPerformed(ActionEvent event){	
			
		Object listener = event.getSource();
		
		if (listener == calculateButton){
			
			setStats();
		}
			
	}
	
	private void setStats(){
		
		//intialize variables
		int wordCount, charCount, avgLength;
			
		String text = inputText.getText();
			
			
		/*an array to hold inidiviual words,
		split method finds words split by whitespace*/
		String wordsFromText[] = text.split("\\s");
			
		//calculate avg length of words
		avgLength = text.length()/wordsFromText.length;
		wordCount = wordsFromText.length;
		charCount = text.length();
			
			
		words.setText(String.valueOf(wordCount));
		averageLength.setText(String.valueOf(avgLength));
	}
}