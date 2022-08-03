package section8_inheritance;


class A{
	public void f1() {
		System.out.println("I am coming from A-F");
	}
	
	public static void disp1() {
		System.out.println("This is display of A");
	}
	
	public void simplef() {
		System.out.println("I am coming from A-F simple");
	}
}
class B extends A{
	public void f2() {
		System.out.println("I am coming from B-F");
	}
	
	public void simplef() {
		System.out.println("I am coming from B-F simple");
	}
	
	public static void disp1() {
		System.out.println("This is display of A");
	}
}
class C extends B{
	public void f3() {
		System.out.println("I am coming from C-F");
	}
}

public class PolyIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LSP
		System.out.println("Whereever object of super class is used, the object of child class can be substituted");
		System.out.println("This is known as Liskov SUb Principle");
		
		A refA = new A(); //valid and logical
		A refB = new B(); //valid as B is child of A. A and B are of same type
		A refC = new C(); //valid as C is B and B is A, so C is of type A
		
		System.out.println("The above statements are called polymorphism");
		System.out.println("One name multiple forms. Ref vars are polymorphic as ref var of type A can refer to Objects of Childs classes B and C");
		System.out.println("But if we create ref of CHild and Object of parent, it will give compile time");
		
		System.out.println("Irrespective of calling methods by normal ref or polymorphic ref, the compiler will check for data type of ref only");
		System.out.println("For calling a method, the type of ref only is checked");
		System.out.println("to know the type of ref, The right hand side is ignored when creating a object");
		System.out.println("We have to make sure that method belongs in that class of ref");
		
		System.out.println("So how to call f2 from refA. The answer is type casting");
		System.out.println("For casting to work, parent child relationship should exist");
		
		//we have type casted the ref of A into ref of B
		//B refB2 = (B) refA; //ClassCastException will be there. No way to solve this. ref of Child cannot point to Object of Parent.
		//refB2.f2();
		
		//anonymous ref casting
		System.out.println("Here first refA is type casted to C and then f3 is called");
		//((C)refA).f3(); //ClassCastException will be there. No way to solve this. ref of Child cannot point to Object of Parent.
		
		
		System.out.println("At compile time compiler handles polymorphism");
		System.out.println("At runtime JVM handles polymorphism");
		System.out.println("When overridden methods are called using polymorphic ref, compiler looks for ref type, JVM looks for Object type");
		System.out.println("So at runtime, for overridden methods only, JVM will take over and call the overridden method of Object type rather than Ref type");
		refB.simplef(); //I am coming from B-F simple
		System.out.println("Which overridden method to call is decided by right side of object and not ref");
		System.out.println("Dynamic binding only ");
		
		System.out.println("In case of Method Hiding(static method overriding) as object creation is not required, only ref type decides which func to call. Because its not part of dynamic polymorphism");
		refB.disp1();
		
		
		System.out.println("The type casting of ref can be of two types");
		System.out.println("1. Converting from Parent to Child(as we are going down so downcasting): Means, the class is of particular special type: Specialization");
		System.out.println("2. Converting from Child to Parent(as we are moving up so upcasting): Means this is child and other children do exist. Generalization. Casting is optional in this step");
		System.out.println("Before doing type casting compiler first checks whether object creation is valid");
		System.out.println("If object creation is found valid, type casting is checked whether done correctly or not");
		
		//A B=(C) D //there should be relation between c and d
		//also A and C should be of same type
		System.out.println("To check for typecasting correct or not we will use instanceof operator");
		System.out.println("if(D instanceof A)"); //if true, typecasting can be done, else not
		
		
		
		
		
	}
}
