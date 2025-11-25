package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		int a = 10, b = 10, c = 20, d = 20;
		
		// 1. And  (&&)
		System.out.println("*********..And..********");
		System.out.println(a > b && c == d); // false
		System.out.println(a < b && c > d); // false

		System.out.println(a == b && c == d); // true
		System.out.println(a >= b && c > d); // false

		// 2. Or  (||)
		System.out.println("*********..OR..********");
	
		System.out.println(a > b || c == d);  //true
		//1 false    2  true
		System.out.println(a < b || c > d);   //false
		//1. false    2 false
		System.out.println(a == b || c == d); //true
		//1.true    2. true
		System.out.println(a >= b || c > d); // true
		//1. true   2. false
		
		//3 Not   (!)
		System.out.println("*********..Not..********");
		boolean flag = false;
		System.out.println(!flag);
	}

}
