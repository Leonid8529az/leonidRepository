package oops.abstraction;

public class BMW implements Car, Motor{

	public void start() {
		System.out.println("lets drive");
		
	}
	public void stop() {
		System.out.println("stop engine");
		
	}
	public void shape () {
		System.out.println("square");
	}
	
	public void engine() {
		System.out.println("v10 engine");
		
	}
	@Override
	public void fuelType() {
		System.out.println("electric");
		
	}
	

}
