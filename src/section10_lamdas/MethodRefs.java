package section10_lamdas;

@FunctionalInterface
interface FuncA{
	public String abstractMethod();
}

@FunctionalInterface
interface FuncB{
	public String abstractMethod(int p, String q);
}

@FunctionalInterface
interface FuncC{
	public String abstractMethod();
}

public class MethodRefs {

	public static String hi() {
		return "Hello from hi() static method";
	}
	
	public static String hi(int i, String j) {
		return "Hello from hi() static method with arguments "+i+" "+j;
	}
	
	public String hello() {
		return "I am hi() from instance Method";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is also a way of providing body to the abstract method of func interface");
		System.out.println("But its not exaclty the same as lamdas");
		System.out.println("Lamdas can be used in any situation, but Method refs are used in special conditions");
		System.out.println("When to use");
		
		System.out.println("When method body is of single line and lamda only calls another function, we can use Method Ref");
		System.out.println("But if there are multiple statements, or a single statement but that does not make any call, we cannot use Method Ref in that case");
		
		System.out.println("For static Method:  ClassName::funcName"); //no () after func name
		System.out.println("For intsance Method:  new ClassName()::funcName"); //no brackets after func name
		System.out.println("For non void methods, argument type and return type has to be same");
		System.out.println("Internally Method ref are converted to lamdas by java");
		System.out.println("For void return methods, args have to be same but return type not mandatory because any statement call is valid statement expression");
		
		
		
		
		//Using Lamda
		FuncA ref1 = () ->  MethodRefs.hi();
		String sLamda = ref1.abstractMethod();
		System.out.println("Message is: "+sLamda);
		
		//using Method Ref
		//there is just one statement, and function call is there
		//so method ref can be used
		FuncA ref2 = MethodRefs  :: hi;
		String sMethodRef = ref2.abstractMethod();
		System.out.println("THe message using Method Ref: "+sMethodRef);
		
		
		//using Method Ref with static methods with arguments
		FuncB b1 = MethodRefs :: hi;
		String s1 = b1.abstractMethod(12, "Apples");
		System.out.println(s1);
		
		
		//using MethodRef with instanceMethods
		FuncC fc1 = new MethodRefs() :: hello;
		String s2 = fc1.abstractMethod();
		System.out.println("See s2: "+s2);
	}

}
