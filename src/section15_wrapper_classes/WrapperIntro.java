package section15_wrapper_classes;

public class WrapperIntro {
	
	boolean b; //by default false
	Boolean bB=true; //as this is being used as instance var, by default null
	
	public void disp(boolean b) {
		b = !b;
		System.out.println("primitive boolean is: "+b);
	}
	
	public void disp(Boolean bB) {
		bB=!bB;
		System.out.println("Wrapper boolean is: "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wrapper Classes are pre-defined classes given by java to hold primitive data type");
		System.out.println("This will wrap the primitive value to Wrapper class Object");
		
		//Following Wrapper classes are avaiable:
		//boolean->Boolean
		//char -> Character
		//byte ->Byte
		//short -> Short
		//int -> Integer
		//long ->Long
		//float -> Float
		//double -> Double
		
		
		int a1 =100;
		//a1 is a local variable holding int value
		Integer a2 = 100;
		//but a2 is an object of type Integer
		System.out.println("Value of a: "+a1+" Value of b: "+a2);
		
		
		//whenever string is to be converted back to its type, you have to use that specific wrapper class
		String s = "120";
		System.out.println(s.getClass().getName());
		
		System.out.println("The best example where they are required is Collections, Generics");
		System.out.println("The second use of Wrapper classes is to define utility methods on primitives");
		System.out.println("Post version 1.5 automatic coversion happens for primitive to Wrapper classes and this is known was autoBoxing");
		
		System.out.println("The ref values are set to null when used as instance vars not to default values like that of primitive type");
		System.out.println("When used locally, their values have to be initialized");
		System.out.println("The decimal wrapper classes, extend java.lang.Number");
		System.out.println("Wrapper classes are final and cannot be inherited by other classes");
		
		
		//Autoboxing and unboxing are terms used to describe the operations 
		//performed by the Java compiler when converting from 
		//primitive to Wrapper or Wrapper to Primitive
		
		System.out.println("Autoboxing: assign literal to Wrapper class Ref");
		System.out.println("Unboxing: assign Object to primitive type");
		System.out.println("Wrapper constructors are deprecated as of today. If we need to use we should use valueOf");
		
		//lets check method overloading with Wrapper class
		//these two are two different things
		//using primitive and Wrapper, method overloading can be done
		WrapperIntro wi = new WrapperIntro();
		
		wi.disp(wi.b);
		wi.disp(wi.bB);
		
		
		//lets check for equality
		
		//when created with new operator two separate objects are created and hence == returns false
		Integer x = new Integer(10);
		Integer y = new Integer(10);
		System.out.println(x==y); //false
		//--------------------------------------
		
		//
		Integer a11=new Integer(20);
		Integer a21 = 20;
		System.out.println(a11==a21);//false
		//------------------------------------
		Integer a = 10;
		Integer b = 10;
		System.out.println(a==b);//true
		//----------------------------------
		Integer aa = 1000;
		Integer bb = 1000;
		System.out.println(aa==bb); //false, why?? Buffer concept in autoboxing
		System.out.println("As soon as Integer is loaded, buffer of -128 to 127 values in loaded and any values referred by Integer class are assigned from this buffer only");
		System.out.println("Buffer concept is there for autoboxing");
		System.out.println("-128 to 127 objects when used with autoboxing return the same object");
		System.out.println("But when value is more than 127, autoboxing returns two separate objects");
		
		//for byte-short-int-long: -128 to 127
		//for char: 0-127
		//for Boolean: always buffer is available as two values are involved, true and false
		//float and double: no buffer concept is there
		//even for autoboxing, double and float when equated would return false
		Double d1 = 10.0;
		Double d2 = 10.0;
		System.out.println("Lets check d1==d2: "+(d1==d2));
		
		//valueOf: for valueOf also buffer concept will be applicable
		
	}

}
