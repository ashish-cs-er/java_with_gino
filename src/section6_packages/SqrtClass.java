package section6_packages;

public class SqrtClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lets calculate sqrt of 81
		
		//class Math is present in java.lang package
		
		int a=81;
		System.out.println("Sqrt of 81 is: "+Math.sqrt(a));
		System.out.println("Because Math ispresent in java.lang package, and java.lang is automatically imported in every file, there is no need for static import");
		
	}

}
