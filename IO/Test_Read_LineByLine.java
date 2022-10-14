package in.com.IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test_Read_LineByLine {
     public static void main(String[] args) throws Exception {
    	 
    	 FileReader reader = new FileReader("C:/VP/hello.txt");
    	 BufferedReader in = new BufferedReader(reader);
	      
    	 String line = in.readLine();
    	 while (line != null) {
    		 System.out.println(line);
    		 line = in.readLine();
    	  }
    	    in.close();
      }
}
