
import java.io.*;

public class Sort{
	
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		File ff = new File(args[0]);
        BufferedReader brf = new BufferedReader(new FileReader(ff));
        String list = brf.readLine();
        while (list != null){
            System.out.println(list);
        }
	}
	
}