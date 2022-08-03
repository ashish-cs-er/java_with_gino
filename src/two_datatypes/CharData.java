package two_datatypes;

public class CharData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is also a type of primitive data type");
		System.out.println("To deal with a single letter or character we use char data type");
		System.out.println("we have to use single quote for char data type");
		char c = 'a';
		char someLetter = '9';
		System.out.println("char ch='bye' this will fail as there are more than one char");
		char ch = 87;
		System.out.println("How do we store char not on keyboard and symbols outside the language english");
		System.out.println("The answer is char encoding");
		System.out.println("char encoding is assigning a code to every possible char that could be used");
		System.out.println("There are various char encodings available: ASCII: US, KOI-Russia, BIG-5: China");
		System.out.println("ASCII had initially 128 letters. It was expanded to include 128 more letters and was called extended ASCII");
		
		System.out.println("So there was a need to support a large number of characters. Every encoding scheme had its own code for characters and hence to solve this issue UNICODE was formed");
		System.out.println("UNICODE is an ecnoding scheme, that provides a code for all letters and symbols of all languages in the world");
		System.out.println("It has a standard size of 2 byte");
		System.out.println("Unlike ASCII which originally supported only 256 char, UNICODE initially supported 65536 letters and was later also extended to include some more");
		System.out.println("Starts with backslash u and ranges like \u0000 to \uFFFF");
		char ch3 = '\u1111';
		System.out.println(ch3);
		
		System.out.println("Ascii codes are 0-9: 48-57, A-Z: 65:90, a-z:97-122 blank space:32");
		
		System.out.println("How to print A in java");
		System.out.println("Fist approach is to assign directly");
		char chh = 'A';
		
		System.out.println("The second approach is to assign the ascii value");
		chh=65;
		System.out.println("chh is: "+chh);

		System.out.println("Another way is to search on internet and assign UNICODE to ch");
		chh = '\u0041';
		System.out.println("Value of chh is: "+chh);
		
		System.out.println("Something has to be given in single quotes including blank space. Oterwise compile time error comes");
		
		System.out.println("The thing with unicode is that anything with \\u even in comments will be compiled by compiler");
		System.out.println("Important point is even within the comments");
		System.out.println("Compilation will fail if an invalid unicode is provided to JAVA");
		
	}

}
