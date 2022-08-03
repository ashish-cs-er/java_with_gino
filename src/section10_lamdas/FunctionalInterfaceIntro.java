package section10_lamdas;

@FunctionalInterface
interface FuncInterface1{
	void display();
}

public class FunctionalInterfaceIntro implements FuncInterface1 {

	@Override
	public void display() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Functional Interface is an interface which can have only one abstract method");
		System.out.println("Func interface is also called SAM interface. Single Abstract Method");
		System.out.println("To avoid any logical error we create the interface and above it annotate it with @FunctionalInterface");
		System.out.println("The annotation is optional, but it avoids future logical errors");
		System.out.println("If we try to add future abstract methods in functional interface, if the interface is annotated, it will give compile time error");
		System.out.println("Why Func Interface");
		System.out.println("Func interface is a one which has one abstract methods and any number of default private and static methods");
		System.out.println("What if a class wanted to inherit only the abstract method of that interface?");
		System.out.println("This lead to intro of func prog in java since java 8");
		System.out.println("With func prog the focus is what is to be done and nt on how it is to be done");
		
	}

}
