package section8_inheritance;

class ParentClass{
	int a;
	int b;
	
	ParentClass(){
		this.a=10;
		this.b=20;
		System.out.println("Parent class const called");
	}
}

public class InheritanceIntro extends ParentClass {
	
	int a=30;
	
	InheritanceIntro(){
		System.out.println("Child class const called: "+a);
		
	}
	
	public static void main(String args[]) {
		System.out.println("Creating class from another class is called inheritance");
		System.out.println("Child class inherits visible items(based on access specifier) from the parent class");
		System.out.println("The parent class is called super class or base class");
		System.out.println("Only one class can be inherited using extends keyword");
		System.out.println("This is to avoid ambiguity");
		
		System.out.println("As soon as child const is called, the first thing it does is call parent const");
		System.out.println("the instance vars of parent can be accessed via parent class obj or child class obj or both");
		InheritanceIntro ii = new InheritanceIntro();
		ParentClass pc = new ParentClass();
		System.out.println("value of a in parent class is: "+ii.a +" "+pc.a);
		
		
		
		
	}
}
