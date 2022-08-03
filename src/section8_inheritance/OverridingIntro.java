package section8_inheritance;

public class OverridingIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Can only be done in instance methods. Does not apply for static methods");
		System.out.println("Arguments must remain the same");
		System.out.println("Should be done in Child class only");
		System.out.println("Return type will also matter and it has to be same or of co-variant type which is child type.");
		System.out.println("Private methods of parent class cannot be overridden");
		
		System.out.println("When we use override annotation, we are telling java that we are going to do function overriding");
		System.out.println("If we dont do overriding, compiler will give error");
		System.out.println("So basically this annotation is to remove any logical error");
		System.out.println("OVerriding annotation is not compulsory");
		
		System.out.println("signature has to be same in parent and child");
		
	}

}
