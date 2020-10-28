//an interface called Priority 
//this interface establishes numeric priority among a set of objects 

public interface Priority{
	
	//define constants using enum operator
	//colors represent emergency response triage
	enum Triage{
		BLACK,
		RED,
		YELLOW,
		GREEN
	}

	//abstract methods for the interface
	public void setPriority(Triage tag);
	public int getPriority();
}