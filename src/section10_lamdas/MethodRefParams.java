package section10_lamdas;

@FunctionalInterface
interface CheckFunction{
	public String abstractMethod(MethodRefParams m);
}

@FunctionalInterface
interface CheckFunction2{
	public String abstractMethod(MethodRefParams m, int a, int b);
}

public class MethodRefParams {

	public String hiMe() {
		return "This is instance mehtod of class";
	}
	
	public String hiMewithParams(int a, int b) {
		return "This is instance mehtod of class: "+a+" "+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is about Method ref with parameters");
		System.out.println("Often a times, functional interface is avaialle but objects are created at runtime");
		System.out.println("In that case we dont have that object ref");
		System.out.println("Java allows us to call instance methods using class name also");
		System.out.println("But you need to provide run time obj also");
		
		System.out.println("Same can be applied in MethodRef with parameters");
		System.out.println("Instance is passed as parameter to Functional Interface at run time");
		CheckFunction cf1 = MethodRefParams :: hiMe;
		MethodRefParams mrp = new MethodRefParams();
		String sp = cf1.abstractMethod(mrp);
		System.out.println("The output is: "+sp);
		System.out.println("In this case, its imp to pass instance of class to abstract method of interface");
		
		//function with non void return type and multiple parameters with Object not available till run time
		CheckFunction2 cf2 = MethodRefParams::hiMewithParams;
		//the hiMewithParams has to contain same number of parameters just the object ref is to be ignored while defining the func
		String s3 = cf2.abstractMethod(mrp, 4, 40);
		System.out.println("String returned is: "+s3);
		
	}

}
