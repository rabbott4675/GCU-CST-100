package chapterFour;
import java.util.Scanner;
public class FourTwo {

	private static final double averageRadius = 6371.01;

    public static void main(String[] args) {

        // Getting (x1,y1) (x2,y2) from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double xCordinate1 = input.nextDouble();
        double yCordinate1 = input.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double xCordinate2 = input.nextDouble();
        double yCordinate2 = input.nextDouble();
        input.close();


        double radius = averageRadius;

        double distance = radius *
                Math.acos( Math.sin(Math.toRadians(xCordinate1)) * Math.sin(Math.toRadians(xCordinate2)) +
                           Math.cos(Math.toRadians(xCordinate1)) * Math.cos(Math.toRadians(xCordinate2)) *
                           Math.cos(Math.toRadians(yCordinate1 - yCordinate2)));


        System.out.println("The distance between the two points is" + distance + "km.");		
	}

}
