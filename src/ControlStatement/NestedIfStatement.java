package ControlStatement;

public class NestedIfStatement {
	
	public static void main(String[] args) {
		int english=70, hindi=20;
		
		double avg=((english+english)/2d);
		System.out.println("Avg="+avg);
		
		if (avg>70) {//
			System.out.println("1st class");//>>>>1.
			if (english>hindi) {
				System.out.println("I got marks better than hindi for english Subject");//2.
			} else {
				System.out.println("I got marks less than english for Hindi Subject");
			}
		} else {
			System.out.println("avg is less than 70");		
		}
	}

}
