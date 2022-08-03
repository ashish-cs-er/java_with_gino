package section10_lamdas;

@FunctionalInterface
interface VoidFuncInterface{
	public void abstractMethod();
}
public class VoidComaptiableLamdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This class is about void compatiable lamdas");
		System.out.println("The functions having return type of void can have statement expressions also");
		System.out.println("Valid statement expression are: assignment, inc-dec, func call, object creation");
		System.out.println("Void compatible lamdas are those which have void abstract method in the functional interface");
		VoidFuncInterface vf11 = () -> {
			new VoidComaptiableLamdas().display();
		};
		vf11.abstractMethod(); //since abstract method is void, object creation is valid statement exp, and again, void method is called in lamda, this is totally legal
		//if a void abstractMethod is implemened in lamda and a non void method is called, return type is ignored
	}
	
	public void display() {
		System.out.println("I am instance method display of Class");
	}

}
