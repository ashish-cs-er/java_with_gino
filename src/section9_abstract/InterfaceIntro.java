package section9_abstract;

public class InterfaceIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Why do we need interfaces");
		System.out.println("Suppose there are two classes which needs to be inherited");
		System.out.println("But using classes this is not allowed right");
		System.out.println("To sort out this issuel, Interfaces are introduced");
		System.out.println("To inherit interfaces we use implements keyword with interfaces");
		System.out.println("First we have to extend class then implement interface. This order is to be kept in mind");
		System.out.println("Interface methods are by default public and abstract. Writing abstract is optional with methods in interface");
		System.out.println("If we do not specify any access specifier for METHODS in Interface its by default public and abstract");
		
		//Interface Vars
		System.out.println("Interface variables by default are: public, static and final");
		System.out.println("Final keyword for METHODS is not allowed in interfaces. Compilation fails");
		System.out.println("If the Object class methods are made abstract in interfaces, they are ignored(if same return type as that of Object methods)");
		System.out.println("Public methods of Object class if made abstract in interfaces and classes are ignored(if return type different that Object methods, they are not ignored)");
		
		
	}

}
