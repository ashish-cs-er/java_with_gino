package control_statements;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Used to repeatedly perform some task");

		//sysntax is:
		//while(boolean condition){
			//statements
			//increment decrement operators
		//}
		
		System.out.println("If there is just one statement to be executed with while loop, curly braces are not required");
		System.out.println("While brackets can only accept either boolean condition or boolean assignment");
		//using while loop to sum numbers 10 to 15;
		int counter = 10;
		int sum=0;
		while(counter<16) {
			sum+=counter;
			counter++;
		}
		System.out.println("Value of sum is: "+sum);
		
		System.out.println("There is a difference between wh1le(2<3) and while(var < 3)");
		System.out.println("In the first case compilation error, in second case run time error will be there");
		System.out.println("If we put a ; after while loop, it runs endlessly if condition is true. The code runs but nothing is displayed on console");
		
	}

}
