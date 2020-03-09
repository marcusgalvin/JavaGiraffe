import java.util.Scanner;

public class guessingGame {
	public static void main (String [] args)
	{
		Scanner keyboardInput = new Scanner(System.in);
		
		String secretWord = "giraffe";
		String guess = "";
		//keep track of guesses
		int guessCount = 0;
		//amt of times user can guess
		int guessLimit = 3;
		boolean outOfGuesses = false;
		
		while(!guess.equals(secretWord) && !outOfGuesses) 
		{
			if(guessCount < guessLimit)
			{
				System.out.print("Enter a guess: ");
				//store guess
				guess = keyboardInput.nextLine();
				guessCount++;
			} else {
				outOfGuesses = true;
			}
											
		}
		if(outOfGuesses) {
			System.out.println("out of guesses");
		} else 
		{
			System.out.println("You Win!");

		}
		
		
		
	}
	
}
