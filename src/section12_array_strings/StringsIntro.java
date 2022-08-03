package section12_array_strings;

public class StringsIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This class is all about Strings");
		System.out.println("String is a class present in java.lang package");
		System.out.println("Used to store sequence of characters");
		System.out.println("To store a string we have to use object of String class");
		System.out.println("either use new keyword, or directly assign value to String var");
		System.out.println("String are immutable. They cannot be modified. If we modify, a new object is created by JVM. Original string remains unchanged");
		
		
		
		String s = "James";
		//here string object with ref s is created
		//lets concat Gosling with James
		s.concat(" Gosling");
		System.out.println("The concatenated value is: "+s);
		s = s.concat(" Gosling");
		System.out.println("The concatenated value is: "+s);
		
		System.out.println("Four operators can be used with Strings: +(concat), +=(concat and assign), ==(two ref pointing to same object), !=(not pointing to same object)");
		
		String s1 = "Hi";
		//this object Hi is not created again, only the ref is created which points to already created Hi object in pool
		String s2 = "Hi";
		String s3 = s1;
		System.out.println("lets check s1 and s2 == "+(s1==s2));
		System.out.println("Lets check their hashcodes also: "+s1.hashCode()+" "+s2.hashCode());
		System.out.println("lets check s3 and s1 == "+(s3==s1));
		
		//String const Pool
		System.out.println("There are two ways of creating String. Strin Pool or Heap Memory");
		String s11 = "Hello"; //this goes to pool
		//whenever string is created using string literal, that object is created in SCP, before creating that JVM checks first if object checks in pool
		//if it does not exist, then only the object is created in SCP
		String s21 = new String("Hello World"); //object created and stored in Heap
		//Object created with new keyword in stored in heap as well as Pool.
		//IF the object existed, does not matter, new object will always be created
		//when created with heap, the ref will be of heap and not SCP
		String s31 = new String("Hello World");
		System.out.println("Lets check their equality when used with new: "+(s21==s31));
		System.out.println("Result of above statement will be false, as two objects are created with new operator and they do not point to same object");
		
		//equals method
		System.out.println("Equals method compares content of two strings");
		System.out.println("Its return type is obviously boolean");
		System.out.println("To compare equality of string created with new operator and lying in heap, equals will be used.");
		System.out.println("For strings created with new operator, == will not work");
		System.out.println("equals will work with any type of String, whether literal or new operator");
		
	}

}
