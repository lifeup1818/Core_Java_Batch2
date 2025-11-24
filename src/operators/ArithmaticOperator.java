package operators;

public class ArithmaticOperator {
	int a=10;
	static int b=30;
	
	public static void main(String[] args) {
		ArithmaticOperator obj= new ArithmaticOperator();
		
		//1. Addition(+)
		int d=35;
		int c=obj.a+b;
		System.out.println("Sum:"+c);  // 50
		
		//2. Subtraction (-)
		System.out.println("Subtraction:"+(b-obj.a)); //20
		
		//3. Multiplication(*)
		System.out.println("Multiplication:"+(obj.a*b)); // 300
		
		//4. Division (/)
		System.out.println("Division:"+(b/obj.a));  //3
		
		//5. Remainder
		System.out.println("Remainder:"+(d%obj.a));   //5
			
	}

}
