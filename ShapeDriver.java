//demonstrates the use of inheritance of three different shapes from the Shape3D class
public class ShapeDriver {
	
	public static void main(String[] args){
		
		//print out what the program does
		System.out.println();
		System.out.println("This program is able to calculate the Surface Area and Volume of a 3D Shape.");
		System.out.println();
		System.out.println();
		System.out.println("----3D SHAPES----");
		System.out.println();
		
		//create 3 new shapes
		Shape3D newCube = new Cube("---> Cube", 100.2);
		Shape3D newSphere = new Sphere("---> Sphere", 31.6);
		Shape3D newCylinder = new Cylinder("---> Cylinder",94,22.22);
		
		//arrange those shapes in an array
		Shape3D[] shapeArray = {newCube, newSphere, newCylinder};
		
		//print out the shapes from the array
		System.out.println(shapeArray[0]);
		System.out.println();
		System.out.println(shapeArray[1]);
		System.out.println();
		System.out.println(shapeArray[2]);	
	}
}