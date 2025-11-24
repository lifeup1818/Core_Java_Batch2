package operators;

public class UnarrayOperator {

	public static void main(String[] args) {
		int a = 10, c = 100;
		int b = 20, d = 200;

		// 1. Pre-increment (++ Variable/value)
		System.out.println("****..Pre-increment..***");
		System.out.println("Before Pre-increment A=" + a);
		System.out.println("After Pre-increment A=" + (++a));
		System.out.println("Actual Value A=" + a);

		// 2. Post-increment (Variable/value ++)
		System.out.println("****..Post-increment..***");
		System.out.println("Before Post-increment B=" + b);
		System.out.println("After Post-increment B=" + (b++));
		System.out.println("Actual Value B=" + b);

		// 3. Pre-decrement (-- Variable/value)
		System.out.println("****..Pre-decrement..***");
		System.out.println("Before Pre-decrement C=" + c); // 100
		System.out.println("After Pre-decrement C=" + (--c)); // 99
		System.out.println("Actual Value C=" + c);// 99

		// 2. Post-decrement (Variable/value --)
		System.out.println("****..Post-decrement..***");
		System.out.println("Before Post-decrement d=" + d); //200
		System.out.println("After Post-decrement d=" + (d--)); //200
		System.out.println("Actual Value d=" + d); //199 
	}

}
