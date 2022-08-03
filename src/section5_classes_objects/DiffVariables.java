package section5_classes_objects;

public class DiffVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Local variables: Created inside loops, functions");
		System.out.println("They are of two types, primitive and reference");
		System.out.println("Unlike instance vars, local variables do not get initialized by themselves");
		System.out.println("Compilation fails if used without initialization");
		System.out.println("The value null cannot be assigned to primitive data type. Compilation will fail if tried");
		
		System.out.println("2. Instance variables");
		System.out.println("Created outside functions but inside class");
		System.out.println("Again these are also of two types, primitive and reference");
		System.out.println("Ref var is a var whose data type is class or interface. String has a ref variables.");
		System.out.println("Default value of instance ref var is null");
		System.out.println("Default values of instance primitive var is as follows");
		System.out.println("Instance var can be used directly or with this keyword.");
		System.out.println("Where instance and local var have same name, its better to use this keyword");
		
		//byte: 0, short:0 , int:0, long: 0L, float: 0.0f, double: 0.0
		//char: \\u0000
		//booloean: false
		
		
		System.out.println("Ref var are used to refer to properties and objects of class. Primitives cannot do that");
		
	}

}
