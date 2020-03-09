package gettersAndSetters;

public class Movie {

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
	
	
	//setters
	
	public void setRating(String rating)
	{
		if(rating.equals("G") || rating.equals("G") || rating.equals("PG") || rating.equals("PG-13") || rating.equals("R") || rating.equals("NR"))
		{
			this.rating = rating;
		}
		this.rating = "NR";				
	}
	
	//get rating
	public String getRating()
	{
		return rating;
	}
	
	
	public void setTitle(String name)
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
