
public class PlayerManager {

	///Create main method
	public static void main(String[] args){
		CreatePlayers();
	}
	
	///Create Players Method
	public static void CreatePlayers(){
		///Declaring Array
		NFLPlayer [] playerArray;
		///Allocating memory for 12 players
		playerArray = new NFLPlayer[12];

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
		playerArray[0] = player1;
		playerArray[1] = player2;
		playerArray[2] = player3;
		playerArray[3] = player4;
		playerArray[4] = player5;
		playerArray[5] = player6;
		playerArray[6] = player7;
		playerArray[7] = player8;
		playerArray[8] = player9;
		playerArray[9] = player10;
		playerArray[10] = player11;
		playerArray[11] = player12;

		}
		
	}

