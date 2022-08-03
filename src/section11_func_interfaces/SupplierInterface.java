package section11_func_interfaces;

import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Available in java.util.function");
		System.out.println("Abstract function is: T get()");
		System.out.println("Used to generate output without taking any input");
		
		//lets check
		Supplier<String> s = () -> new String();
	}

}
