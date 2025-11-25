package ControlStatement;

public class ForEachLoop {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
				
		for(int a:arr) {
			if (a%2==0) {
				System.out.println(a+"= even");
			} 
		}
		
	}

}
