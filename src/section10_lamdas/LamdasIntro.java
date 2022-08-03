package section10_lamdas;

@FunctionalInterface
interface A1{
	public void f();
}
public class LamdasIntro{

	
	public static void main(String args[]) {
		System.out.println("Lamda expressions are used for func programming");
		System.out.println("Used to provide body to the single abstract method of func interface");
		System.out.println("Lamda expression is not overriding the abstract method. Its just another way of providing body and that too wihtout inheritance");
		
		System.out.println("Lets learn the syntax");
		System.out.println("-> this symbol is called lamda expression.");
		System.out.println("No need to implement the interface by class when using lamdas");
		System.out.println("Directly body is provided for the abstract method of interface using lamdas");
		// FuncInterface func1 = (args)->{body};
		//as abstract method of interface does not have args, lamda is also without args
		//retrurn type of abstract method is void, lamda also does not return anything
		A1 refA1 = () -> {System.out.println("Hello THere");};
		refA1.f();
		System.out.println("Lamda expression can be created anywhere inside the class. Inside the class is important");
		System.out.println("We can create any number of lamdas for the abstract methods of func interface");
	}

}
