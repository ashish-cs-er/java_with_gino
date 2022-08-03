package section8_inheritance;


class P{
	int a=10;
	
	public void printAofParent() {
		System.out.println("Coming from parent: "+a);
	}
}

public class VarHiding extends P {
	
	static int a=20;

	public void printAofChild() {
		System.out.println("Coming from Child: "+a);
	}
	
	public void printAOfSuper() {
		System.out.println("Coming from Child but used with super: "+super.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Var hiding happens when var of same datatype and name exist in both parent and child");
		System.out.println("It may be static or non static");
		
		//RULES
		System.out.println("1. If called by func of parent class, parent hidden used");
		System.out.println("2. If called by func of child class, child hidden used");
		System.out.println("3. If super is used, parent var will be called");
		VarHiding vh  = new VarHiding();
		vh.printAofParent();
		vh.printAofChild();
		vh.printAOfSuper();
		
		P p = new VarHiding();
		System.out.println("In var binding, only ref type is seen for calling appropriate variable: "+p.a);
		
	}

}
