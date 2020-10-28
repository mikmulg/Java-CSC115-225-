//import Math class
import java.lang.Math;

public class Cube2 extends Shape3D2 {
	
	//cube adds its own variables 
	private double sideLength;
	
	//constructor method
	public Cube2(double sideLength){
		
		//invokes parent class constructor
		super();
		//initializes the new variable
		this.sideLength = sideLength;		
	}
	
	//get and set side length
	public double getLength(){
		
		return sideLength;
	}
	
	public void setLength(double sideLength){
	
		this.sideLength = sideLength;
	}
	
	//findSurfaceArea overrides the parent class method
	public double shapeSurfaceArea(){
		
		//calculate and return surface area 
		return Math.pow(sideLength,3);
	}
	
	//findVolume overrides the parent class method
	public double shapeVolume(){
		
		//calculate and return volume
		return (sideLength * sideLength) * 6.0;
	}
	
	//overriding Shape3D's toString method, adds more info
	public String toString(){
		
		return super.toString() + "\nLength of side of cube is: " + sideLength + "\nSurface Area of cube is: " + shapeSurfaceArea() +"\nVolume of cube is: " + shapeVolume();
	}
}
