
public class OffensivePlayer  {

	public static void CreatePlayers(){
	
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
	NFLPlayer[] playerArray = new NFLPlayer[] {
								   player7, player8, player9, player10, player11, player12}; 
	}
}