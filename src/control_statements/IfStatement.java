package control_statements;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Used to check whether a condition is true or false");
		int a = 5;
		
		//IF STATEMENT
		System.out.println("inside the brackets () either boolean condition can be provided");
		System.out.println("Or a boolean variable can be used like true or false");
		System.out.println("Even assignment will also work");
		System.out.println("But we cannot use declaration inside if brackets");
		
		if(10>5) System.out.println("Yes 10> 5");
		
		boolean b = true;
		if(b) System.out.println("Boolean b holds true value");
		
		System.out.println("The code below in comments will produce compilation error");
		//if(boolean b=true) this is incorrect since we are declaring variable inside if brackets
		
		a=20;
		System.out.println("if(a) will fail because only boolean condition or variable can be used in if");
		//if(a) System.out.println("Hello There");
		
		//assignment of values to boolean var is allowed and hence below code will work
		System.out.println("Only boolean vars can be assigned values inside if block ()");
		if(b=true) System.out.println("B is true");
		
		if(a<6) {
			System.out.println("I am executed because i is less than 5. Hence True");
		}
		
		System.out.println("Curly braces can be eliminated if there is only one statement involved with if or else block");
		System.out.println("But if there are more than one statements, curly braces cannot be eliminated");
		System.out.println("Check below code");
		if(a<5)
			System.out.println("a less than 5");
		
		System.out.println("There is an extension of if statement, which is if else");

		//IF ELSE
		System.out.println("Used to execute when if statement is false");
		a=30;
		if(a>50)
			System.out.println("A is greateer than 50");
		else
			System.out.println("a is less than 50");
		
		//else if ladder
		System.out.println("Used to check for more than one condition. For more than two cases to handle");
		a=50;
		if(a>50)
			System.out.println("a is greater than 50");
		else if(a>100)
			System.out.println("a is greater than 100");
		else
			System.out.println("a is less than 50"); 
		
		System.out.println("Compilation error will come if the else if ladder contains anything in between");
		
		
		//neseted if else
		System.out.println("writing if else inside if else is called nested if else");
		a=60;
		if(a>50) {
			if(a>60) System.out.println("a is greater than 60");
			else if(a==60) System.out.println("a is equals to 60");
			else System.out.println("a is greater than 50 but less than 60");
		}
	}

}
