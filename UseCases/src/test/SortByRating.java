package test;

import java.util.Comparator;

import beans.Movie;

public class SortByRating implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getRating()-o2.getRating());
	}






	

}
