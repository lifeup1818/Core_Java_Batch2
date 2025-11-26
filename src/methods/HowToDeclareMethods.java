package methods;

public class HowToDeclareMethods {

	// 1. Method without parameters
	public void test() {
		System.out.println("in test method without parameter");
	}

	// 2. Method with parameters
	public void display(String mesage) {
		System.out.println("In display method with parameter:" + mesage);
	}

	// 3. Method with return type
	public int additionOfTwoNumbers() {
		int c = 10 + 20;
		return c;
	}

	// 4. Method with parameter and retutn value from this method
	public int additionOfTwoNumbers(int a, int b) {
		return a + b;
	}

	public String m1(int a) {
		String name = "Bhagwan";
		return name;
	}

	// 4. Static Method
	static void m2() {
		System.out.println("in Static Method");
	}
	
	// 5. Static Method with parameter
	public static void m3(int age) {
		System.out.println("age="+age);
	} 
	
	
	// 6. Static Method with return type
	static char m4() {
		return 'c';
	}
	
	// 5. Static Method with parameter and retutn value from this method
	public static boolean m5(boolean flag, int age) {
		return flag;
	}
	
}
