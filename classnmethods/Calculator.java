package classnmethods;

public class Calculator {
	int a,b,c = 5,d = 8;
	public void addition() {
	int total = c+d;
	System.out.println(total);
	}
	public void mul() {
		int total = c*d;
		System.out.println(total);
	}
	public void sub() {
		int total = c-d;
		System.out.println(total);
	}
	public int add2() {
		int total = c+d;
		return total;
	}
	public void add3(int x, int z) {
		int total = x+z;
		System.out.println(total);
	}
}
