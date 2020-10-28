//a public abstract class, exists to be extended, cannot be instantiated
//this is the 3D shape parent class
public abstract class Shape3D {
	
	//declare instance variables that which all subclasses have in common
	private String shapeType = "Shape";
	
	//declare abstract methods that which all subclasses have in common
	public abstract double shapeSurfaceArea();
	public abstract double shapeVolume();
	
	//parent class constructor
	public Shape3D(String shapeType){
		
		//invokes method parameter variable
		this.shapeType = shapeType;
	}
	
	public String toString(){
		
		return shapeType;
	}
	
}