//this is a program by Mikayla Mulgrew
//a generic class
/*this program simulates a box that holds objects
of which you can pull out at random*/

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class RandomBox<T>{
	
	//initialize a list
	List<T> items;
	
	//constructor
	public RandomBox(){
		
		items = new ArrayList<>();
	}
	
	public void add(T item){
		
		//add items to items arraylist
		items.add(item);
	}
	
	public boolean isEmpty(){
		
		//returns true or false
		return items.isEmpty();
	}
	
	public T drawItem(){
		
		//create a random generator
		Random randomItem = new Random();
		
		//generate a random number 
		int rI = randomItem.nextInt(5);
		
		//return the item in the position of the generated number
		return items.get(rI);
	}
	
	public String toString(){
		
		//return list of items
		return ("\t" + items);
	}
	
}