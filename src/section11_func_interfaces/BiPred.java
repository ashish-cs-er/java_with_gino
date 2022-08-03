package section11_func_interfaces;
import java.util.function.BiPredicate;
public class BiPred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Available inside java.util.function package");
		System.out.println("Has to be imported before using");
		System.out.println("Its abstract method is test(T t, U u)");
		
		BiPredicate<String, String> bp1 = (x,y) -> {return x.equals(y);};
		System.out.println("Test equality: "+bp1.test("Hello","Hello"));
		
		BiPredicate<String, String> bp2 = String :: equals;
		System.out.println(bp2.test("Hi", "Hi"));
	}

}
