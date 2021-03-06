import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {
	
	public static void main(String[] args) throws Exception {
try{
		
		Scanner reader = new Scanner(System.in);
		
		String playerInput;
		
		System.out.println("Enter time in 24hr time: (ex: 23:23) ");
		playerInput = reader.nextLine();
		
		SimpleDateFormat _24Time = new SimpleDateFormat("HH:mm");
		SimpleDateFormat _12Time = new SimpleDateFormat("hh:mm a");
		
		Date d1 = _24Time.parse(playerInput);
	
		System.out.println("The time was converted from " 
		+ _24Time.format(d1) 
		+ " to " 
		+ _12Time.format(d1));
		
	} catch (Exception e){
		e.printStackTrace();
		}

	}
}

