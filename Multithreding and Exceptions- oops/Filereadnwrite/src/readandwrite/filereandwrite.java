package readandwrite;

import java.io.File;
import java.io.IOException;

public class filereandwrite {
	public static void main(String[] args){
		
		File myFile = new File("file3.txt");
		
		
		try {
			if (myFile. createNewFile()) {
				System.out.println("File is created successfully");
				
			}
			else {
				System.out.println("File is not created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File error");
		}
		
	}

}
