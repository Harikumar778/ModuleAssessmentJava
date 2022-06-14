package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import beans.Movie;

public class MovieTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

            DriverManager.registerDriver(new org.h2.Driver());
            Connection cnctn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa","");
            Movie m=new Movie();
            
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Movie Name :  ");
        m.setMovieName(scanner.next());
        System.out.println("Enter Movie Budget : ");
        m.setBudget(scanner.nextFloat());
        System.out.println("Enter  Movie Rating : ");
        m.setRating(scanner.nextFloat());



    PreparedStatement ps= cnctn.prepareStatement("insert into movie values(?,?,?)");
  
    ps.setString(1,m.getMovieName());  
    ps.setFloat(2,m.getBudget());
    ps.setFloat(3,m.getRating());




    ps.executeUpdate();
 
    //close connection
    cnctn.close();

} catch (SQLException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
 

    }
 



	
}
