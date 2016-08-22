package chapterThree;

import java.util.Scanner;

public class ThreeEighteen {
	
	public static void main(String[] arg){		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter shipping weight in pounds: ");
		double weight = input.nextInt();
		
		double cost = 0;
		
		if (weight > 50){
			System.out.println("The package cannot be shipped.");
			System.exit(0);
		} else if(weight <=1){
			cost = 3.5;
		} else if (weight <= 3){
			cost = 5.5;
		} else if (weight <= 10){
			cost = 8.5;
		} else {
			cost = 10.5;
		}
		
		System.out.printf("The cost is: $%.2f", cost);
		
	}
	
}
