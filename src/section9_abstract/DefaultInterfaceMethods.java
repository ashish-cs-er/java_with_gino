package section9_abstract;



interface A{
	int aVar=20;
	
	void overrideMe();
	
	default void f1() {
		System.out.println("Hello I am coming from f1");
	}
	
	static void f2() {
		System.out.println("Hello I am coming from f2");
	}
	
}

public class DefaultInterfaceMethods implements A{

	public void overrideMe() {
		System.out.println("I have been ovverridden in Child class");
	}
	
	public void accessVarFromInstance() {
		A.super.f1();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Initially only public abstract methods were allowed in interfaces");
		System.out.println("Suppose there is change in design and now another method is to be added to interface");
		System.out.println("As soon as the mehtod is added in interface, there will be error");
		System.out.println("The error is because the newly added method is not overridden in child classes");
		System.out.println("So java provided with default methods with body specified in Interfaces");
		
		System.out.println("default keyword has to be used. This is different from access modifier default. ");
		System.out.println("default method is a method which is having some body by default");
		System.out.println("The sequence of default and public can be exchanged in interfaces");
		System.out.println("Its overriding is not compulsory in child classes. But we may do so if required");
		
		System.out.println("How to access default methods in child classes");
		System.out.println("1. From intance methods: Interface.super.methodName");
		System.out.println("2. From static methods: create object of child class, then call interface method");
		
		System.out.println("If we do not want the interface method to be overridden or changed in child class we mark is as static");
		System.out.println("Why?? because static methods can only be hidden not overridden");
		
		DefaultInterfaceMethods di = new DefaultInterfaceMethods();
		System.out.println("Value of var is: "+A.aVar);
		
		di.accessVarFromInstance();
		
		
		//The static method is never inherited from interface
		//to call the static method of interface we do direclty:
		A.f2();
		
		System.out.println("We inherit interface for its default and abstract methods not for static methods");
		
		
		//Private methods
		System.out.println("Must have a body. SHould not be visible to any child class");
		System.out.println("Should not be avaiable to use inside child classes");
		System.out.println("Created and consumed inside interfaces only");
		System.out.println("They are like helper methods of interface");
		
		System.out.println("To use private method from a static interface method, the private methods must be made static");
		System.out.println("To use prvt methods inside default methods, we remove static keyword from private methods");
		
		System.out.println("This keyword can also be used inside the interfaces");
		
		
	}

}
