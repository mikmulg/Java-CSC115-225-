//by Mikayla Mulgrew
//this is a program to add/remove clowns to a parade lineup

//import arraylist
import java.util.ArrayList;

public class Parade{
	
	//create a clown arraylist
	//holds clown objects
	ArrayList<Clown> clownParade = new ArrayList<Clown>();
	
	//method to add clowns
	public void addClown(String clownName){
		
		//create a new clown
		Clown newClown = new Clown(clownName);
		
		//add to the end of the parade
		clownParade.add(newClown);
	}
	
	//method to remove clowns
	public void removeClown(){
		
		//remove clown that is at front
		clownParade.remove(0);
	}
	
	public String toString(){
		
		//create an empty string
		String paradeOfClowns = "";
		
		//add clown names to string in order of appearance
		for (int i = 0; i < clownParade.size(); i++){
			
			paradeOfClowns += clownParade.get(i);
		}
		
		//return string 
		return paradeOfClowns;
		
	}
	
	
	
	
}