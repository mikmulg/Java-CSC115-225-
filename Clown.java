//by Mikayla Mulgrew
//this program gives each clown a name

public class Clown{
	
	//initialize name variable
	String nameOfClown;
	
	//clown name constructor
	public Clown(String clownName){
		
		nameOfClown = clownName; 
	}
	
	//return clown name 
	public String toString(){
		
		return "\n\t" + nameOfClown; 
		
	}
}