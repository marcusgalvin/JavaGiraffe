package Inheritance;

public class App {
	public static void main (String [] args)
	{
		
		Chef normalChef = new Chef();
		normalChef.makeChicken();
		
		ItalianChef italianChef = new ItalianChef();
		italianChef.makePasta();
		
		ChineseChef chineseChef = new ChineseChef();
		chineseChef.makeSpecialDish();
		
		
		
		
	}
}