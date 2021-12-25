package objectconstructor;

public class TestHouse {

	public static void main(String[] args) {

		House myHouse = new House(100, 200);
		myHouse.bathroom();
		myHouse.bedroom();
		myHouse.kitchen("sharp");
		myHouse.livingroom();
	}

}
