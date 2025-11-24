package assignment;

import java.util.Iterator;

public class StarPattern {

	public static void main(String[] args) {
		int number = 5;
		for (int i = number; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("#####################");
		System.out.println("#####################");
		System.out.println();

		for (int i = 1; i <= number; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("#####################");
		System.out.println("#####################");
		System.out.println();

		for (int i = number; i > 0; i--) {
			int space=number-i;
			
			// for adding space
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("#####################");
		System.out.println("#####################");
		System.out.println();
		
		for (int i = 0; i < number; i++) {

			// for adding space
			for (int j = 0; j < (number - i); j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
