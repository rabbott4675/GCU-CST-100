package chapterSix;
import java.util.Scanner;
public class sixFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer: ");
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		sortNumber(num1,num2,num3);

	}
	
	public static void sortNumber(double num1, double num2, double num3 ){
		
		double temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        System.out.println(num1  + " " + num2  + " " + num3);	
	}
	
}
