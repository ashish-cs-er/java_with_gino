package section5_classes_objects;

public class InstanceMethods {

	public void display1() {
		System.out.println("I am display 1");
		//instance method calling instance method
		display2();
		//or this.display2();
	}
	
	public void display2() {
		System.out.println("I am from display 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Any method that has static keyword is called static method");
		System.out.println("Any method without static keyword is instance methods");
		
		System.out.println("We can call instance method, either from instance method or from static methood");
		System.out.println("we can use non static methods inside static mehtods");
		
		
		System.out.println("Lets call instance method from another instance method");
		InstanceMethods im = new InstanceMethods();
		im.display1();
		
		//calling instance method from static method
		//like in main, we need to create object inside static method to call the instance method
		//only one way is possible
		
	}

}
