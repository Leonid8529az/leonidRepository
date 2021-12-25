package oops.abstraction;

public class Toyota extends ModernCar implements Car, Motor {

	public void start() {
		System.out.println("lets drive");	
	}
	public void stop() {
		System.out.println("stop engine");
		}
	
	public void shape() {
		System.out.println("square");
	}
	public void hydraulic() {
		System.out.println("this car is hydrolic");
		
	}
	public void engine() {
		System.out.println("v8 engine");
		
	}
	public void fuelType() {
		System.out.println("Diesel");
	}

}


