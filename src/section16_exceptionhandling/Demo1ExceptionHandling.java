package section16_exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo1ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		i=8;
		j=2;
		k=0;
		
		int ar[] = new int[4];
		System.out.println("When assignment happens inside try block initialization should happen outside try block");
		try {
			System.out.println("The generic Exception block should be at last.");
			System.out.println("If we put Exception as the first catch, the other Exceptions becomes unreachable and compile time error is there");
			j = Integer.parseInt(br.readLine());
			System.out.println("I ran successfully");
			k=i/2;
			//As soon as the error is encountered, error is thrown, control goes to catch block
			for(int c=0;c<=4;c++) {
				ar[c] = c+1;
			}
			System.out.println("value of k is: "+k);
		}catch(ArithmeticException ae) {
			System.out.println("Present in java.lang package");
			System.out.println("Sub class of Exception and extends runtime exception");
			System.out.println("Run time exception extends exception. Exception extends Throwable class");
			System.out.println(ae.getMessage()); /// by zero
		}
		catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Index out of bounds: "+aiob.getMessage());
		}
		catch (NumberFormatException | IOException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Exception thrown is: "+e.getMessage());
		}
		finally {
			//generally used to close the resources used
			//br.close();
			System.out.println("I am always executed");
		}
		
		
				
		
		
		
		
	}

}
