package variables;

public class Variables {

	// Static variable
	static boolean flag = true;

	// Instance Variable
	String myName = "Bhagwan";

	public void m1() {
		// local variable
		int a = 10;
		// 1. direct
		System.out.println(flag);

		// 2. class name
		System.out.println(Variables.flag);

		// 3. Object
		Variables obj = new Variables();
		System.out.println(obj.flag);
	}

	public static void display() {
		Variables obj = new Variables();
		System.out.println("name=" + obj.myName);

		System.out.println(obj.flag);

		// 1. direct
		System.out.println(flag);

		// 2. class name
		System.out.println(Variables.flag);
	}

}
