package section12_array_strings;

public class StringBuilderMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//append: we can append a String or any primitive data also
		
		//insert(int index, String s)
		System.out.println("insert func inserts the string at the specified index in the string builder object");
		
		//deleteCharAt(int P) delete char at the given index
		//delete(int P, int Q) : starting from P upto Q-1
		
		//reverse: reverses the character in the string builder obj
		
		//toString()
		//convert a string builder object into a new String and place on heap
		
		
		//checking string builder object for equality
		System.out.println("The StringBuilder equals method is overridden to check for address of objects rather than content");
		System.out.println("Check below example.");
		StringBuilder sb11 = new StringBuilder("Hello");
		StringBuilder sb12 = new StringBuilder("Hello");
		System.out.println("Lets do equals : "+(sb11.equals(sb12))); //false output as the address of sb11 and sb22 are not equal
		System.out.println("In Object, StringBuilder, User defined classes, the equals method compares data based on address");
		System.out.println("In String and Wrapper classes, the equals method has been overridden to compare content contained in variables");
		
		System.out.println("Then how do we compare two strings");
		System.out.println("Convert to String and then equate them");
		
		System.out.println("in Java 11 now we have compareto function in StringBuilder");
		
		System.out.println("This is present in java.lang.Comparable interface");
		System.out.println("Returns 0 if strings equal else return is not 0");
		
		System.out.println("using compareTo : "+sb11.compareTo(sb12) ); //output is 0 hence equal
		
		//method chaining in Strings
		//The result returned by one method becomes input for the next method
		String s = new String("Hi");
		String st = s.concat("World").toLowerCase().substring(2, 4);
		System.out.println("String after chaining of methods is: "+st);
		
	}

}
