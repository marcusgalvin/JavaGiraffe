
public class Math {
	public static void main (String [] args)
	{
		System.out.println(max(3, 4 ,5));
		
		
	}
	
	public static int max(int num1, int num2, int num3) {
		
		if(num1 >- num2 && num1 >= num3)
		{
			return num1;
		} else if(num2 >= num1 && num2 >= num3)
		{
			return num2;
		} else {
			return num3;
		}
		
		
	}

}
