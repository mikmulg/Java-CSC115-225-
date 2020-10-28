//a program by Mikayla Mulgrew
//this program demonstrates the use of the RandomBox class

//import packages
import java.util.Random;

public class RandomBoxDriver{
	
	public static void main(String[] args){
		
		//NAME BOX
		
		//create a box of names
		RandomBox<String> friendNames = new RandomBox<>();
		
		//check if name box is empty
		System.out.println();
		System.out.println("Name Box is initially empty: " + friendNames.isEmpty());
		
		//add names to name box
		friendNames.add("Rowan");
		friendNames.add("Genna");
		friendNames.add("Siobhan");
		friendNames.add("Shubhra");
		friendNames.add("Heidi");
		
		//check again if name box is empty
		System.out.println("Name Box is now empty: " + friendNames.isEmpty());
		
		//print contents of name box
		System.out.println("Name Box contains: " + friendNames.toString());
		System.out.println();
		
		//print a randomly drawn name
		System.out.println("Randomly Drawn Friend: ");
		System.out.println(friendNames.drawItem());
		System.out.println();
		
		//NUMBER BOX
		
		//create a box of numbers
		RandomBox<Number> seatNumber = new RandomBox<>();
		
		//check if number box is empty
		System.out.println("Number Box is initially empty: " + seatNumber.isEmpty());
		
		//add numbers to box
		seatNumber.add(1);
		seatNumber.add(2);
		seatNumber.add(3);
		seatNumber.add(4);
		seatNumber.add(5);
		
		//check again if number box is empty
		System.out.println("Number Box is now empty: " + seatNumber.isEmpty());
		
		//print contents of number box
		System.out.println("Number Box contains: " + seatNumber.toString());
		System.out.println();
		
		//print a randomly drawn number
		System.out.println("Randomly Drawn Seat Number: ");
		System.out.println(seatNumber.drawItem());
		System.out.println();
		
	}
}