
public class Returns {

	public static void main (String [] args)
	{
		
		int myNum = cube(3);
		System.out.println(myNum);
		
		System.out.println(cube(2));
		
		
		
	}
	
	public static int cube(int numberToCube)
	{
		//return breaks out of the method, anything below it will not be reached or executed
		return (numberToCube * numberToCube * numberToCube);
	}
	
}
