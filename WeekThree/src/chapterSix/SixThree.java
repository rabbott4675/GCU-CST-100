package chapterSix;
import java.util.Scanner;
public class SixThree {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter and interger: ");
		int number = input.nextInt();
		
		if (isPal(number)){
			System.out.println(number + " is a palindrome.");
		} else {
			System.out.println(number + " is NOT a palindrome.");
		}
		
	}
	
	public static int rev(int num){
		
		int rev = 0;
		while (num != 0){
			rev *= 10;
			rev += num % 10;
			num /= 10;
		}
		return rev;
	}
	public static boolean isPal(int num){
		return (num == rev(num));
	}
}


