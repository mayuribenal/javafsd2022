package readandwrite;


import java.io.FileReader;
import java.io.IOException;

public class filereaddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] data = new char[100];
		try {
			FileReader input = new FileReader("file1.txt");
			input.read(data);
			System.out.println("Data rececived successfully");
			System.out.println(data);
			input.close();
		}
		catch (IOException e) {
			System.out.println("File read error..");
		}

	}

}
