//program by Mikayla Mulgrew
/*this program reads book titles from an input file
and writes unique titles to an output file*/

//import necessary packages
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;
import java.util.ArrayList;


public class FileReaderException{
	
	public static void main(String[] args){
		
		
		try{
			
			//access to the input file
			File bookTitles = new File("./bookTitles.inp");
			Scanner scanTitles = new Scanner(bookTitles);
		
			//open an output file
			FileWriter uniqueWrite = new FileWriter("UniqueTitles.out");
			BufferedWriter uniqueTitles = new BufferedWriter(uniqueWrite);
		
			//create an arraylist to add all titles from bookTitles
			ArrayList<String> titleList = new ArrayList<>();
			
			//read through file lines, add to titleList array
			while (scanTitles.hasNextLine()){
					
				String title = scanTitles.nextLine();
				titleList.add(title);
			}
			
			//create a new arraylist for non-duplicate elements
			ArrayList<String> uniqueTitleList = new ArrayList<>();
			
			//iterate through all titles and add unique titles to uniquTitleList
			for (String title : titleList){
				
				if (!uniqueTitleList.contains(title)){
					
					uniqueTitleList.add(title);
				}
			}
			
			//iterate through all unique titles and write to output file
			for (String title : uniqueTitleList){
				
				uniqueTitles.write(title + "\n");
			}
			
			//close the input and output texts
			uniqueTitles.close();
			scanTitles.close();
			
			//if try statement runs correctly print statement saying so 
			System.out.println("A file with unique book titles has been created.");
		}
		
		catch(FileNotFoundException noFile){
			
			//print statement if file not found
			System.out.println("The file referenced in this program does not exist.");
		}
		
		catch(IOException inOut){
			
			//print statement if there is an IO error
			System.out.println("This program has thrown an IOException.");
		}
		
		finally{
			
			//print statement when program has finished
			System.out.println("The program has been run through.");
		}
	}
}