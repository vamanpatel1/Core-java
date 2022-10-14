package in.com.IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestRead {
	public static void main(String[] args)throws Exception {
		
		try
		(FileReader reader = new FileReader("C:/VP/hello.txt")){
		//BufferedReader br = new BufferedReader(reader);
		//String line = br.readLine();
		
		int ch = reader.read();      //reads a character
		while(ch != -1) {              // -1 is end of file
			System.out.println((char)ch);
			ch = reader.read();
		
		
		
		/*while (line != null) {
			System.out.println(line);
			line = br.readLine();*/
		}
			
		reader.close(); //try block end in try cash
	}

		}
}
