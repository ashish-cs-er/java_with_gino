package section5_classes_objects;

class A{
	int age;
}

public class PassingRef {

	public void setAge(A a) {
		a.age = 20;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aObj = new A();
		aObj.age=40;
		PassingRef pr = new PassingRef();
		System.out.println("value of age before change is: "+aObj.age);
		pr.setAge(aObj);
		System.out.println("value of age after change is: "+aObj.age);
		//for primitives its pass by value
		//for references its pass by ref
	}

}
