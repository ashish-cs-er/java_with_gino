package section8_inheritance;

class Emp{
	int hno;
	String name;
}

class Manager extends Emp{
	String dept;
}


public class IsARelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Every Manager is a Emp but every emp is not a Mgr");
		System.out.println("So every child class is having a is a relationship with the parent class");
		System.out.println("When we say Apple is a Fruit");
		System.out.println("This means Apple is Child of Fruit Class and is having a IS-A Relation");
		
	}

}
