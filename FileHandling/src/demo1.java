import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
 
public class demo1 {
     public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "101,rahul,bangalore,india";
        try
          {
             String filename= "myfile1.txt";
             FileWriter fw = new FileWriter(filename,true); 
             fw.write(strLine);
             fw.write("\n File data is appended \n");
             fw.close();
             BufferedReader br = new BufferedReader(new FileReader("myfile1.txt"));
            
             while (strLine != null)
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();
           }
           catch(IOException ioe)
           {
            System.out.println("File append error....");
           }
        }
  }

