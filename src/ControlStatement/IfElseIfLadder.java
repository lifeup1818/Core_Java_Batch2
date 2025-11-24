package ControlStatement;

public class IfElseIfLadder {
	
	public static void main(String[] args) {
		//if-else-if ladder
		int a=951, b=20;
		//70.5   >> 1st class
		//50 to 70.5 2nd class
		double avg=((a+b)/2d);
		System.out.println("Avg="+avg);
				
		if (avg>70.7) {//false
			System.out.println("1st class");//
		} if (avg<70.5 && avg>=50) {//true
			System.out.println("2nd class");//
		} else {
			System.out.println("avg is below 50");//
		}
	}
	
	

}
