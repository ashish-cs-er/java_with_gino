package section11_func_interfaces;

import java.util.function.*;

public class PredFuncInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lets discuss Predicate<T> functional interface");
		System.out.println("Availble in package java.util.function. Needs to be imported");
		System.out.println("Has one abstract method test(T t)");
		System.out.println("takes one argument of type T");
		System.out.println("By default T is treated as Object type");
		
		//SOlution 1; specify data type of argument
		Predicate p1 = y -> (Integer)y>10;
		
		//Solution 2: Specify data type with Predicate
		Predicate<Integer> p2 = y -> y>10;
		System.out.println(p2.test(4));
		
		
	}

}
