package section16_exceptionhandling;

public class ExceptionIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exceptio we can handle but errors cannot be handled");
		System.out.println("Programs terminates on error but can continue on exception");
		System.out.println("We have to identity critical statements which might generate error");
		System.out.println("These statements have to be put inside a block");
		System.out.println("This can be a try catch block");
		System.out.println("Try will throw the exception, catch will catch that exception");
		System.out.println("There can be multiple catch for one try");
		System.out.println("But Exception is the parent class of all the exceptions");
		System.out.println("Throwable class is also used to handle exceptions");
		System.out.println("This throwable class is extended by Exception and Error class in java");
		System.out.println("Exceptions are of two types, checked and unchecked");
		System.out.println("Checked is when IDE tells error is there");
		System.out.println("Checked is when IDE cannot tell error is there. Basically runtime exception");
		
		System.out.println("There is a finally block with try catch which is optional");
		System.out.println("Does not matter if try ran or catch ran, finally will always be run");
		
		System.out.println("Whereas try catch is used to handle exceptions, throws is used to supress the exception");
		System.out.println("Manually throwing error: throw new Exception()");
		System.out.println("We can even extend the Exception class and create our own exceptions");
		
		
	}

}
