package oops.inheritance;

public class Test {

	public static void main(String[] args) {
		Father jack = new Father();
		jack.athletic();
		jack.work();
		
		Son sean = new Son();
		sean.athletic();
		sean.work();
		sean.rich();
		
		GrandFather matt = new GrandFather();
		matt.communicate();
		matt.move();
		matt.rich();
		
		Bird sparrow = new Bird();
		sparrow.communicate();
		sparrow.move();
	}

}
