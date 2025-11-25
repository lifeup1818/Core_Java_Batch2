package operators;

public class ComparisonOperator {

	public static void main(String[] args) {

		int a = 10, c = 21;
		int b = 20, d = 20;

		System.out.println("With == operator.......");
		// 1. ==
		System.out.println(a == b); // false

		System.out.println("With > operator......");
		// 2. >
		System.out.println(c > b); // true

		System.out.println("With < operator......");
		// 3. <
		System.out.println(a < b); // true

		System.out.println("With >= operator......");
		// 4. >=
		System.out.println(d >= b); // true

		System.out.println("With <= operator......");
		// 5.<=
		System.out.println(c <= d); // false >>>21<=20

		System.out.println("With != operator......");
		// 6. !=
		System.out.println(d != b); // false
	}

}
