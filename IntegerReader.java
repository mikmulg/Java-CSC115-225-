//program by Mikayla Mulgrew
//this file reads a series of integers from the user and prints their average
//reads each integer as a string and then converts to an integer

//import scanner class
import java.util.Scanner;

public class IntegerReader{
	
	public static void main(String[] args){
		
		System.out.println();
		System.out.println("This program takes ten numbers and prints their average.");
		System.out.println();
		System.out.println();
		
		//create a scanner object
		Scanner input = new Scanner(System.in);
		
		//initialize variables to be used in for loop 
		String number;
		int inputNumber, average;
		int inputSum = 0;
		
		//for loop to iterate through ten numbers
		for (int num = 1; num <= 10;){
			
			//get user input for ten numbers using scanner nextLine()
			System.out.print("Input number " + num + ": ");
			number = input.nextLine();
			System.out.println();
			
			//try catch statement if invalid integer is inputted
			try{
				//convert number string into integer
				inputNumber = Integer.parseInt(number);
				//increment the counter 
				num++;
				//add inputted number to sum
				inputSum += inputNumber;	
			}
			
			catch(NumberFormatException numException){
				
				System.out.println("Please enter a valid integer.");
				System.out.println();
				
			}
		}
		//calculate average of the inputted numbers and print
		average = (inputSum / 10);
		System.out.println("Average of inputted numbers is: " + average);
	}
}