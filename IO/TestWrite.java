package in.com.IO;

import java.io.FileWriter;

public class TestWrite {
	public static void main(String[] args)throws Exception {
		FileWriter fw = new FileWriter("C:/VP/hello.txt");
		
		fw.write('A');
		fw.close();
			System.out.println("Check C:/VP/hello.txt");
		
	}

}
