//import math class and decimal formatter
import java.lang.Math;
import java.text.DecimalFormat;


//extension of Shape3D, finds surface area and volume of a cylinder
public class Cylinder extends Shape3D{
	
	//declare instance variables specific to a cylinder
	private double cylinderRadius;
	private double height;
	
	//cylinder constructor method
	public Cylinder(String shapeType, double cylinderRadius, double height){
		
		//call on parent constructor for first variables
		//super argument must come first in instructor
		super(shapeType);
		//invoke new parameters with this keyword
		this.cylinderRadius = cylinderRadius;
		this.height = height;
	}
	
	//override the abstract methods from the parent class
	public double shapeSurfaceArea(){
		
		//calculate and return the cylinders surface area
		return Math.PI * Math.pow(cylinderRadius,2) * height;
	}
	
	public double shapeVolume(){
		
		//calculate and return the cylinders volume
		return (2 * Math.PI * cylinderRadius * height) + (2 * Math.PI * Math.pow(cylinderRadius,2));
	}
	
	//add to the parent class' toString()
	public String toString(){
		
		//format surface area and volume for return
		DecimalFormat format = new DecimalFormat("###.##");
		
		return super.toString() + "\nThe radius inputted was: " + cylinderRadius + 
		"\nThe height inputted was: " + height + "\nThe Surface Area is: " + 
		format.format(shapeSurfaceArea()) + "\nThe Volume is: " + format.format(shapeVolume());
		
	}
	
}