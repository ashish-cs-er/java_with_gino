package section5_classes_objects;

public class ClassIntro {

	public static void main(String args[]) {
		System.out.println("Java is Object Oriented language");
		System.out.println("Describes properties and behaviour of objects in general");
		System.out.println("Properties are instance variables");
		System.out.println("Behaviour is instance mehtods");
		System.out.println("Like a Car it has color, brand, category. These are properties");
		System.out.println("The Car will start, it will stop, it should get serviced for repairs these are methods known as behaviour");
		System.out.println("Behaviour is different actions that can be performed on object");
		System.out.println("Its like blueprint. But this has to be implemented");
		
		
		System.out.println("To extract benefits of the class, we create objects.");
		System.out.println("Objects are created in heap of JVM");
		
		System.out.println("How to create objects of class");
		//first method
		ClassIntro ci = new ClassIntro();
		System.out.println("ci in above statement is ref variable. Initially it points to null, but as soon as it is assigned an object, it points to memory location where object is saved in heap");
		
	}
}
