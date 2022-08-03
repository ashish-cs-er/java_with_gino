package section8_inheritance;

public class OverloadingIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Two functions are said to be overloaded, when they have same names but different args");
		System.out.println("1. Number of args, 2. data type of args, 3. sequence of args");
		System.out.println("Only NDS(number, data, sequence) rule applies");
		System.out.println("if return type and access specifier are diff but NDS same, it cannot be treated as function overloading");
		System.out.println("Return type and Access SPecifier not considered");
		System.out.println("Done to remember names");
		System.out.println("Best use is system.out.println function. It can take any type of parameter and do the work");
		System.out.println("Can be done in same or child class. Can be applied to static or instance methods");
		System.out.println("We should avoid function overloading for those methods which can confuse compiler");
		System.out.println("See the code below");
		//check this
		sum(10,20.0);
		sum(12.89,8);
		System.out.println("What will happen if we pass both args to func call as int");
		//what will happen if i pass both args as int
		//sum(2,2); here both the functions can have a match and hence ambiguous
		System.out.println("If there is ambiguity for type of args, the best matching function is picked to be called up");
		
	}
	
	
	//fn overloading
	public static void sum(int a, double d) {
		System.out.println("Sum is: "+(a+d));
	}
	
	public static void sum(double a, int d) {
		System.out.println("Sum is: "+(a+d));
	}

}
