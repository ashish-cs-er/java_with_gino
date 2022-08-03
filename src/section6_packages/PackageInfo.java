package section6_packages;

public class PackageInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Classes that perform similar function are grouped together into packages");
		System.out.println("Must be the first line of every java program");
		System.out.println("package keyword is to be used");
		System.out.println("com/java/calculate should be written as com.java.calculate");
		System.out.println("Comments can be written before package keyword");
		System.out.println("This folder structure of packages is not compulsory for .java files but for .class files only");
		System.out.println("set current directory to one level above the package");
		System.out.println("packagename.classname is called fully classified class name");
		System.out.println("When a file is inside a package, it cannot be directly run with java command, we have to use FQCN");
		System.out.println("you have to be one level up the package directory to run the file with java FQCN command");
		
		System.out.println("suppose we are not using eclipse, just plain notepad is there");
		System.out.println("There is a scenario that our .java and .class files reside in different folders.");
		System.out.println("Post javac command, .class file will be generated and stored in the same folder where .java file resides");
		System.out.println("And then we have to create package dir, copy the .class file there so that run time error is not there");
		System.out.println("There exists a solution to this issue, using -d with the javac command");
		System.out.println("javac -d \"D:/drive/folder filename.java\"");
		System.out.println("The above command will automatically also create the package folders and place the .class file there");
		System.out.println("But this runs only if the path exists");
		System.out.println("If the path does not exist, compilation fails with error, directory not found");
		
		
		System.out.println("Any class declared without package has undefined package");
		System.out.println("The package name if not given is same as class name");
		System.out.println("Suppose there is any a.b package and class A class exists in package a and B class exists in package b");
		System.out.println("Just importing a.* will not import the b package classes. Means packages are not recursive with import");
		System.out.println("If files are in different packages, either we use FQCN to use the other file, or use static imports");
		
		System.out.println("Common inbuilt packages are as follows:");
		System.out.println("java.util: utility functions. FIrst has to be imported");
		System.out.println("java.io: for input output operations. has to be imported");
		System.out.println("java.lang: related to java language. No need to import, available by default");
		System.out.println("Object class is present in java.lang. system.out.println is also present in java.lang");
		
		
		
		
		
	}

}
