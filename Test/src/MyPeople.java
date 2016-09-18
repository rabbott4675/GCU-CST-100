import java.util.Random;

public class MyPeople {
	
		String [] celebratingMessages = {" is jumpung for joy!",
				" running a marrathon out of excitment!",
				" is excesivly celebrating!",
				" is very thankful!"};

		public String message(){
			Random random = new Random();
			int select = random.nextInt(celebratingMessages.length);
			return celebratingMessages[select];
		}

		public void main (String [] args) {
			System.out.println(message());
		}
}
