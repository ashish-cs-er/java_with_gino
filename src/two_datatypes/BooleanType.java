package two_datatypes;

public class BooleanType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Generally used to check whether condition is true or false");
		System.out.println("It can only accept two values true or false");
		
		boolean b1 = true;
		boolean b2 = false;
		//there are only two boolean values true and false and in lowercase
		//if used in capital case, compilation fails
		boolean b3 = 10>20;
		System.out.println("values of booleans are: "+b1+" "+b2+ " "+b3);
		
		//boolean b = 'false': compilation fails because of single quotes
		
	}

}
