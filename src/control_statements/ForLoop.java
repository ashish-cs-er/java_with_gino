package control_statements;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("There are three parts of for loop");
		System.out.println("for(initialize;condition;iteration)");
		System.out.println("Variables of same data type only can be used in initialization part. More than one is also allowed");
		System.out.println("All the three parts of loop can be omitted. And then if we just give the condition part, endless loop keeps executing");
		System.out.println("Even if dont specify any condition in for loop, by default it is considered true");
		System.out.println("But this only applied to for loop only");
		
		//for(;;) this is also an endless loop
		//below is an example of endless loop 
		//where only condition part is given which is true, so the loop keeps repeating
		//for(;true;){System.out.println("Hello");}
		
		//program to add numbers 10-15 using for loop
		int a=10,sum=0;
		for(a=10;a<16;a++) {
			sum = sum+a;
		}
		System.out.println("Sum of numbers is: "+sum);
		
		System.out.println("The below for loop is perfectly valid");
		//same type of variables more than can be initialized and incremented
		
		for(int i=1,j=3; i<2; i++,j--) {
			System.out.print("a= "+i);
			System.out.println(" &b= "+j);
		}
		
	}

}
