package homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AwesomeClass {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int[] column = {20, 10,20, 20, 9, 90, 30, 10, 10, 20, 10};
		int trainOne, trainTwo;
		boolean tens = false, twenties = false;
		for (int i = 0; i < column.length-1; i++) {
			trainOne = column[i];
			trainTwo = column[i+1];
			if (trainOne == 10 && trainTwo == 10) {
				tens = true;
			}
			if (trainOne == 20 && trainTwo == 20) {
				twenties = true;
			}
		}
			if (tens == false && twenties == true) {
				System.out.println("Twenties " + true);
			} else if (tens == true && twenties == false) {
			System.out.println("Tens " + true);

		} else {
			System.out.println(false);
		}
		
	}

}
		


