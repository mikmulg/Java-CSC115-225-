//import math class and decimal formatter
import java.lang.Math;
import java.text.DecimalFormat;

//extension of Shape3D class, finds surface area and volume of a sphere
public class Sphere extends Shape3D{
	
	//declare instance variables specific to a sphere
	private double sphereRadius;
	
	//sphere constructor method
	public Sphere(String shapeType, double sphereRadius){
		
		//call on parent constructor for first variable 
		//super argument must come first in instructor
		super(shapeType);
		//invoke a new parameter with this keyword
		this.sphereRadius = sphereRadius;	
	}
	
	//override the abstract methods from the parent class
	public double shapeSurfaceArea(){
		
		//calculate and return the surface area of the sphere
		return 4 * Math.PI * Math.pow(sphereRadius,2);	
	}
	
	public double shapeVolume(){
		
		//calculate and return the volume of the sphere
		return (4.0/3) * Math.PI * Math.pow(sphereRadius,3);
	}
	
	//add to the parents toString()
	public String toString(){
		
		//format volume and surface area for return
		DecimalFormat format = new DecimalFormat("###.##");
		
		return super.toString() + "\nThe radius inputted was: " + sphereRadius + 
		"\nThe Surface Area is: " + format.format(shapeSurfaceArea()) + 
		"\nThe Volume is: " + format.format(shapeVolume());
	}
}