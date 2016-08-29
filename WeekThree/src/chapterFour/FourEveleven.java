package chapterFour;
import java.util.Scanner;


public class FourEveleven {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter a decimal value (0 to 15): ");
	    int number = input.nextInt();
	    
	    String hexidecimal = getHexValue(number);
	    
	    if (hexidecimal != null){
	    	System.out.println("The hex value is: " + hexidecimal);
	    }else {
	    	System.out.println("Im sorry your number is out of range");
	    }
	        
	        

	}
	
	public static String getHexValue(int number){
		
		if (number <0 || number > 15){
			return null;
		} if (number<=9){
			return Character.toString((char)(number+'0'));
		} else {
			return Character.toString((char)(number - 10 + 'A'));
		}
		
	}

}
