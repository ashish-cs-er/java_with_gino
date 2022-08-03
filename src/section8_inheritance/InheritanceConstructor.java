package section8_inheritance;

class ParentConstClass{
	
	int parentInt;
	static int iamStatic = 30;
	ParentConstClass(){
		this.parentInt = 10;
		System.out.println("parent const called");
	}
	
	ParentConstClass(int val){
		this.parentInt = 30;
		System.out.println("parent const called:: Parametrized");
	}
}

public class InheritanceConstructor extends ParentConstClass{

	InheritanceConstructor(){
		this(10);
		System.out.println("Child const called");
	}
	
	InheritanceConstructor(int a){
		System.out.println("Child const with parameters : "+a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Child class can call the parent class const using super() or super(parameters)");
		System.out.println("Can only be used inside the child const only and should be the first line of code");
		System.out.println("this() and super() both together cannot be used as both should be the first line of code inside const. Hence any one of them can be used");
		System.out.println("If a class does not have any constructor, default const is provided by compiler");
		System.out.println("But if a const is present, compiler does not provide anything");
		System.out.println("The child const automatically calls the parent class const. The only time it does not call is when this or super are present in child const");
		System.out.println("This is done because child class inherits vars from parent class");
		System.out.println("If the parent class is not initialized, there might incomplete object creation.");
		System.out.println("To solve this issue, parent class DEFAULT const is called automatically from child class");
		System.out.println("Only default const is called even if other parametrized const are also present");
		System.out.println("To call other const and not the default one, we may have to use super()");
		
		System.out.println("");
		
		System.out.println("Providing default const, and calling default const are two different things");
		System.out.println("if no const is present, compiler provides one");
		System.out.println("If there is no call to this or super, child class const will surely call default const");
		System.out.println("If default const is not present, compilation error will come");
		System.out.println("So its a good practice to always create default const when class is created");
		System.out.println("SUper and this keyword are to be used in instance methods only and not in static methods");
		System.out.println("Instance vars of parent class can be used in instance methods of child class either directly, or using super.varname or this.varname");
		
		System.out.println("Static vars of parent can be accessed in child either directly or using class.var: "+iamStatic);
		System.out.println("static vars can also be used with super and this keyword though this is not good practice");
		
		
		
		
		
		InheritanceConstructor ic = new InheritanceConstructor();
		
		
	}

}
