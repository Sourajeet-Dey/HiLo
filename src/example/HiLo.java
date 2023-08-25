package example;
import java.util.Scanner;

public class HiLo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		do {
			// Create a random number for the user to guess
			int theNumber = (int) (Math.random()*1000+1);
//			System.out.println(theNumber);
			int guess = 0;
			int guessCount = 0;
			while(guess != theNumber) {
				System.out.println("Guess a number between 1 and 1000:");
				guess = scan.nextInt();
				guessCount++;
				if(guess < theNumber) {
					if(theNumber - guess > 25)
						System.out.println(guess + " is too low. Try again.");
					else
						System.out.println(guess + " is slightly low. Try again.");
				}
				else if(guess > theNumber) {
					if(guess - theNumber > 25)
						System.out.println(guess + " is too high. Try again.");
					else
						System.out.println(guess + " is slightly high. Try again.");
				}
				else {
					System.out.println(guess + " is correct. You win!");
					if(guessCount <= 10)
						System.out.println("It took you only " + guessCount + " tries. Good job!");
					else
						System.out.println("It took you " + guessCount + " tries. Can you do better?");
				}
			}	// End of while loop for guessing	
			System.out.println("Would you like to play again (y/n)?");
			playAgain = scan.next();
		}while(playAgain.equalsIgnoreCase("y"));
		System.out.print("Thanks for playing, Goodbye!");
		scan.close();
	}
}
