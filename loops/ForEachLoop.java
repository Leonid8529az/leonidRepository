package loops;

public class ForEachLoop {
	public static void main(String args[]) {
		int[] list = {2,4,6,1,0};
//		for (int i = 0; i<list.length; i++) {
//			System.out.println(list[i]);
//		}
		for (int a : list) {
			System.out.println(a);
		}
	}

}
