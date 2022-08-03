package section16_exceptionhandling;

class MyExceptionClass extends Exception{
	MyExceptionClass(String msg){
		super(msg);
	}
}

public class ExceptionUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		try {
		if(i<10) {
			throw new MyExceptionClass("Value less than 10");
		}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
