//driver class to show features of Task objects 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TaskDriver{
	
	public static void main(String[] args){
		
		//a brief introduction to triage, disaster response
		//in case of major disaster with many casualties
		//patients are sorted into 4 categories based on level of injury
		//categories help decide who needs medical attention first 
		System.out.println("------------------------------------------------");
		System.out.println("                   S.T.A.R.T.                   ");
		System.out.println("------------------------------------------------");
		System.out.println("        Simple Triage and Rapid Transport       ");
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("Patients are sorted based on objective criteria.");
		System.out.println("------------------------------------------------");
		System.out.println();
		System.out.println("GREEN:		Minor Injury, walking wounded");
		System.out.println("YELLOW:		Delayed, can wait ");
		System.out.println("RED:		Immediate, critical interventions");
		System.out.println("BLACK:		Expectant/Deceased");
		System.out.println();
		System.out.println();
		System.out.println("Responders tag priority is Red, Yellow, Green, then Black.");
		System.out.println();
		System.out.println();

		//create an array to add each patient
		List<Priority> patients = new ArrayList<Priority>();
		
		//create new Task object for each patient
		Task patient1 = new Task();
		Task patient2 = new Task();
		Task patient3 = new Task();
		Task patient4 = new Task();
		Task patient5 = new Task();
		
		
		//each patient given a number that correspinds with tag colour
		//GREEN(3) YELLOW(2) RED(1) BLACK(4)
		//set each patient with a tag colour and injury type
		patient1.setPriority(3);
		patient1.setPatient("GREEN", "Broken Arm");
		
		patient2.setPriority(4);
		patient2.setPatient("BLACK", "Decapitated");
		
		patient3.setPriority(2);
		patient3.setPatient("YELLOW", "Major Burns, no signs of shock");
		
		patient4.setPriority(1);
		patient4.setPatient("RED", "Going into Cardiac Arrest");
		
		patient5.setPriority(1);
		patient5.setPatient("RED", "Unconcious but breathing");
		
		
		//add each patient to the array 
		patients.add(patient1);
		patients.add(patient2);
		patients.add(patient3);
		patients.add(patient4);
		patients.add(patient5);
		
		
		//sort the array so patients are printed 
		//in order of who needs medical attention first
		Collections.sort(patients);
		for (Priority T: patients){
			System.out.println(T);
		}	
	}
}