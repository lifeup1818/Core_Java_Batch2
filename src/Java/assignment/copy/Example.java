package src.assignment.copy;

import java.util.Iterator;

public class Example {

	public static void main(String[] args) {
		int i = 123, sum=0;
		int temp=i;
		
		while (i>0) {
			int r=i%10;
			sum=sum+(r*r*r);
			i=i/10;
		}
		
		if (temp==sum) {
			System.out.println("Arm");
		} else {
			System.out.println("not arm");
		}

	}
}
