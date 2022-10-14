package in.com.Collection_Framework;

public class Marksheet1 implements Comparable<Marksheet1>{
	
	private String RollNumber;
	private String FirstName;
	private String LastName;
	private int Physics;
	private int Chemistry;
	private int Mathes;

	public void setRollNumber(String RollNumber) {
		this.RollNumber = RollNumber;
	}
	public String getRollNumber() {
		return RollNumber;
	}

	public void setFirstName(String FirstName){
		this.FirstName = FirstName;
	}
	public String getFirstName() {
		return FirstName;
	}
	
	public void setLastName(String LastName){
		this.LastName = LastName;
	}
	public String getLastName() {
		return LastName;
	}
	
	public void setPhysics(int Physics) {
		this.Physics = Physics;
	}
	public int getPhysics() {
		return Physics;
	}

	public void setChemistry(int Chemistry) {
		this.Chemistry = Chemistry;
	}
	public int getChemistry() {
		return Chemistry;
	}
	
	public void setMathes(int Mathes) {
		this.Mathes = Mathes;
	}
	public int getMathes() {
		return Mathes;
	}
	
	public int compareTo(Marksheet1 M) {
		
		//return this.FirstName.compareTo(M.FirstName);
		//return this.LastName.compareTo(M.LastName);
		if(this.FirstName == M.FirstName) {
			return this.LastName.compareTo(M.LastName);
		}else {
			return this.FirstName.compareTo(M.FirstName);
		}
		
	}
	
	
}
