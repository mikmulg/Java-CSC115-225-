//********************************************************************
//  Words2.java       Java Foundations
//
//  Demonstrates the use of the super reference.
//********************************************************************

public class Words2
{
    //-----------------------------------------------------------------
    //  Instantiates a derived class and invokes its inherited and
    //  local methods.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        Dictionary2 webster = new Dictionary2(1500, 52500);
		
		Dictionary2 newEngland = new Dictionary2(2100, 75234);

        System.out.println("Number of pages: " + newEngland.getPages());

        System.out.println("Number of definitions: " +
                           newEngland.getDefinitions());

        System.out.println("Definitions per page: " +
                           newEngland.computeRatio());
    }
}
