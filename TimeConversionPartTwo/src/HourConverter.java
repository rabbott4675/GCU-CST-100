import java.util.Scanner;

public class HourConverter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float playerInput;

		System.out.println("Enter time in decimal ex(6.5) ");
		playerInput = input.nextFloat();

		int hours = (int) playerInput;
		int minutes = (int) (playerInput * 60) % 60;

		System.out.println("The amount of time is " + hours + " hours and " + minutes + " minutes.");

	}
}