import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatchBlocks {
	public static void main(String [] args)
	{
		
		System.out.print("Enter a number: ");
		Scanner keyboardInput = new Scanner(System.in);

		int [] nums = {1,2,3};

		
		try {
			//index out of bounds
			System.out.println(nums[5]);

			//input mismatch exception
			double num = keyboardInput.nextDouble();
			System.out.println(num);


			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			//print exception to find what went wrong
			System.out.println(e);
//			System.out.println("invalid input, please enter a number");

		} catch(InputMismatchException e) {
			System.out.println("invalid input");
			//throwable will catch any error or exception
		} catch (Throwable e)
		{
			
		}
		
		
		
	}
}
