package type_conversion;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type casting means forcibly assigning value of one variable of one data type to another the data type");
		System.out.println("It is done manually and forcibly");
		System.out.println("Done using (type) after = opearator");
		//See below how we have forced int to be assigned to byte
		int a=20;
		byte b = (byte) a;
		byte b1 = (byte) 130;
		//what happens in above code is after higherst range of 127, the counter again starts from -128
		//130-127  = 3: -128,-127,-126
		//this is known as overflowing
		//lets print b1
		System.out.println("Value of b1 is: "+b1); //it should print -126
		
		byte b2 = (byte)-130;
		//lets see what we get here
		//when we assign the value lowermost value to the var, it starts with higher most and keeps reducing with difference
		//-130+128 = -2: 127,126
		//this is known as underflowing
		System.out.println("Value of b2 is: "+b2); //we get 126
		
		System.out.println("THe value of underflow and overflow applies to individual numnbers");
		System.out.println("if after addition the range goes out, then compilation will happen but runtime error will occur");
		
		
		//converting String to numbers
		String s1 = "123";
		int a3;
		System.out.println("If i do a3=s1 it will not work as String and int are non compatible");
		System.out.println("to convert String to numeric data types we need to use parseInt, parseFLoat ect with the wrapper classes");
		a3 = Integer.parseInt(s1);
		System.out.println("Value of String s1 converted to a3 is: "+a3);
		System.out.println("If the conversion fails we get NumberFormatException");
		
		String sd = "345.65";
		Double ds = Double.parseDouble(sd);
		System.out.println("String converted to double is: "+ds);
		
		System.out.println("If we try to convert a string containgin double value to an int value, compilation will happen but runtime error will be there");
		System.out.println("Using wrapper classes, numeric types are not compatible at run time. which means type casting cannot work here");
		
	}

}
