
//class made abstract so that it can not be instantiated
public abstract class Shape3D2{
	
	//all classes that EXTEND Shape3D have these two methods
	public abstract double shapeSurfaceArea();
	public abstract double shapeVolume();
	
	//declare an instance variable, each shape has a name
	private String shapeName;
	
	//parent class constructor, initiliazes the instantiated  object
	public Shape3D2(String shapeName){
		
		//this differentiates an instance from a local variable
		this.shapeName = shapeName;
	}
		
	//toString() to print the shape of choice
	public String toString(){
		
		return "The calculated values for the" + shapeName + "are as follows: ";
	}
	
}