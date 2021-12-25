package objectconstructor;

public class TestCar {

	public static void main(String[] args) {
		
		Car car1 = new Car(4, 5);
		System.out.println(car1.make("Toyota"));
		car1.color("black");
		car1.doors = 30;
		car1.color2();
		
		Car car2 = new Car();
		System.out.println(car2.make("Toyota"));
		car2.color("black");
		

	}

}
