package two_datatypes;

public class VarsAndConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is reagarding variables and constants");
		System.out.println("Variables");
		System.out.println("Used to store data");
		System.out.println("There are two steps to create variables");
		System.out.println("Declare variable: specifying the data type and giving it an identifier");
		int a;
		String name;
		System.out.println("We can do declaration and instantiation in one stage");
		int b=20;
		System.out.println("data of same type can be declared in one line");
		int i,j;
		System.out.println("But int i, int j in one line will not work. int i,j is the correct way");
		System.out.println("The below code is also valid");
		int a1=10, b1,c1=20;
		int a2; int b2; //this will work
		
		System.out.println("Constants");
		System.out.println("Variables whose values cannot change");
		System.out.println("declared using final keyword with variables");
		System.out.println("If we change value, compilation fails");
		System.out.println("convention is to use uppercase for constants");
		
		final float PI = 3.14f;
		
	}

}
