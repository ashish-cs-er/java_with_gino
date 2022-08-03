package section9_abstract;

public class AbstractIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is regarding abstract classes in java");
		System.out.println("A method created with no body is called abstract method");
		System.out.println("Abstract keyword is used to mark a method as abstract");
		
		System.out.println("abstract void calAreea()");
		System.out.println("Generally used to define business process which is implemented by child class methodds");
		System.out.println("If the method is incomplete somehow the class is also incomplete");
		System.out.println("This makes class also abstract");
		System.out.println("Any class having zero or more abstract methods is to be marked as abstract");
		System.out.println("Its important for child classes to implement or override the abstract method");
		System.out.println("If the child classes also cannot provide definition of abstract method, mark the child classes also as abstract");
		System.out.println("IT is not compulsory for a class to have abstract methods. It may or may not have");
		System.out.println("Keeping future in mind regarding scalablility, java allows us to mark class as abstract even if it does not contain any abstract methods");
		System.out.println("Tomorrow there may be a scenario where we may have to provide abstract method in the class");
		System.out.println("Ref var can be created but cannot be instantiated. We cannot create object but only ref variables of abstract classes");
		System.out.println("Method cannot be marked as abstract and final. If its marked as final, it cannot be overrideen in child class");
		System.out.println("Abstract and Pvt not allowed: because there is no visibility");
		System.out.println("Abstract and static is not allowed: because static methods are not overridden but hidden");
		
		//Constructrs are allowed inside Abstract Classes
		//If object cannot be created then why Const allowed
		//this is allowed to initialize its instance vars
		System.out.println("Const are allowed in Abstract classes though we dont allow object creation");
		System.out.println("This is to initialize instance variables of Abstract class which are then provided to Child classes for further manipulation");
	}

}
