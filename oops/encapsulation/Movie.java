package oops.encapsulation;

public class Movie {
	
	private int duration;
	private String rating;
	
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		if (rating == "G" || rating == "PG" || rating == "PG-13" || rating == "R") {
			this.rating = rating;
		}else {
			this.rating = "NR";
			}
	}
	public void setDuration(int myDuration) {
		this.duration = myDuration;
	}
	public int getDuration() {
		return duration;
		
	
	}

}
