package section6_packages.inheritance.p2;

import section6_packages.inheritance.p1.C1;

public class C2 extends C1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Class C1 is present in p1 package and class C2 is present in p2 package");
		System.out.println("We have imported the class C1 which is having protected members and methods");
		System.out.println("Now we have created objects of both C1 and C2");
		C1 c1 = new C1();
		C2 c2 = new C2();
		System.out.println("If we try to access the protected vars or protected methods of C1 with c1 obj, compilation fails");
		System.out.println("These are only available using ref of Child Class");
		c2.displayValuesInC1();
		System.out.println("There are certain rules related to protected access");
		System.out.println("1. Parent Child in same package:  If the Parent and Child class both are in same package, protected var and methods can be used using Parent ref in Child class");
		System.out.println("2. Parent Child in diff package: If Parent and Child class are in different packages, the Parent class protected vars and mehtods can be accessed by subclass using subclass ref variable only");
	}

}
