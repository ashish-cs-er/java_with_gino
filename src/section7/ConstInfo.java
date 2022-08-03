package section7;

public class ConstInfo {

	int a;
	String name;
	double d1;
	
	ConstInfo(){
		System.out.println("Hello there. I am default constructor. I have been called");
	}
	
	/*
	ConstInfo(int a){
		System.out.println("Integer data type const: ");
	}
	*/
	
	ConstInfo(String s){
		System.out.println("String data type const");
	}
	
	ConstInfo(int a, String s){
		System.out.println("Both data type const");
	}
	
	ConstInfo(double d){
		System.out.println("I am coming from double. This is type promotion");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A block of code used to initialize data present in objects with certain default values");
		System.out.println("It has same name as that of class name followed by parenthesis");
		System.out.println("Cannot have a return type, not even void as its not a function. Compile time error will be there");
		System.out.println("if we dont define any const, compiler creates empty constructor by itself internally");
		System.out.println("Constructor is a good way to initialize the variables of type final i,e constants");
		System.out.println("Class can have any number of constructors");
		System.out.println("Constructors having paramaters are called parametrized constructors");
		System.out.println("This is known as constructor overloading");
		System.out.println("If there are multiple const, which const to invoke is known by:  1. no of parameters 2. data type of parameters");
		System.out.println("The compiler wont provide a default const if const of any kind is present in the class");
		
		
		//by the below command default should be called
		ConstInfo ci = new ConstInfo();
		
		//the below command should call int const
		System.out.println("In this class we have both int and double const. Lets comment int const");
		System.out.println("Now in the below line we will provide int value but int const is not there. This will compile safely and the double method will be called");
		System.out.println("This is known as type promotion in constructors");
		ConstInfo c1Int = new ConstInfo(4);
		
		//The sequence is as follows for type promotion
		//char->byte->short->int->long->float->double
		
		//the below command should call string const
		ConstInfo ciStr = new ConstInfo("Hello");
		
		//the below comand should call const with two arguments
		ConstInfo ciBoth = new ConstInfo(4,"Hi");
		
	}

}
