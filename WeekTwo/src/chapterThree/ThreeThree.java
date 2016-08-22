package chapterThree;

import java.util.Scanner;

public class ThreeThree {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a, b, c, d, e, f, for equation: ");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		
		int ab_bc = a * d - b * c;
		if (ab_bc == 0.0){
			
			System.out.print("The equation has no solution.");
		}else{
			
			int x = (e * d - b * f) / ab_bc;
			int y = (a * f - e * c) / ab_bc;
			System.out.println("x is " + x + " and y is " + y);
	
		}
	}
}
