package section12_array_strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is about methods for string manipulation");
		
		
		//length()
		System.out.println("length(): for arrays its length without parenthesis. But for string () are used with length");
		String s1 = "Hello World";
		System.out.println(s1.length());
		
		//concat(String)
		System.out.println("concat(String): for concatenation of strings");
		String s21 = "Concat";
		String s22 = " Me";
		String s23 = s21.concat(s22);
		System.out.println("Concatenated String is: "+s23);
		
		//equals : to check for content of string
		String s31 = "java";
		String s32 = "Java";
		String s33 = new String("java");
		System.out.println("s31.equals(s32): "+s31.equals(s32)); //false as case differs
		System.out.println("s32.equals(s33): "+s32.equals(s33)); //true
		
		//equalsIgnoreCase
		//this method will check for contents ignoring case also
		System.out.println("s31.equalsIgnoreCase(s32): "+s31.equalsIgnoreCase(s32)); //true
		
		//toUpperCase(): to convert string to upprecase, toLowerCase(): converts to lowercase
		System.out.println("s31.toUpperCase(): "+s31.toUpperCase()); //JAVA
		
		//String.join(delimiter, varargs with ...) method introduced in java 8
		//if any element is null, then null is also added to the String
		//delimiter can be left blank
		String ss = String.join("-","Coding","With","Gino"); //Coding-With-Gino
		System.out.println("Joined String is: "+ss);
		
		//charAt(int index): used to find the char in String at a particular index. 
		String sss= "Hello WOrld";
		System.out.println(sss.charAt(4)+" is the char at index 4"); //o
		
		//int indexOf(char or String) : Here we give char or string and this returns the index. 
		//in case of string, starting char index will be given
		String s121 = "Hello WOrld";
		System.out.println("lets check the index of W: "+ s121.indexOf("W")); //6
		
		
		//lastIndexOf(char or String) find the last occurrence of char or String
		//in case of more than one char, the starting char index will be returned
		//non matching will result in -1
		
		//substring(int p): returns subset of string starting from p until end of string
		//substring(int p, int q): subset starting from p upto q-1
		s121 = "Good Day";
		System.out.println("subset is: "+s121.substring(5));    //Day
		System.out.println("subset is: "+s121.substring(0, 4));  //Good
		System.out.println("If index does not exist, String index out of Bound exception");
		
		//replace(char old, char new) : first a new string is created and then changes are done
		//replace(String old, String new)
		s121 = "Good";
		System.out.println("Lets check replace: "+s121.replace("G", "W"));
		System.out.println("If vaalue is not found in string, nothing is done, there is no error");
		
		//trim(): Returns new string with blank spaces deleted from beginning and end
		//returns new string using the new keyword and if there is something to trim
		//trim creates new string using heap
		
		//contains(String p): returns boolean :: takes parameter as String and not Char
		
		//startsWith(String p), endsWith(P)
		
		
		
		
	}

}
