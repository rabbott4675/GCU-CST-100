
public abstract class NFLPLayer {
	
	PlayerManager PM = new PlayerManager();
		
		public String firstName =  PM.getFirstName();
		public String lastName = PM.getLastName();
		public String team = PM.getLastName();
		public int age = PM.getAge();
		public int weight = PM.getWeight();
		public int heightFeet = PM.getHeightFeet();
		public int heightInch = PM.getHeightInch();
		
	
	//Method for player class, prints players stats
	public void NFLPlayer(String string, String string2, String string3, int i, int j, int k, int e) {
		firstName = string;
		lastName = string2;
		team = string3;
		age = i; 
		weight = j;
		heightFeet = k; 
		heightInch = e;
		
		
		//print our individual player stats
		System.out.printf(""
				+ "Name: %s %s     "
				+ "Team: %s      "
				+ "Age: %d      "
				+ "Weight: %d      "
				+ "Height: %d ft. %d in.     \n", 
				firstName, lastName, team, age, weight, heightFeet, heightInch);
		}
	

}
