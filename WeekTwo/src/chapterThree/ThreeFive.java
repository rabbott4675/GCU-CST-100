package chapterThree;

import java.util.Scanner;

public class ThreeFive {
	 public static void main(String[] strings) {
	
	//Create Scanner
	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter today's Day: ");
	int dayNumber = input.nextInt();
	
	System.out.print("Enter the number of days elapsed since today: ");
	int dayAfter = input.nextInt();
	
	dayAfter = (dayAfter + dayNumber) % 7;
	String day = null;
	String dayPlus = null;
	
	switch (dayNumber){
		case 0: day = "Sunday"; break;	
		case 1: day = "Monday"; break;
		case 2: day = "Tuesday"; break;
		case 3: day = "Wednesday"; break;
		case 4: day = "Thursday"; break;
		case 5: day = "Friday"; break;
		case 6: day = "Saturday"; break;
	}
	
	switch (dayAfter){
		case 0: dayPlus = "Sunday"; break;	
		case 1: dayPlus = "Monday"; break;
		case 2: dayPlus = "Tuesday"; break;
		case 3: dayPlus = "Wednesday"; break;
		case 4: dayPlus = "Thursday"; break;
		case 5: dayPlus = "Friday"; break;
		case 6: dayPlus = "Saturday"; break;
	}
	
	System.out.println("Today is " + day + " and the future day is " + dayPlus + ".");
	
	 }
}
