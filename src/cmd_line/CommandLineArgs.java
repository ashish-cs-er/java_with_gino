package cmd_line;

public class CommandLineArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Command line arguments are the dynamic values user provides as input to the program");
		System.out.println("Command line arguments are specified after the class name");
		System.out.println("like java classname 20,30");
		System.out.println("Command line arguments are always of String data type");
		System.out.println("The args present in main method is having the arguments like args[0], args[1]");
		
		int i= Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		
		double j1 = Integer.parseInt(args[1]);
		System.out.println("Sum is: "+(i+j));
		System.out.println("Value is: "+j1);
		
		//run this program using run conf and provide command line arguments
		System.out.println("If we specify lesser number of arguments and use more in program, ArrayIndexOutOfBoundsException will occur");
		
	}

}
