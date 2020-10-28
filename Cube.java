//import Math class and decimal formatter
import java.lang.Math;
import java.text.DecimalFormat;

//an extension of Shape3D, given a length finds volume and surface are of a cube
public class Cube extends Shape3D {
	
	//declare instance varaibles specific to a cube
	private double sideLength;
	
	//cube constructor method
	public Cube(String shapeType, double sideLength){
		
		//call on parent constructor for first variable
		//super argument must come first in constructor
		super(shapeType);
		//invoke new parameter with this keyword
		this.sideLength = sideLength;
	}
	
	//override the abstract methods from the parent class
	public double shapeSurfaceArea(){
		
		//calculate and return cubes surface area
		return Math.pow(sideLength, 2) * 6;
	}
	
	public double shapeVolume(){
		
		//calculate and return cubes volume
		return Math.pow(sideLength, 3);
	}
	
	//add to the parent classes toString()
	public String toString(){
		
		//format volume and surface area before returning
		DecimalFormat format = new DecimalFormat("###.##");
		
		return super.toString() + "\nThe length inputted was: " + sideLength + "\nThe Surface Area is: " + 
		format.format(shapeSurfaceArea()) + "\nThe Volume is: " + format.format(shapeVolume());
	}
}