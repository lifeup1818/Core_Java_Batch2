package variables;

public class LocalVariables {
	
	public static void main(String[] args) {
		LocalVariables obj= new LocalVariables();
		obj.show();
		obj.display();		
	}

	//Instance Method
	public void show() {
		String name="Bhagwan";
		System.out.println("In Normal method");
		System.out.println("Name:"+name);
	}
	
	//Static Method
	public static void display() {
		int a=10;
		System.out.println("In Static Method");
		System.out.println("a="+a);
	}
	
	//Constructor
	public LocalVariables() {
		System.out.println("In Constructor............");
		boolean flag = true;
		System.out.println("Flag=" + flag);
	}

	//Block
	{
		String name = "Automation";
	}

}
