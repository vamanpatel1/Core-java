package in.com.IO;

import java.io.FileReader;

public class Test_Read {
	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader("C:/VP/hello.txt"); //character to character
		
		int ch = reader.read();       //reads a character
		
		while(ch != -1 ) {            // -1 is end of file
			System.out.println((char)ch);   //type casting
			ch = reader.read();            // for next charater
		}
		reader.close();      //closing in finally 
	}

}
      