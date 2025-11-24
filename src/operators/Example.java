package operators;

public class Example {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println(a>b);// false
		System.out.println(a+=10); //  a=20 
		System.out.println(a<=b);//true
		System.out.println(a/b);//   1    20/20>>> 1
		System.out.println(a%b);//0  		
		System.out.println(a++);   //20   >> a=21
		System.out.println("output="+a+b);//2120
	}

}
