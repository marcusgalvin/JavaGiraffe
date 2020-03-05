import java.util.Scanner;

public class App {

	public static void main(String[] args)
	{
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("The first number is : ");
		double num1 = keyboardInput.nextDouble();
		System.out.print("The second number is : ");
		double num2 = keyboardInput.nextDouble();
		
		System.out.println(num1 + num2);
		
	}
	
}
