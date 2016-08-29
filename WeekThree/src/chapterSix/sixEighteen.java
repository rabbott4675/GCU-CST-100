package chapterSix;
import java.util.Scanner;
public class sixEighteen {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password \n"
				+ "(Password must have atleast eight characters.)\n"
				+ "(Password must consist of only letters and digits\n"
				+ "(Password must contain at least two digits): ");
		String password = input.nextLine();
		
		boolean lettersAndNumber = password.matches("\\w+");
		boolean eightCharacters = (password.length() >= 8);
		
		if (!lettersAndNumber && !eightCharacters){
			System.out.println("Your password is approved.");
			
		} else {
			System.out.println("Enter correct password type!");
		}

	}

}
