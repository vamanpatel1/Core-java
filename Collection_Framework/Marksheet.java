package in.com.Collection_Framework;

public class Marksheet implements Comparable<Marksheet>{
		
		private String RollNumber;
		private String Name;
		private int Physics;
		private int Chemistry;
		private int Mathes;
		
		public void setRollNumber(String RollNumber) {
			this.RollNumber = RollNumber;
		}
		public String getRollNumber() {
			return RollNumber;
		}
	
		public void setName(String Name){
			this.Name = Name;
		}
		public String getName() {
			return Name;
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
		
		public int compareTo(Marksheet M) {
			return this.RollNumber.compareTo(M.RollNumber);
			/*return this.Name.compareTo(M.Name);
			return this.Physics-(M.Physics);
			return this.Chemistry-(M.Chemistry);
			return this.Mathes-(M.Mathes);*/
		}
}
