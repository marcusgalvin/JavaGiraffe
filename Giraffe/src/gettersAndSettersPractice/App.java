public class App {
	public static void main(String [] args)
	{
		Movie movie1 = new Movie("Lord of the Rings, Two Towers", "John Doe", "PG-13");
		Movie movie2 = new Movie("The Avengers", "Bob Smith", "PG");
		Movie movie3 = new Movie("The Simpsons Movie", "Bob Smith", "PG");
		Movie movie4 = new Movie("Cars", "Bob Smith", "PG");

		
		

		//will set to NR
		movie1.setRating("dog");
		
		//wont work
		movie1.rating = "dog";
		
		// Possible ratings - G, PG, PG-13, R, NR
		//if someone wants to change any of the variables they must go through the get/ set methods
		
		System.out.println(movie1.getRating());

	}
}