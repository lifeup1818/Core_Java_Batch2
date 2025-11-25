package variables;

public class InstanceVariable {

	// Instance Variable
	String name = "Bhagwan";
	int avg = 20;

	// instance method
	public void test() {
		System.out.println("*************In Instance method**********");
		System.out.println("Name:" + name);
		System.out.println("Avg:" + avg);
	}

	// main method (static method)
	public static void main(String[] args) {
		System.out.println("*************In Static method**********");
		InstanceVariable obj = new InstanceVariable();
		System.out.println("Name:" + obj.name);
		System.out.println("Avg:" + obj.avg);
				
		obj.test();
	}

	// Contructor
	public InstanceVariable() {
		System.out.println("*************Constructor**********");
		System.out.println("Name:" + name);
		System.out.println("Avg:" + avg);
	}

	// Instance Block
	{
		System.out.println("*************Block**********");
		System.out.println("Name:" + name);
		System.out.println("Avg:" + avg);
	}

}
