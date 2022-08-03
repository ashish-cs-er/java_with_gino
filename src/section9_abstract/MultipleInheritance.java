package section9_abstract;

class A1{
	public void f() {
		System.out.println("I am from f of A");
	}
}

interface B{
	public default void f() {
		System.out.println("I am from f of B interface");
	}
}

public class MultipleInheritance extends A1 implements B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance mi = new MultipleInheritance();
		System.out.println("When there is same function in Class and Interface, the priority is given to method of class");
		
		mi.f();
		
	}

}
