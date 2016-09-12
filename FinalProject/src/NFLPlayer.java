public abstract class NFLPlayer {
	
	//Define the player stats fields
	private String firstName;
	private String lastName;
	private String team;
	private int age;
	private int weight;
	private int heightFeet;
	private int heightInch;
	
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
	
	//Method for player class, prints players stats
	public NFLPlayer(String firstName, String lastName, String team, int age, int weight, int heightFeet, int heightInch) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.team = team;
		this.age = age; 
		this.weight = weight;
		this.heightFeet = heightFeet; 
		this.heightInch = heightInch;
		
		
			}

}