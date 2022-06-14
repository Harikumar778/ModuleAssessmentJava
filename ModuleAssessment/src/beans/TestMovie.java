package beans;

public class TestMovie {

	public static void main(String[] args) {
		
		Movie m=new Movie("Vikram",2000000,4.8f);
		
		System.out.println("Name of the Movie : "+m.getMovieName());
		System.out.println("Budget of the Movie : "+m.getBudget());
		System.out.println("Rating of the Movie : "+m.getRating());
	}

}
