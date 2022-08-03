package two_datatypes;

public class FloatingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is regarding numbers with after decimal");
		System.out.println("There are two types of: 1. float 2. double");
		System.out.println("Float: size is 4 byte and precision upto 7 digits after decimal");
		System.out.println("Double: size is 8 bytes and precision upto 15 digits after decimal");
		
		System.out.println("All numbers with decimal are called floating point numbers");
		System.out.println("By default all floating point numbers in java are double");
		
		double d1 = 2.76;
		
		System.out.println("But if we store the above literal into float it will give compile time error");
		System.out.println("Its well within the range but the issue is its a rule in java that by default floating point number will be double");
		System.out.println("we have to suffix the number with f for assigning the number to data type float");
		float f1 = 2.71f;
		
		System.out.println("we can suffix D or d for double also but it will be useless since by default floating point numbers are double");
		
		System.out.println("Lets divide float point number with 0 and see the output");
		
		float f2 = 2.71f/0;
		System.out.println("The floating point number is: "+f2);
		System.out.println("The output will be infinity. Its being printed from the class java.lang.Float which has variable POSITIVE_INFINITY");
		System.out.println("Lets print Float.POSITIVE_INFINITY");
		System.out.println(Float.POSITIVE_INFINITY);
		System.out.println("Similarly when a negative floating number is divided by 0, it gives -infinity");
		
		System.out.println("What happens if we divide 0.0f/0");
		System.out.println("It prints NaN");
		System.out.println("Float.Nan: "+Float.NaN);
		float f3 = 0.0f/0;
		System.out.println("Value of f3 is: "+f3);
		
		System.out.println("Just like float, Double class also has these three infinity, negative infinity and NAN");
		
		
	}

}
