package games;

import java.util.Scanner;

public class App {

	public static void main(String[] args)
	{
	
		//ask questions
		String q1 = "What color are apples?\n"
				+ "(a)red/green\n(b)Orange\n(c)Purple\n";
		
		String q2 = "What color are bananas?\n"
				+ "(a)red/green\n(b)Yellow\n(c)Blue\n";
		//init array
		Question [] questions = {
				new Question(q1, "a"),
				new Question(q2, "b")
		};
		//call method
		takeTest(questions);
		
	}
		public static void takeTest(Question [] questions)
		{
			Scanner keyboardInput = new Scanner(System.in);
			
			int score = 0;
			for (int i = 0; i < questions.length; i++)
			{
				System.out.println(questions[i].prompt);
				String answer = keyboardInput.nextLine();
				
				if(answer.equals(questions[i].answer))
				{
					//add one to score
					score++;
				}
			}
			System.out.println("You got " + score + " out of " + questions.length);
		}		
		
}