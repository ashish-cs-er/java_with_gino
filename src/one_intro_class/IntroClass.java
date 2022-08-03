package one_intro_class;

public class IntroClass {

	//the only method that java recognizes is public static void main and which accepts an array of string arguments
	public static void main(String[] args) {
		System.out.println("The name of the file has to be the name of class which is having the main mehtod.");
		System.out.println("The file name should have extension of .java");
		System.out.println("After file is saved it has to be compiled to check for errors");
		System.out.println("If not in IDE,open terminal, type javac filename.java");
		System.out.println("Type java classname(not file name)");
		
		System.out.println("programs written in english are known as high level language");
		System.out.println("But system only understans m/c language");
		System.out.println("compiler converts high level language to byte code which is in .class file");
		System.out.println("the interpreter in jvmconverts this byte code tointerpreter");
		
		
		System.out.println("java says main method must have a return type void");
		System.out.println("if no name is given with class, Identifier expected error will come");
		System.out.println("public static and static public is same. but both should be present");
		System.out.println("if bytecode file is missing, noclassdeferror will come");
		
		int a4=1000000;
		int b4 = 1__00___000______0;
		System.out.println("Java compiler internally removes underscores from numbers");
		System.out.println("_ cannot be at the start or end. It has to be inbetween the numbers");
		System.out.println("The same applies to decimal numbers also. the underscore cannot be before . or after . ");
		System.out.println("It has to be between numbers");
		
		System.out.println("The correct order has to be 1.Package 2.Import 3.Class Declaration 4.Data and Behaviour");

	}

}
