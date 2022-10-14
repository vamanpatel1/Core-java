package in.com.IO;

import java.io.FileReader;
import java.util.Scanner;

public class Test_Read_Scanner {
	public static void main(String[] args) throws Exception{
		
		FileReader reader = new FileReader("C:/VP/hello.txt");
		Scanner sc = new Scanner(reader);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		reader.close();
		sc.close();
	}

}
