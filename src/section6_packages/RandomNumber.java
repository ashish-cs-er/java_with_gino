package section6_packages;
import java.util.Random;
public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lets create a random number from 1-10");
		System.out.println("java.util package has one class named Random that can do the task for us");
		System.out.println("leta first import the random class from java.util package");
		Random r = new Random();
		System.out.println("The random number is: "+r.nextInt(10));
		System.out.println("If we dont pass any args to nextInt, any default value whether signed or not, may be returned");
		
	
	}

}
