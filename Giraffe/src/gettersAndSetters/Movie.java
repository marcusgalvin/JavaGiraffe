package gettersAndSetters;

public class Movie {

	//private strings because the rating setting will be able to be accessed by this movie class
	
	private String name;
	private String director;
	//this rating attribute can only be accessed by this movie class
	private String rating;
	
	public Movie(String name, String director, String rating)
	{
		this.name = name;
		this.director = director;
		this.rating = rating;
	}
	
	
	//setters - method an outside program will use to modify rating
	
	public void setRating(String rating)
	{
		if(rating.equals("G") || rating.equals("PG") || rating.equals("PG-13") || rating.equals("R") || rating.equals("NR"))
		{
			this.rating = rating;
		}
		this.rating = "NR";				
	}
	
	//get rating
	//if you want to access rating in main classm just reference this method
	public String getRating()
	{
		return rating;
	}
	
	
	//make setters for all variables
	public void setName(String name)
	{
		this.name = name;
		
	}
	
	public void getName(String name)
	{
		this.name = name;
	}
	
	
	
	
	public void setDirector(String director)
	{
		this.director = director;
	}
	
	public void getDirector(String director) 
	{
		this.director = director;
	}
	
	
	
	
	//getters
	
	
	
	
}
