package section5_classes_objects;

public class Func {
	
	public void display(String msg) {
		System.out.println("Hello I am displayed: "+msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Suppose there is a code and it is to be used again and again");
		System.out.println("We can keep writing the same logic again and again");
		System.out.println("The other method is to create a function and call it wherever required");
		System.out.println("A function must have return type. Void return type means a function returns nothing");
		
		//void funcName(args){}
		
		System.out.println("a function is called using object of the class");
		
		Func f = new Func();
		f.display("World"); //world will get displayed
		
		//char can return char
		//byte can return byte+char
		//short: can return char, byte, short
		//int: can return char, byte, short, int
		//long: can return char, byte, short, int, long
		//float: returns char, byte, short, int, long, float
		//double: can return char+any numeric type
		
		System.out.println("Void functions must notbe called in SOPLN");
		System.out.println("If return keyword is used and nothing is returned it is treated as void and compilation is successfull");
		
		
	}

}
