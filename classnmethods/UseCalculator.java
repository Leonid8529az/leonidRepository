package classnmethods;

public class UseCalculator {

	public static void main(String[] args) {
		Calculator hello = new Calculator();
		System.out.println(hello.add2());
		hello.mul();
		hello.sub();
		System.out.println(hello.c);
		hello.add3(50, 30);
	}

}
