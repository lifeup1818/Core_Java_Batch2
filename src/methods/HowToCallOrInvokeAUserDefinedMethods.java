package methods;

public class HowToCallOrInvokeAUserDefinedMethods {

	// 1. Method without parameters
	public void test() { // Instance Method
		System.out.println(".....in test method");
		display("Hi...........");
	}

	// 2. Method with parameters
	public void display(String mesage) { // Instance Method
		System.out.println("In display method Message:" + mesage);
		int sum = additionOfTwoNumbers(additionOfTwoNumbers(), 230);// 30, 230
		System.out.println("sum=" + sum);
		HowToCallOrInvokeAUserDefinedMethods.m1(100);
	}

	// 3. Method with return type
	public int additionOfTwoNumbers() { // Instance Method
		HowToCallOrInvokeAUserDefinedMethods obj = new HowToCallOrInvokeAUserDefinedMethods();
		obj.m2();
		int c = 10 + 20;
		return c;
	}

	// 4. Method with parameter and retutn value from this method
	public int additionOfTwoNumbers(int a, int b) { // Instance Method
		sub();
		return a + b;		
	}

	// 5. static method without parameter
	public static void sub() {
		System.out.println("In Sub Method");
	}

	// 6. static method with parameter
	public static void m1(int age) {		
		System.out.println("In m1 method age=" + age);
	}
	
	//static method with return type
	public static boolean m2() {
		System.out.println("In m2 Method");
		return true;
	}

	public static void main(String[] args) {
		HowToCallOrInvokeAUserDefinedMethods obj = new HowToCallOrInvokeAUserDefinedMethods();
		obj.test();

		System.out.println(m2());

	}

}
