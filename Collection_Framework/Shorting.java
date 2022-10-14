package in.com.Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class Shorting  extends Marksheet{
	public static void main(String[] args) {
		
		/*String s = "Vaman";
		String s1 = "Vaman";
		String s2 = "vaman";
		Integer i = 10;
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(i.hashCode());*/
		
		ArrayList a = new ArrayList();
		Marksheet m1 = new Marksheet();
		a.add(28);
		a.add(15);
		a.add(57);
		a.add(2);
		
		/*System.out.println(a);
		
		Collections.sort(a);
		System.out.println("Sort : "+a);*/
		
		Marksheet m2 = new Marksheet();
		a.add(33);
		a.add(27);
		a.add(5);
		
		a.contains(m2);
		a.remove(m2);
		System.out.println(a.contains(m2));
	}

}
