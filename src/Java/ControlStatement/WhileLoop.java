package ControlStatement;

public class WhileLoop {
	
	public static void main(String[] args) {
		int a=5;   //5 4 3 2 1
		int i=0;
		
		//5<10  true     &&  5>0  true
		while(a<10) {
			System.out.println("a="+a);
			a--;
			if (a==0) {
				break;
			}
		} 
		
		System.out.println("loop end");
		
		///////// odd number   1 to  100
		///
		boolean flag=true;
		while(flag) {		
			if (i%2!=0) {
				System.out.println(i+"=even number");
			}			
			i++;
			
			if (i==100) {
				//break;
				flag=false;
			}
		} 

		System.out.println("loop 2nd end");
		
		
	}

}
