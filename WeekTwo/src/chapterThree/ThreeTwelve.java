package chapterThree;

import java.util.Scanner;
public class ThreeTwelve {
	public static void main(String[] strings) {
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		int reverse = 0;
		
		System.out.print("Enter a three-digit integer: ");
		int inputNumber = input.nextInt();
		int number = inputNumber;
		
		while (number != 0){
		reverse = reverse * 10;
		reverse = reverse + number%10;
		number = number/10;
		}
		
		if (reverse == inputNumber){
			System.out.print( inputNumber +" is a palindrome!");
		} else{
			System.out.print("Sorry it isn't a palindrome!");
		}
	}
}
