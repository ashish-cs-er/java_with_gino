package section6_packages.inheritance.p1;

public class ProtectedSamePackage{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("We are checking visibility of protected vars in same package without extends keyword");
		System.out.println("Not much of a difference within same package if we use protected");
		C1 c1 = new C1();
		ProtectedSamePackage psp = new ProtectedSamePackage();
		System.out.println("c1 i var is: "+c1.i+ " name is: "+c1.name);
		System.out.println("I am calling display of C1");
		c1.displayValuesInC1();
		System.out.println("We can even use i(protected) directly also when in same package: "+ c1.i);
	}

}
