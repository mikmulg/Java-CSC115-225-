

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Assignment4_Q1 {

    public static void main(String[] args) {
        if (0 < args.length) {
            try{
                Scanner scan = new Scanner(new File(args[0]));
                while (scan.hasNextLine()) {
                    System.out.println(scan.nextLine());
                }
            } catch(FileNotFoundException e){
                System.out.println("File Not Found.");
            }
        }
    }
}



//C:\Users\Mik\IdeaProjects\Assignment4\src\com\company
