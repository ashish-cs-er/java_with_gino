package type_conversion;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type conversion means assigning variable of one data type to variable of another datatype");
		System.out.println("Type conversion happens automatically if the below two conditions are satisfied");
		System.out.println("1.Both data types are compatible. 2. Destination data type larger");
		System.out.println("For rule number 1: All the numeric data types, byte, short, int, long, float, double are compatible with each other");
		System.out.println("Numertic data types are not compatible with non numeric data types like char string boolean and Classes and Objects");
		System.out.println("Lets check out");
		
		byte b = 25;
		int a=b;
		System.out.println("Here byte and int are compatible. ALso byte is being assigned to int which is larger. Both rule 1 for compatibility and rule 2 for size matches");
		System.out.println("So this will work");
		
	}

}
