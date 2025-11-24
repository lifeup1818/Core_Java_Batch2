package ControlStatement;

public class IfStatement {	
	
	public static void main(String[] args) {
		//1. if
		System.out.println("If Statement start......");
		if(false) {
			//logic
			System.out.println("In If Statement");
		}
		System.out.println("If Statement Done......");
		
		//2. if-else
		int a=200, b=200;
		if (a>b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("a is not greater than b");
		}
		
		if (10==5 || 20<40) {   //1=false 2=true  >>> true
			System.out.println("Condition working");   //
		} else {
			System.out.println("Condition not working");
		}
		
		char ch='c';
		
		if (ch=='c') {
			System.out.println("launch chrome");			
		} else {
			System.out.println("launch Edge");			
		}
	}

}
