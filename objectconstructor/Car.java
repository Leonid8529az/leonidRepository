package objectconstructor;

public class Car {
	int doors;
	int seats;
	
	public Car(int myDoors, int mySeats) {
		this.doors = myDoors;
		this.seats = mySeats;
		System.out.println("number of doors is: " + doors);
		System.out.println("number of seats is: " + seats);
	}
	public Car() {
		
	}
	public void color(String color) {
		System.out.println("Color is " + color); //soft coded value
		
	}
	public void color2() {
		System.out.println("Color is blue"); //hard coded value
	}
	public String make(String make) {
		return make;
	}

}
