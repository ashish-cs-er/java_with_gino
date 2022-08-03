package control_statements;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//the syntax is
		//switch(var name)
		//{     
			//case possible value1: statements; break;
			//case possible value 2: statements; break;
			//default : statements; break;
		//}
		System.out.println("If break is not provided, default will also run");
		System.out.println("No logical difference between if else and switch case");
		System.out.println("1.Scability 2.Readibility ");
		
		System.out.println("Lets use command line arguments and switch case to print day of week");
		System.out.println("We may or may not use break with default or as the case may be, the last case of a switch case statement");
		System.out.println("The default case in itself is optional");
		System.out.println("default is like else of if-else statement. Only executed when no mathcing case found");
		System.out.println("Case keyword is not required with default");
		
		int day = 5;
		switch(day) {
			case 1: System.out.println("This is sunday"); break; 
			case 2: System.out.println("This is monday"); break;
			case 3: System.out.println("This is tuesday"); break;
			case 4: System.out.println("This is wednesday"); break;
			case 5: System.out.println("This is thursday"); break;
			case 6: System.out.println("This is friday"); break;
			default: System.out.println("This is saturday");  break;
		}
		
		System.out.println("default can be used anywhere inside switch block");
		System.out.println("Each case must have different value else compilation will fail");
		System.out.println("If a matching case is found but break is not there, all remaining cases will still get executecd irrespective of condition");
		int a=8;
		switch(a) {
			case 7: System.out.println("Hello 7"); //not matching hence not printed
			case 8: System.out.println("Hello 8"); //matching condition
			case 9: System.out.println("Hello 9"); //as break is not there in case 8 and it matches condition, it gets executed
			default: System.out.println("default"); //will print as break is not there after case 8
		}
		
		
		System.out.println("suppose I want to print some value for 1-4 and other for 5-8");
		int val = 7;
		switch(val) {
			case 1: 
			case 2:
			case 3:
			case 4: System.out.println("1-2-ka-4"); break;
			case 5:
			case 6:
			case 7:
			case 8: System.out.println("Printing 5-8"); break;
			default: System.out.println("I am in default");
		}
		
		System.out.println("What all can be provided to switch()");
		System.out.println("1. char, byte, short, int and their respective wrapper classes");
		System.out.println("2. enumerations");
		System.out.println("3. Strings");
		
		System.out.println("Instead of literal if a var is passed to case, compilation fails");
		System.out.println("switch(a=30) works fine. We can do assignment inside switch brackets");
		System.out.println("Only assignment is allowed not the declaration");
		int jk = 50;
		switch(jk=20) {
			case 50: System.out.println("I am 50"); break;
			case 20: System.out.println("I am 20"); break;
			default: System.out.println("I am nothing");
		}
		
		
		System.out.println("We can use final vars directly with case keyword, but the same should be declared and initialized in a single statement");
		System.out.println("What case can hold: Character literal, String literal, Integer literal, final var name(id declared and initialized in one line only)");
		final int con = 60;
		switch(50) {
			case con: System.out.println("This is final var case"); break;
			case 50: System.out.println("I am 50");
		}
			
	}

}
