package section10_lamdas;

@FunctionalInterface
interface A22{
	void abstractMethod(int age);
}

public class LocalVarsInLamdas {

	int instanceVar=100;
	static int staticVar=200;
	
	public void setValues(int localVar1) {
		int localVar2 = 400;
		
		//if the below statements are executed, the effectively final condition will be remvoed and error will be there
		//localVar1++;
		//localVar2++;
		//this effectively final rule only applies to local vars passed as parameters to lamda, or local vars created outside lamda inside method of class
		A22 aRef= (localVar3) ->{
			localVar3++;
			System.out.println(localVar1);
			System.out.println(localVar2);
			System.out.println(localVar3);
			instanceVar++;
			System.out.println(instanceVar);
		};
		aRef.abstractMethod(25);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Not all the local vars in lamdas scope can be used for manipulation");
		System.out.println("Either vars should be final, or effectively final");
		System.out.println("Effectively final means after assignment, the values of vars are never changed");
		new LocalVarsInLamdas().setValues(300);
		System.out.println("The rule of final and effectively final only applies to localvars");
		System.out.println("Instance var and static var are not in this scope of effectively final");
		
	}

}
