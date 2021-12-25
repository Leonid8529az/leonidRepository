package datatype;

public class NonPrimitiveVariables {

	public static void main(String[] args) {
		//String
		String name = "John";
		//Array
		int[] list = {2,4,6,1,0};
		System.out.println(Integer.toString(list[1]));
		int[] list2 = new int[3];
		list2[0] = 5;
		list2[1] = 5;
		list2[2] = 5;
		System.out.println(list2[1]);
		for (int i = 0; i < list2.length; i++) {
			System.out.println(list2[i]);
		}
	}

}
