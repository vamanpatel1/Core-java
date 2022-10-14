package in.com.Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet extends Marksheet{
	public static void main(String[] args) {
		
		Marksheet M1 = new Marksheet();
		M1.setRollNumber("2");
		M1.setName("Ram");
		M1.setPhysics(77);
		M1.setChemistry(87);
		M1.setMathes(91);
		
		Marksheet M2 = new Marksheet();
		M2.setRollNumber("1");
		M2.setName("Ramesh");
		M2.setPhysics(58);
		M2.setChemistry(33);
		M2.setMathes(40);
		
		Marksheet M3 = new Marksheet();
		M3.setRollNumber("4");
		M3.setName("Radha");
		M3.setPhysics(89);
		M3.setChemistry(50);
		M3.setMathes(67);
		
		Marksheet M4 = new Marksheet();
		M4.setRollNumber("5");
		M4.setName("Nannu");
		M4.setPhysics(57);
		M4.setChemistry(78);
		M4.setMathes(99);
		
		Marksheet M5 = new Marksheet();
		M5.setRollNumber("3");
		M5.setName("Shivani");
		M5.setPhysics(46);
		M5.setChemistry(38);
		M5.setMathes(69);
		
		ArrayList List = new ArrayList ();
		List.add(M1);
		List.add(M2);
		List.add(M3);
		List.add(M4);
		List.add(M5);
		
		Collections.sort(List,new SortByName());
		
		Iterator<Marksheet> it = List.iterator();
		while (it.hasNext()) {
			Marksheet o = (Marksheet) it.next();
			
			//System.out.println("RollNumber "+"Name "+"Physics "+"Chemistry "+"Mathes ");
			System.out.println(o.getRollNumber()+" "+o.getName()+" "+o.getPhysics()+" "+o.getChemistry()+" "+o.getMathes());
			
		}
		
		
	}

	
		
	}


