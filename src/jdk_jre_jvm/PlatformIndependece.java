package jdk_jre_jvm;

public class PlatformIndependece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java programs are written for JVM and not CPU");
		System.out.println("The bytecode makes it possible to run java programs across multiple platforms");
		System.out.println("The .class compiled file can be placed on any m/c having JRE or JDK and then run");
		
		System.out.println("JVM consists of below components");
		System.out.println("ClassLoader, BytecodeVerifier, Runtime memory areas, Interpretter and JIT compiler");
		System.out.println("Runtime area is memory area of JVM and includes mermory like heap, stack etc");
		System.out.println("It also holds PC register which contains the address of next instruction to be fired from the bytecode");
		System.out.println("Lets go to the Interpreter");
		System.out.println("Interpreter will go to PC register and fetch the address of the next instrution to be fired");
		System.out.println("It will read the inst from bytecode, convert the inst to byte code and wait for CPU");
		System.out.println("This cycle will repeat again and again until whole java program is run");
		
		System.out.println("JAVA is smart. Suppose same inst is present multiple times.");
		System.out.println("Interpreter will waste time again and again to transform the same to m/c code");
		System.out.println("m/c of inst should be generated only once and every other repetition of inst should be used from prev generated m/c code");
		System.out.println("This thing is handler by JIT compiler");
		
		System.out.println("Every time we run any command using java command, a new JVM is created");
		System.out.println("Each JVM has a id using which it can be identified");
		System.out.println("JVM is not platform independent. Its the bytecode verifier which is platform independent");
		
		
		
	}

}
