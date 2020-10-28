//a class called Task
//implements the Priority interface
//also implements the Comparable interface

public class Task implements Priority, Comparable<Task>{
	
	//instance variables
	public Triage patientPriority;
	public String patient;
	
	public String getPatient(){
		
		return patient;
	}
	
	public void setPatient(String patient){
		
		this.patient = patient;
	}
	
	//override setPriority from interface
	public void setPriority(Triage tag){
		
		patientPriority = tag;
	}
	
	//override getPriority from interface
	public Triage getPriority(){
		
		//return the value for priority
		return patientPriority;
	}
	
	//override methods from Comparable
	public int compareTo(Task tagColour){
		
		return (Triage.compareTo(tagColour.Triage));	
	}
	
	public String toString(){
		
		return patient + "has a tag colour " + patientPriority + ".";
	}
}