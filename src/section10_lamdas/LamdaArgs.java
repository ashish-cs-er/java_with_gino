package section10_lamdas;

@FunctionalInterface
interface InterfaceFunc1 {
	public void abstractMethod();
}

@FunctionalInterface
interface InterfaceFunc2 {
	public void abstractMethod(String msg);
}



public class LamdaArgs {

	public static void main(String args[]) {
		System.out.println("In this class we will understand how to provide args to lamda body");
		
		
		System.out.println("type 1: no args in abstract method");
		System.out.println("Empty parenthesis has to be provided");
		InterfaceFunc1 i11 = () -> System.out.println("Hello I am from Lamda");
		i11.abstractMethod();
		
		System.out.println("Type no 2: argument of type String");
		//Normal way using exact data type
		System.out.println("When data type is given to lamda, parenthesis for args is compulsory");
		InterfaceFunc2 i21 = (String m) -> System.out.println(m);
		i21.abstractMethod("Hello");
		//using varargs
		InterfaceFunc2 i22 = (var m) -> System.out.println(m);
		i22.abstractMethod("Hello");
		//shortcut way using varargs without var keyword
		InterfaceFunc2 i23 = (m) -> System.out.println(m);
		i23.abstractMethod("Hello");
		
		System.out.println("Dont mix the String ,var, and non data type vars in arg list. Use any one way only");
		
		
	}
}
