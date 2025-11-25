package methods;

import java.security.PublicKey;

public class ExampleOfMethods {
	
	//1. Method without parameters
	public void test() {
		System.out.println("in test method without parameter");	
	}
	
	//2. Method with parameters
	public void display(String mesage) {
		System.out.println("In display method with parameter:"+mesage);
	}
	
	//3. Method with return type
	public int additionOfTwoNumbers() {
		int c=10+20;
		return c;
	}
	
	//4. Method with parameter and retutn value from this method
	public int additionOfTwoNumbers(int a, int b) {
		return a+b;
	}
	
	public String m1(int a) {
		String name="Bhagwan";
		return name;
	}
	
	//4. Static Method
	void m2() {
		
	} 
	
	
	

}
