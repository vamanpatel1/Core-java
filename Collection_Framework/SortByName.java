package in.com.Collection_Framework;

import java.util.Comparator;

public class SortByName implements Comparator<Marksheet> {

	
	public int compare(Marksheet M1, Marksheet M2) {
		
		return M1.getName().compareTo(M2.getName());
	}
	

}
