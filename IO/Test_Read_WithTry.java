package in.com.IO;

import java.io.FileReader;

public class Test_Read_WithTry {
	public static void main(String[] args)throws Exception {
		
		try (FileReader reader = new FileReader("C:/VP/hello.txt")){
			int ch = reader.read();
			while (ch != -1) {
				System.out.println((char)ch);
				ch = reader.read();
			}
			//reader.close();  
		}                     //try block end
	}

}
