package operators;

public class AssignmentOperators {
	static int b=50;
	
	public static void main(String[] args) {
		//1. =
		int a=20;
		System.out.println("a="+a);  //20
		
		//2. +=
		a+=b;
		System.out.println("a="+a); //70
		
		//3. -=
		a-=30;
		System.out.println("a="+a); //40
		
		//4. *=
		a*=5;
		System.out.println("a="+a); // 200
		
		//5. /*
		a/=5;
		System.out.println("a="+a); // 40
	}

}
