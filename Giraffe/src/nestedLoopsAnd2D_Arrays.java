
public class nestedLoopsAnd2D_Arrays {
	public static void main(String [] args)
	{
		//first [] is how many rows, second [] stands for amount of collums
		int [][] numberGrid = {
				{1, 2 ,3},
				{4, 5, 6},
				{7, 8, 9},
				{0}				
		};
//		System.out.println(numberGrid[0][0]);
		
		
		
		for(int i = 0; i < numberGrid.length; i++)
		{
			for(int j = 0;  j < numberGrid[i].length; j++)
			{
				System.out.print(numberGrid[i][j]);
			}
		}
	}
	
	
}
