package ControlStatement;

public class SwitchStatement {

	public static void main(String[] args) {
		String executionOn = "Chrome";

		System.out.println("loop started");
		// int, string, char, byte, short
		switch (executionOn) {
		case "Chrome":
			System.out.println("Execution started on Chrome");//
			break;
		case "Edge":
			System.out.println("Execution started on Edge");//
			break;
		case "Ie":
			System.out.println("Execution started on Ie");
			break;
		default:
			System.out.println("kindly select value is Chrome, Edge and Ie ");
		}

		System.out.println("loop done");
		System.out.println("**************************************************");
		
		int day=1;
		
		switch (day) {
		case 1:
	        System.out.println("Monday");
	        int age=10;
	        if (age>20) {
				System.out.println("User is able to work ");
			} else {
				System.out.println("User is not able to work due to user age is below 20");
			}
	        break;
	    case 2:
	        System.out.println("Tuesday");
	        break;
	    case 3:
	        System.out.println("Wednesday");
	        break;
	    default:
	        System.out.println("Another day");
		}

	}

}
