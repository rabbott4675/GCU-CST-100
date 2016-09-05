
public class PlayerManager {

	///Create main method
	public static void main(String[] args){
		CreatePlayers();
	}
	
	//Define the player stats fields
	private String firstName;
	private String lastName;
	private String team;
	private int age;
	private int weight;
	private int heightFeet;
	private int heightInch;	
	
	///Create Players Method
	public static void CreatePlayers(){
		///Declaring Array
		NFLPlayer [] playerArray;
		
		///Allocating memory for 12 players
		

		//Name,lastname,team, age, weight, height feet, height inch
		NFLPlayer player1 = new NFLPlayer(
				"Jimmy",
				"Garoppolo",
				"New England Patriots", 
				23, 225, 6, 2);
		
		NFLPlayer player2 = new NFLPlayer(
				"Jacoby",
				"Brissett",
				"New England Patriots", 
				23,	235, 6, 4);
		
		NFLPlayer player3 = new NFLPlayer(
				"Tyler",
				"Gaffney",
				"New England Patriots", 
				23, 220, 6, 0);
		
		NFLPlayer player4 = new NFLPlayer(
				"Brandon",
				"Bolden",
				"New England Patriots", 
				26, 220, 5, 11);
		
		NFLPlayer player5 = new NFLPlayer(
				"James",
				"White",
				"New England Patriots", 
				24, 205, 5, 10);
		
		NFLPlayer player6 = new NFLPlayer(
				"A.J.",
				"Derby",
				"New England Patriots", 
				24, 255, 6, 5);
		
		NFLPlayer player7 = new NFLPlayer(
				"James",
				"White",
				"New England Patriots", 
				24, 205, 5, 10);
		
		NFLPlayer player8 = new NFLPlayer(
				"Martellus",
				"Bennett",
				"New England Patriots", 
				29, 275, 6, 6);
		
		NFLPlayer player9 = new NFLPlayer(
				"Malcolm",
				"Mitchell",
				"New England Patriots", 
				23, 200, 6, 1);
		
		NFLPlayer player10 = new NFLPlayer(
				"Chris",
				"Hogan",
				"New England Patriots", 
				27, 210, 6, 1);
		
		NFLPlayer player11 = new NFLPlayer(
				"Aaron",
				"Dobson",
				"New England Patriots", 
				25, 205, 6, 2);
		
		NFLPlayer player12 = new NFLPlayer(
				"Steven",
				"Scheu",
				"New England Patriots", 
				24, 255, 6, 5);
		
		//Inizalizing Players
		playerArray = new NFLPlayer[] {player1, player2, player3, player4, player5, player6, 
									   player7, player8, player9, player10, player11, player12}; 
		
		}
	
	//Getter and Setter
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeightFeet() {
		return heightFeet;
	}

	public void setHeightFeet(int heightFeet) {
		this.heightFeet = heightFeet;
	}

	public int getHeightInch() {
		return heightInch;
	}

	public void setHeightInch(int heightInch) {
		this.heightInch = heightInch;
	}
	
		
	}

