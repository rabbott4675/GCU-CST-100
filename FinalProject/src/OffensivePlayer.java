public class OffensivePlayer extends NFLPlayer  {

    private int numOfBlocks;
    private int yards;

    public OffensivePlayer(String firstName, String lastName, String team, int age, int weight, int heightFeet, int heightInch, int numOfBlocks, int yards) {
        super(firstName, lastName, team, age, weight, heightFeet, heightInch);
        this.numOfBlocks = numOfBlocks;
        this.yards = yards;
       
        //print our individual player stats
		System.out.printf(""
				+ "Name: %s %s     "
				+ "Team: %s      "
				+ "Age: %d      "
				+ "Weight: %d      "
				+ "Height: %d ft. %d in.     " 
				+ "NumOfBlocks : %d   " 
				+ "Yards : %d \n",
				firstName, lastName, team, age, weight, heightFeet, heightInch, numOfBlocks, yards);
    }
    
    //getters and setters
    public int getNumOfBlocks() {
        return this.numOfBlocks;
    }

    public void setNumOfBlocks(int numOfBlocks) {
      this.numOfBlocks = numOfBlocks;
    } 
    
	public int getYards() {
		return this.yards;
	}

	public void setYards(int yards) {
		this.yards = yards;
	}
        
}