import java.util.ArrayList;

public class PlayerManager  {

	///Create main method
	public static void main(String[] args){
		CreatePlayers();
	}
	
	
	///Create Players Method
	public static void CreatePlayers(){
		
		//Declaring Offensive Player ArrayList
        ArrayList<OffensivePlayer> offensivePlayerList = new ArrayList<OffensivePlayer> ();
        offensivePlayerList.add(new OffensivePlayer(
        		"Jimmy",//Name
				"Garoppolo", //lastname
				"New England Patriots",//team
				//age, weight, height feet, height inch
				23, 225, 6, 2, 13, 27));
        offensivePlayerList.add(new OffensivePlayer(
        		"Chris",
				"Hogan",
				"New England Patriots", 
				27, 210, 6, 1, 13, 27));
        offensivePlayerList.add(new OffensivePlayer(
        		"Malcolm",
				"Mitchell",
				"New England Patriots", 
				23, 200, 6, 1, 34, 19));
        offensivePlayerList.add(new OffensivePlayer(
        		"Brandon",
				"Bolden",
				"New England Patriots", 
				26, 220, 5, 11, 13, 27));
        offensivePlayerList.add(new OffensivePlayer(
        		"Tyler",
				"Gaffney",
				"New England Patriots", 
				23, 220, 6, 0, 13, 27));
        offensivePlayerList.add(new OffensivePlayer(
        		"Jacoby",
				"Brissett",
				"New England Patriots", 
				23,	235, 6, 4, 13, 27));
        
        
      //Declaring Defensive Player ArrayList
        ArrayList<DefensivePlayer> defensivePlayerList = new ArrayList<DefensivePlayer> ();
		defensivePlayerList.add(new DefensivePlayer(
				"Steven",
				"Scheu",
				"New England Patriots", 
				24, 255, 6, 5, 13, 27));
		defensivePlayerList.add(new DefensivePlayer(
				"Aaron",
				"Dobson",
				"New England Patriots", 
				25, 205, 6, 2, 10, 6));
		defensivePlayerList.add(new DefensivePlayer(
				"James",
				"White",
				"New England Patriots", 
				24, 205, 5, 10, 10, 6));
		defensivePlayerList.add(new DefensivePlayer(
				"A.J.",
				"Derby",
				"New England Patriots", 
				24, 255, 6, 5, 10, 6));
		defensivePlayerList.add(new DefensivePlayer(
				"James",
				"White",
				"New England Patriots", 
				24, 205, 5, 10, 10, 6));
		defensivePlayerList.add(new DefensivePlayer(
				"Tyler",
				"Gaffney",
				"New England Patriots", 
				23, 220, 6, 0, 10, 6));
	
				//NFLPlayer player1 = new OffensivePlayer( int x ...);		
		
	}
	
}