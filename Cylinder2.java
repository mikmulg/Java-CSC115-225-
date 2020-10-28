//import Math class
import java.lang.Math;

public class Cylinder extends Shape3D
{
	//cylinder adds it own variables to Shape3D class
	private double height;
	private double radius;
	
	//cylinder constructor
	public Cylinder(double height, double radius){
	
		//calculate the surface area and volume of the cylinder
		r_2 = Math.pow(radius, 2);
		pi = Math.PI;
		surfaceArea = pi * r_2 * height;
		volume = (2 * pi * radius * height) + (2 * pi * r_2);
		
		//create an array to hold the two values SA and V
		double cylinderSAV[] = new double[2];
		cylinderSAV[0] = surfaceArea;
		cylinderSAV[1] = volume;
		
		//return the array with both values
		return cylinderSAV;
		
	}
	
	
			
	//overriding Shape3D's toString() method, adds more info
	public String toString(){
		
		return (super.toString() + "\nRadius of Cylinder was: " + radius +
				"\nHeight of Cylinder was: " + height); 
	}

}