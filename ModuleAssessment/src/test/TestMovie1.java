package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import beans.Movie;


public class TestMovie1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie m1=new Movie();
		Movie m2=new Movie();
		Movie m3=new Movie();
		
		m1.InsertMovieData("Vikram",2000000,4.8f);
		m2.InsertMovieData("ABC",20000,4.3f);
		m3.InsertMovieData("BBC",1040000,4.0f);
		
		List <Movie> movieList=new ArrayList<Movie>();
		
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);
		
		

		Movie sortPro=new Movie();
		
		Collections.sort(movieList,sortPro);
		
		for(Movie p:movieList) {
			p.Displayinfo();
		}
	}

}
