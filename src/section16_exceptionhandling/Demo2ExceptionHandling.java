package section16_exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Demo2ExceptionHandling {

	public static void main(String[] args) throws Exception {
		
		System.out.println("We will discuss try with resources");
		System.out.println("Lets take a stirng from user");
		
		String str = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			str = br.readLine();
		}catch(Exception e) {
			System.out.println("Message is: "+e.getMessage());
		}
		finally {
			br.close();
		}
		
		
		//lets c try with resources
		//this will automatically close the resource
		System.out.println("Try with resources was introduced in java 1.7");
		try(BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in))) {
			str = br.readLine();
		}
	}

}
