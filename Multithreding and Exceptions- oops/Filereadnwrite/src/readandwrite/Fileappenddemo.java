package readandwrite;

import java.io.FileWriter;
import java.io.IOException;

public class Fileappenddemo {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
			
		String data ="This data is appended";
		
		try {
			FileWriter output = new FileWriter("file1.txt",true);
			output.write(data);
			System.out.println("\n Data is appended Successfully..\n");
			output.close();
			
			
		} 
		
		catch (IOException e) {
			System.out.println("File append error..");
		}
	}

}
