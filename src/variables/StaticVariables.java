package variables;

public class StaticVariables {
	static int age = 10;
	static String name = "Bhagwan";
	static float avg = 10.7f;

	// Normal Method
	public void test() {
		System.out.println("Instance method............");
		// 1. Direct
		System.out.println("age:" + age);

		// 2. Using Object
		StaticVariables obj = new StaticVariables();
		System.out.println("Name:" + obj.name);

		// 3. Using Class Name
		System.out.println("Avg:" + StaticVariables.avg);

	}

	// static method
	public static void display() {
		System.out.println("Static method............");
		// 1. Direct
		System.out.println("age:" + age);

		// 2. Using Object
		StaticVariables obj = new StaticVariables();
		System.out.println("Name:" + obj.name);

		// 3. Using Class Name
		System.out.println("Avg:" + StaticVariables.avg);
	}

	// Constructor
	public StaticVariables() {
		System.out.println("Constructor............");
		System.out.println("age:" + age);

		StaticVariables obj = new StaticVariables();
		System.out.println("Name:" + obj.name);

		// 3. Using Class Name
		System.out.println("Avg:" + StaticVariables.avg);
	}

	// block
	{
		// 1. Direct
		System.out.println("Block............");
		System.out.println("age:" + age);

		// 2. Using Object
		StaticVariables obj = new StaticVariables();
		System.out.println("Name:" + obj.name);

		// 3. Using Class Name
		System.out.println("Avg:" + StaticVariables.avg);
	}

}
