package chapterThree;

import java.util.Scanner;

public class ThreeThirtyThree {
	public static void main(String[] arg){		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight and price for package 1: ");
		double weight = input.nextDouble();
		double price = input.nextDouble();
		
		System.out.print("Enter weight and price for package 2: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		double package1 = (weight * price);
		double package2 = (weight2 * price2);
		
		if (package1 > package2 ){
			System.out.println("Package 1 has a better price");
		} else{
			System.out.println("Package 2 has a better price");
		}


	}
}