
public class ifStatements {
	public static void main (String [] args)
	{
		boolean isMale = false;
		boolean isTall = true;
		
		if(isMale && isTall)
		{
			System.out.println("you are a tall male");
		} else if(isMale && !isTall) {
			System.out.println("you are a short male");
			
		} else if(!isMale && isTall) {
			System.out.println("you are not a male but tall");
		} else {
			System.out.println("you are not male and not tall");
		}
		
		
		
		
		
	}

}
