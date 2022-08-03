package control_statements;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("syntax is as follows");
		
		//do{
			//statements
			//breaking condition
		//}while(boolean condition);
		
		System.out.println("Difference between do while and while loop is that the do-while loop will execute atleast once");
		
		//lets write the program
		//sum numbers from 10-15
		int a=10;
		int sum=0;
		do {
			sum = sum+a;
			a++;
		}while(a<16);
		
		System.out.println("The sum with do-while is: "+sum);
	}

}
