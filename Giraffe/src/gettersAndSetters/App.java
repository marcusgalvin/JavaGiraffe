package gettersAndSetters;

public class App {
	public static void main(String [] args)
	{
		Movie movie1 = new Movie("Step Brothers", "Joss Whedon", "PG-13");
		Movie movie2 = new Movie("The Avengers", "Bob Smith", "PG");

		//will set to NR
		movie1.setRating("dog");
		
		//wont work
		movie1.rating = "dog";
		
		
		
		//G, PG, PG-13, R, NR
		System.out.println(movie1.getRating());

	}
}