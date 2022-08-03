package section8_inheritance;

class Parent{
	
	public static void disp1() {
		
	}
}

public class MethodHidingIntro extends Parent {
	
	public static void disp1() {
		
	}
	public static void main(String args[]) {
		System.out.println("Now we know that method overriding works with instance methods");
		System.out.println("When two STATIC METHODS have same signature in parent and child class it is called MEHOD HIDING");
		System.out.println("A method can be either overridden or hidder but not both at one time");
		System.out.println("Which method will be called in method hiding is as follows:");
		System.out.println("1. If called by using object, look at the calling object");
		System.out.println("2. If called by class, look at the calling class");
		System.out.println("3. If called by  func of parent class, parent class hidden will be called");
		System.out.println("4. If called by func of child class, child class hidden will be called");
		
		
		
	}
}
