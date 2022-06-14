package beans;

import java.util.Comparator;

public class Movie implements Comparator <Movie> {
	 String movieName;
	 float budget;
	 float rating;
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public float getBudget() {
		return budget;
	}

	public void setBudget(float budget) {
		this.budget = budget;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}


	
	public Movie(String movieName, float budget, float rating) {
		// TODO Auto-generated constructor stub
		this.movieName=movieName;
		this.budget=budget;
		this.rating=rating;
		
	}
	
	public Movie() {
		
	}

	public void InsertMovieData(String movieName, float budget ,float rating) {
		// TODO Auto-generated method stub
		this.movieName=movieName;
		this.budget=budget;
		this.rating=rating;
		
	}
	
	

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return  (int) (o1.budget-o2.budget);
	}

	public void Displayinfo() {
		System.out.println("movieName  : "+movieName);
		System.out.println("budget : "+budget);
		System.out.println("rating : "+rating);
	}


	
}
