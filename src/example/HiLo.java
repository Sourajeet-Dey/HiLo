package example;

public class HiLo {

	public static void main(String[] args) {
		// Create a random number for the user to guess
		for(int i=0; i<20; i++) {
			int theNumber = (int) (Math.random()*100+1);
			System.out.println(theNumber);
		}
	}

}
