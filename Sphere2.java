//import Math class
import java.lang.Math;

public class Sphere extends Shape3D
{
	//sphere adds it own variables to Shape3D
	private double radius;
	
	//sphere constructor
	public Sphere(double sphereRadius){
		
		//for the parent class variable shapeName
		super("Sphere");
		this.sphereRadius = sphereRadius;
		
	}
	
	//sphere adds a method, get radius
	//get and set radius
	public double getRadius(){
		
		return sphereRadius;
	}
	
	//sphere adds a method, set radius
	public void setRadius(double newRad){
	
		this.radius = radius;
	}

	//sphere calculates surface area
	public void shapeSurfaceArea(double newRad){
		
		return 4.0 * Math.PI * Math.pow(radius,2);
	}
	
	//sphere calculates volume
	public void shapeVolume(){
		
		return (4.0/3.0) * Math.PI * Math.pow(radius,3);
	}
	
	//overriding Shape3D's toString() method, adds more info
	public String toString(){
		
		return ("\nRadius of sphere was: " + radius + 
				"\nThe Surface Area of the sphere is: " + shapeSurfaceArea() +
				"\nThe Volume of the sphere is: " + shapeVolume()); 
}