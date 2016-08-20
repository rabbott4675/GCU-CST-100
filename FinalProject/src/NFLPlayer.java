
public class NFLPlayer {
	//Define the player stats fields
	private String firstName;
	private String lastName;
	private String team;
	private int age;
	private int weight;
	private int heightFeet;
	private int heightInch;
	private double TDS;
	private double INT;
	private double YDS;
	private double RTG;	
	//argument for player class
	//Prints players stats
	
	public NFLPlayer(String string, String string2, String string3, int i, int j, int k, int e) {
		firstName = string;
		lastName = string2;
		team = string3;
		age = i; 
		heightFeet = j; 
		heightInch = k;
		weight = e;
		
		//print our individual player stats
		System.out.printf(""
				+ "Name: %s %s  "
				+ "Team: %s  "
				+ "Age: %d  "
				+ "Weight: %d  "
				+ "Height: %d ft. %d in. \n", 
				firstName, lastName, team, age, weight, heightFeet, heightInch);
	}

}
