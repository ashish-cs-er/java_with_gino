package section6_packages.inheritance;

public class InheritanceIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Basically used for reusability, and sharing");
		System.out.println("we use keyword extends along with the class name and provide the class name which is parent");
		System.out.println("The sameple is: public class Child extends Parent { }");
		System.out.println("In java we can extend only one class but implement multiple interfaces");
		System.out.println("Not everything from parent passes on to the child");
		System.out.println("Only those properties and behaviour which are having visibility in child class can be passed to child");
		System.out.println("This visibility is controlled by access specifiers");
		
		System.out.println("A class consists of variables and methods. So both of them can have access specifiers");
		System.out.println("Local variables cannot have access specifiers");
		System.out.println("Can only be used with instance and static vars");
		System.out.println("The access specifiers used are default, private, public, protected");
		System.out.println("public: available anywhere");
		System.out.println("private: can only  be used inside class it is created. If we use in another class, compilation fails");
		System.out.println("default: visibility inside package only. If no access specifier is present, it is assumed to be default");
		System.out.println("If the files are in different package, even after importing the default vars will not be visible till we dont extend the class");
		System.out.println("Members can have 4 access specifiers, but a class can have only two: public and default(which should not be written before class keyword)");
		System.out.println("a default class can only be used inside its package only, if we use in another package, compilation fails");
		
		//protected access specifier
		System.out.println("As we have seen classes marked as default are not visible outside the package even with import or inheritance");
		System.out.println("So protected comes to the rescue. It has visibility within the package, and outside only when extended by another class");
		
		
	}

}
