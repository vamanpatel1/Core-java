package in.com.Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test extends Marksheet1{
	public static void main(String[] args) {
		
		Marksheet1 M1 = new Marksheet1();
		M1.setRollNumber("2");
		M1.setFirstName("Ram");
		M1.setLastName("Verma");
		M1.setPhysics(77);
		M1.setChemistry(87);
		M1.setMathes(91);
		
		Marksheet1 M2 = new Marksheet1();
		M2.setRollNumber("1");
		M2.setFirstName("Ram");
		M2.setLastName("Sharma");
		M2.setPhysics(58);
		M2.setChemistry(33);
		M2.setMathes(40);
		
		Marksheet1 M3 = new Marksheet1();
		M3.setRollNumber("4");
		M3.setFirstName("Ramesh");
		M3.setLastName("Sharma");
		M3.setPhysics(89);
		M3.setChemistry(50);
		M3.setMathes(67);
		
		Marksheet1 M4 = new Marksheet1();
		M4.setRollNumber("3");
		M4.setFirstName("Ram");
		M4.setLastName("Jain");
		M4.setPhysics(57);
		M4.setChemistry(78);
		M4.setMathes(99);
	
		
		ArrayList List = new ArrayList ();
		List.add(M1);
		List.add(M2);
		List.add(M3);
		List.add(M4);
		
		Collections.sort(List);
		
		Iterator<Marksheet1> it = List.iterator();
		while (it.hasNext()) {
			Marksheet1 o = (Marksheet1) it.next();
			
			
			System.out.println(o.getRollNumber()+" "+o.getFirstName()+" "+o.getLastName()+" "+o.getPhysics()+" "+o.getChemistry()+" "+o.getMathes());
			
		}
	}

}
