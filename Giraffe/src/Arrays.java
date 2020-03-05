
public class Arrays {
	public static void main( String [] args)
	{
		
		//create an array
		String [] friends = {"Kim", "Kevin", "Marty"};
		
		System.out.println(friends[0]);
		System.out.println(friends[1]);
		System.out.println(friends[2]);
		
		//find length
		System.out.println(friends.length);
		
		//modify index
		friends[0] = "Katie";
		System.out.println(friends[0]);
		
		//declare an array when you dont know what you want to populate it with first
		//declare how many elements the array will contain
		
		String [] teams = new String[3];
		
		teams[0] = "Red Sox";
		teams[1] = "Astos";
		teams[2] = "Yankees";
		
		System.out.println(teams[0]);
		
		
		
	}

}
