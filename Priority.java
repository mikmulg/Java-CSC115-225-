//an interface called Priority 
//implements the comparable interface 

public interface Priority extends Comparable<Priority>{
	
	//abstract methods for the interface
	public void setPriority(int priorityNumber);
	public int getPriority();
}