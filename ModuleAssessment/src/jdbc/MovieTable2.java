package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import beans.Movie;

public class MovieTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			DriverManager.registerDriver(new org.h2.Driver());
			  Connection cnctn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa","");
			  
	          Statement smt=cnctn.createStatement();
	          
	          ResultSet rs=smt.executeQuery("select * from movie");
	          
	          ArrayList<Movie> al=new ArrayList<Movie>();
	          while(rs.next())
	          {
	        	  Movie m1=new Movie();
	        	  m1.InsertMovieData(rs.getString(1),rs.getFloat(2),rs.getFloat(3));
	        	  al.add(m1);
	        	  
	          }
	          
	          al.forEach(i->{
	        	  i.Displayinfo();
	          });
	          
	          
	          
	          cnctn.close();
			  
	        		} catch (SQLException e) {
	        			// TODO Auto-generated catch block
	        			e.printStackTrace();
	        		}
		
		

	}

}
