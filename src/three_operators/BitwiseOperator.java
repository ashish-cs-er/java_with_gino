package three_operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("used to perform operations on binary numbers");
		System.out.println("If we convert bitwise opearators on non binary numbers, those numbers are first converted to binary numbers and then operation is performed on them");
		System.out.println("Bitwise And &");
		System.out.println("Bitwise and is very similar to logical and. Infact its working is also same");
		System.out.println("Just in place of true or false we use 0 and 1");
		
		System.out.println("Bitwise OR |");
		System.out.println("Works exactly like logical OR");
		System.out.println("Given 0 only when all bits are 0");
		
		System.out.println("Bitwise XOR totally same as logical XOR");
		System.out.println("Returns 0 when both values are same");
		
		System.out.println("Bitwise Not: ~");
		System.out.println("Bitwise not ~ is different than logical not !");
		System.out.println("!(0)=1");
		
		
		System.out.println("Bitwise left shift operator: <<.");
		System.out.println("All it does is shift all bits to left");
		System.out.println("Lets left shift 8 by 1");
		System.out.println("First convert 8 to binary: 0b1000");
		System.out.println("so left shifting by 1 means: 0b10000. another 0 at the end will come");
		System.out.println("Each left shift multiply the number by the power of left shift required. A<<N = a*2^N");
		//8<<1 = 8*2^1, 8<<2 = 8*2^2, 8<<3 = 8*2^3
		
		System.out.println("Bitwise Right Shift Operator: >>");
		System.out.println("The last bit is eliminated");
		int rightShift8 = 8>>1;
		System.out.println("rightShift8 is: "+rightShift8);
		int bitwiseLeftShift = 8<<1;
		System.out.println("bitwiseLeftShift of 8 is: "+bitwiseLeftShift);
		System.out.println("Each right shift divives the number by power of 2");
		System.out.println("A>>N = A/2^N");
		
		
		int x=7,y=5;
		//this is bitwise and
		//the 7 and 5 are first converted to binary numbers
		//7=111
		//5=101
		//comparing number below number, 1&1=1, 1&0=0, 1&1=1
		//resultant number= 101 which is then converted to decimal number = 4+0+1=5
		System.out.println("x&y is: "+(x&y)); //output will be 5
		System.out.println("x|y is: "+(x|y)); //output will be 7
		System.out.println("x^y is: "+(x^y));//outputs 2
		System.out.println("~x is: "+(~x));//101->010->in decimal = 2
	}

}
