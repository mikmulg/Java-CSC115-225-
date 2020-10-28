//a class called Task
//implements the Priority interface and therefore the comparable interaface as well
//recieves patient information from the TaskDriver
//sorts patients based on priority level

public class Task implements Priority{
	
	//instance variables
	public String patientPriority;
	public String patientInjury;
	public int priorityNumber;
		
	//sets the patients tag colour and injury description
	public void setPatient(String patientPriority, String patientInjury){
		
		this.patientPriority = patientPriority;
		this.patientInjury = patientInjury;
	}
	
	public String getPatient(){
		
		//returns patients injury description
		return patientInjury;
	}
	
	//override setPriority from interface
	public void setPriority(int priorityNumber){
		
		this.priorityNumber = priorityNumber;
	}
	
	//override getPriority from interface
	public int getPriority(){
		
		//return the value for priority
		return priorityNumber;
	}
	
	
	//override methods from Comparable interface
	public int compareTo(Priority tag){
		
		//compares tag values, returns in order of priority
		return this.getPriority() - tag.getPriority();	
	}
	
	//print out patient information 
	public String toString(){
		
		return "[" + patientInjury + "]" + " has a tag colour " + patientPriority + ".";
	}
}