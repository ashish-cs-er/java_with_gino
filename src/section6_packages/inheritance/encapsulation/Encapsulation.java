package section6_packages.inheritance.encapsulation;

class B{
	private int i;
	private String name;
	
	public void setInt(int i) {
		this.i = i;
	}
	public int getInt() {
		return this.i;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void display() {
		System.out.println("I am displayed");
	}
}


public class Encapsulation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a method to protect data of class from unwanted or illegal modification by another class");
		System.out.println("No one should directly use the variables directly");
		System.out.println("Make all the vars private, access them through getter and setter public methods");
		System.out.println("If we directly get value of i and name it will result in error");
		
		System.out.println("Encapsulation is also to ensure that value of pvt field is being seen by authorized user and not by anyone");
		
	}

}
