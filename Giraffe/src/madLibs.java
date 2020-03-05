import java.util.Scanner;

public class madLibs {

	public static void main(String[] args)
	{
		//get user input
		Scanner keyboardInput = new Scanner(System.in);
		
		
		System.out.print("Enter a color: ");
		String color = keyboardInput.nextLine();
		
		System.out.print("Enter a pluralNoun: ");
		String pluralNoun = keyboardInput.nextLine();
		
		System.out.print("Enter a celeberties name: ");
		String celeberity = keyboardInput.nextLine();
		
		
		System.out.println("Rosed are " + color + "\n" +
							pluralNoun + " are blue, \n I love " 
							+ celeberity + "!");
		
	}
	
}
