package section6_packages;

//import on demand
import section6_packages.vegetable.*;
//single type import.It takes precedence over import on demand
import section6_packages.fruits.MyPapayaClass;

public class FruitAndVegetable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The same class MyPapaya belongs to Fruit and Vegetable package");
		System.out.println("In that that case, the more specific import is called");
		System.out.println("In our case it will be fruit papaya class as it is more declarative");
		System.out.println("We can also call main method of other class inside any class");
		MyPapayaClass.main(args);
	}

}
