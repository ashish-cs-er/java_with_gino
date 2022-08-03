package section5_classes_objects;

public class StaticCalling {

	static void displaySameStatic() {
		System.out.println("Hello I am in display of static same");
	}
	public void displaySameInstance() {
		System.out.println("Hello I am in display of instance same");
		displaySameStatic();
		// OR StaticCalling.displaySameStatic();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lets see how to call static methods");
		System.out.println("Any method that has static in its signature is called static method");
		StaticCalling sc= new StaticCalling();
		sc.displaySameInstance();
	}

}
