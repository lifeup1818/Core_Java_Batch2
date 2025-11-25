package datatypes;

import comments.TypeOfComments;

public class TypesOfData {
	static int avg;
	static byte byteDefaultValue;
	static short shortDefaultValue;
	static long longDefaultValue;
	static float floatDefaultValue;
	static double doubleDefaultValue;
	static boolean booleanDefaultValue;
	static char charDefaultValue;
	static String stringDefaultValue;	

	public static void main(String[] args) {
		// Data Types
		System.out.println("************Data Type:int***********");
		// 1. int
		int age = 2147483647;
		System.out.println("User Age=" + age);
		System.out.println("Default value:" + avg); // default value
		
		System.out.println("************Data Type:byte***********");
		// 2.byte  (-127 to 127)
		byte math = 127;
		System.out.println("Math Marks=" + math);
		System.out.println("Default value of byte=" + byteDefaultValue);
		
		System.out.println("************Data Type:short***********");
		//3.short
		short area=300;
		System.out.println("Area=" + area);
		System.out.println("Default value of short=" + shortDefaultValue);
		
		System.out.println("************Data Type:long***********");
		//4. long
		long range=21474836471L;
		System.out.println("Range=" + range);
		System.out.println("Default value of range=" + longDefaultValue);
		
		System.out.println("************Data Type:float***********");
		//5. float
		float lenght=10.4f;
		System.out.println("lenght="+lenght);//
		System.out.println("Default value of float=" + floatDefaultValue);
		
		System.out.println("************Data Type:double***********");
		//6. double
		double width=10.35365;
		System.out.println("Width:"+width);
		System.out.println("Default value of double=" + doubleDefaultValue);
		
		System.out.println("************Data Type:boolean***********");
		//7. boolean
		boolean condition=false;
		System.out.println("Condition:"+condition);
		System.out.println("Default value of boolean=" + booleanDefaultValue);
		
		System.out.println("************Data Type:char***********");
		//8.char
		char character='a';
		System.out.println("Character:"+character);
		System.out.println("Default value of character=" + charDefaultValue);
		
		System.out.println("************Data Type:String***********");
		//9.String
		String name="Automation Class";
		System.out.println("Name:"+name);
		System.out.println("Default value of string=" + stringDefaultValue);
		
		System.out.println("************Data Type:Array***********");
		//10. Array
		int [] marks= {10, 20};
		System.out.println("marks:"+marks[1]);
		
		//9. Classes
		TypeOfComments obj= new TypeOfComments();
		obj.a=00;
	
		
	}

}
