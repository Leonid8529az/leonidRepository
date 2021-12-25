package objectconstructor;

public class House {
	int length;
	int width;
	public House(int myLength, int myWidth) {
		this.length = myLength;
		this.width = myWidth;
		
	}
	
	String tvBrand = "samsung";
	
	public void kitchen(String microwave) {
		System.out.println("Let's cook");
		System.out.println("My microwave is " + microwave);
		
	}
	public void livingroom() {
		System.out.println("watch tv");
		System.out.println("In my livingroom i have tv brand " + tvBrand);
	}
public void bedroom() {
	System.out.println("sleep zzzzzzzzzzzz");
	}
public void bathroom() {
	System.out.println("Have a shower");
}

}
