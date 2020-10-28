//by Mikayla Mulgrew
//this is a program to test the parade line up 

public class ClownParadeDriver{
	
	public static void main(String[] args){
		
		//create a parade
		Parade clownParade = new Parade();
		
		//add clowns to parade
		clownParade.addClown("Ronald McDonald");
		clownParade.addClown("Krusty the Clown");
		clownParade.addClown("Mikayla Mulgrew");
		clownParade.addClown("Joseph Grimaldi");
		
		
		//print out clowns
		System.out.println();
		System.out.println("First Parade:" );
		System.out.println(clownParade.toString());
		System.out.println();
		
		//clown leaves parade
		System.out.println("Second Parade:");
		clownParade.removeClown();
		System.out.println(clownParade.toString());
		System.out.println();
		
		//clown enters parade
		System.out.println("Third Parade:");
		clownParade.addClown("Oleg Popov");
		System.out.println(clownParade.toString());
		System.out.println();
		
		//2 clowns leave, add two clowns
		System.out.println("Fourth Parade:");
		clownParade.removeClown();
		clownParade.removeClown();
		clownParade.addClown("Lou Jacobs");
		clownParade.addClown("Bill Irwin");
		System.out.println(clownParade.toString());
		System.out.println();
		
		
	}
}