package section10_lamdas;


@FunctionalInterface
interface ConsRefInterface{
	public void method1();
}

public class ConstRef {

	ConstRef(){
		System.out.println("I have been called");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("When an abstract method of interface is called by object of class, the const is called when we use new() opeartor");
		System.out.println("in lamda the const can directly be called, rather than creating object");
		System.out.println("This is known as Const Ref");
		System.out.println("Lets c in action");
		
		//syntax :: Classname :: new
		//its like Method Ref, the difference beting const is called in place of Method
		//arguments must be same as arguments of abstract method in interface
		//that const which matches the arguments will be invoked
		ConsRefInterface crf1 =  ConstRef :: new;
		crf1.method1();
	}

}
