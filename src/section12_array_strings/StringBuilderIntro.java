package section12_array_strings;

public class StringBuilderIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String class is present in java.lang package which is present in java.base module");
		System.out.println("String class in immutable but StringBuilder is mutable");
		
		System.out.println("Modification are done on same object");
		System.out.println("Its faster than StringBuffer but its not thread safe");
		//using StringBuilder
		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder();
		System.out.println("Empty string builder has capacity to store 16 char");
		
		StringBuilder sb3 = new StringBuilder(20);
		System.out.println("In the above line we have specified the initial capacity");
		sb3.append("sdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdss"); //automatic increase in capacity
		System.out.println("sb3 is: "+sb3);
		
		
		
		//append: appends the param s to String Object
		//calling append will modify the same object rather than creating new object
		//append method is overloaded in String class
		//it can append String as well as primitive data
		
		System.out.println("String Builder Capacity Rules");
		System.out.println("Rule 1: When StringBuilder does not have initial value");
		System.out.println("Then we can either provide empty string builder or provide capacity which is optional");
		
		StringBuilder sb11 = new StringBuilder();
		//initial capacity of 16 will be provided
		//OR StringBuilder sb22 = new StringBuilder(20);
		System.out.println("What happens when data is stored in this StringBuilder obj");
		System.out.println("The capacity is modified to length of String");
		sb11.append("Helo");
		System.out.println(sb11.capacity()+sb11.toString());
		
		
		System.out.println("Rule 2: When value is present in String Builder");
		StringBuilder sb222 = new StringBuilder("Hello Charlie!!!! How are you");
		System.out.println("The initial capacity becomes: sb.length()+16");
		System.out.println("If the capacity is exceeded, new capacity is calculated by (current_capacity+1)*2");
		
		
		
		
	}

}
