package readandwrite;

import java.io.FileWriter;
import java.io.IOException;

public class filewritedemo {
	
	public static void main(String[] args)
	{
		String data = "101,rahul,banglore,india.";
		
		
		try{
			FileWriter output = new FileWriter("file1.txt");
		
		output.write(data);
		System.out.println("Data is written Succsessfully");
		output.close();
		}
		catch(IOException ex) {
			System.out.println("File Write error....");
		}
	}
	

}
