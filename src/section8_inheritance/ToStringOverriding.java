package section8_inheritance;

public class ToStringOverriding {
	
	int num;
	String name;
	
	public String toString() {
		return "The object is: "+this.num+" "+this.name;
	}

	public static void main(String[] args) {
		ToStringOverriding to = new ToStringOverriding();
		to.num = 20;
		to.name = "Testing";
		// TODO Auto-generated method stub
		System.out.println("Object is: "+to); //this will return packageName.ClassName.refAddress
		System.out.println("Since every object by default extends Object class, the toString method is avaialbe with every class");
		System.out.println("This object class is present in java.lang package");
		System.out.println("Basically toString method is called once we write an object in SOPLN");
		System.out.println("toString() returns getClassName().getName()@Integer.toHexString(hashcode())");
		System.out.println("The toString() from Object class inherited by classes prints address of object not the object contents");
		System.out.println("so toString() can be overridden for printing our values inside object");
		System.out.println("By default the toString method in object class is public");
		System.out.println("So it has to be public in the all the classes as per inheritance rules");
		
		System.out.println("The object printed is: "+to);
	}

}
