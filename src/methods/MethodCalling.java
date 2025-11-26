package methods;

public class MethodCalling {
	
	
	public void m1() {
		System.out.println("in method m1");
	}
	
	public void m2() {
		System.out.println("in method m2");
		m1();
		System.out.println("m2 done");
	}
	
	public void m3() {
		System.out.println("in method m3");
		m2();
	}
	
	public static void main(String[] args) {
		MethodCalling obj= new MethodCalling();
		obj.m3();
		//17 11 7 13
	}
	
	
	

}
