package oops.encapsulation;

public class MovieTest {

	public static void main(String[] args) {
		
		Movie titanic = new Movie();
		titanic.setDuration(2);
		System.out.println(titanic.getDuration());
		
		titanic.setRating("po");
		System.out.println(titanic.getRating());
		

	}

}
