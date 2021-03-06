package ChapterFive;

import java.util.Scanner;

public class fiveTwentyOne {
	
	public static void main(String[] args){
	
    double annualInterestRate = 2.35;

    // making scanner buffer
    Scanner input = new Scanner(System.in);

    // getting loan amount
    System.out.printf("Loan amount: ");
    double loanAmount = input.nextDouble();

    // asking number of years
    System.out.print("Number of Years: ");
    int numberOfYears = input.nextInt();

    // formating title display

    System.out.printf("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment","Total Payment");
    // making loop to display different interest rates
    for ( ; annualInterestRate <= 8.00; annualInterestRate += 0.125) {

        // calculating monthly and total payment rates
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        double totalPayment = monthlyPayment * numberOfYears * 12;

        // making % string for formatting reasons...
        String str = "%";

        // Displaying formatted info
        System.out.printf("%-1.3f%s%17.2f%24.2f \n",annualInterestRate , str, ((int)(monthlyPayment * 100) / 100.0), ((int)(totalPayment * 100) / 100.0));

    	}

	}
}
