package section10_lamdas;


@FunctionalInterface
interface FuncInter1{
	public void abstractMethod();
}

@FunctionalInterface
interface FuncInter2{
	public String abstractMethod();
}

@FunctionalInterface
interface FuncInter3{
	public String abstractMethod();
}

public class LamdaBody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This explains abt the four different ways of providing body to lamdas");
		System.out.println("Type 1: return type is void and single statement");
		FuncInter1 fi1 = () -> System.out.println("Hello There"); //see curly braces removed as only one statement involved
		System.out.println("If only one statement is involved, curly braces are removed");
		fi1.abstractMethod();
		System.out.println("Type 2: return type is not void and single statement");
		//with curly braces
		FuncInter2 f21 = ()-> {return "I return a String";};
		//without curly braces, automatically returned
		FuncInter2 f22 = () -> "hi";
		System.out.println(f21.abstractMethod());
		System.out.println(f22.abstractMethod());
		
		System.out.println("Type 3: Multiple statements, return type void or not void");
		System.out.println("The shorted syntax does not work.");
		System.out.println("Culry braces will be requd and return keyword in case function returns something will also be rquired");
		
		FuncInter3 f31 = () -> {
			System.out.println("I am from multiple statement and return type String. Type no 3");
			return "See me having a return for FuncInter3";
		};
		String s = f31.abstractMethod();
		System.out.println("The returned value is: "+s);
		
	}

}
