package two_datatypes;

public class NumberSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A number system is a way to express numbers");
		System.out.println("we can express numbers is four systems in java, number, octal, hexadecimal, binary");
		
		System.out.println("Lets focus on decimal number system");
		System.out.println("Its completely different from decimal numbers");
		System.out.println("It includes numbers from 0-9");
		System.out.println(56);
		System.out.println("This will print 56 as per decimal number system");
		
		System.out.println("Lets focus on OCTAL");
		System.out.println("Begins from 0 and can take numbers from 0-7");
		System.out.println("if i use 097 in octal it will not compile as 9 is not allowed");
		System.out.println(043);
		System.out.println("This starts from right most side, with each number multiplied with 8 raise to power 0 then 8 raise to power 1 and 8 raise to power 2 like this");
		System.out.println("3*8^0+4*8^1+0*8^2=3+32+0=35");
		System.out.println("Internal conversion will happen from octal to decimal");
		
		
		System.out.println("Lets move to hexadecimal number system");
		System.out.println("Begin with prefix 0X or 0x i,e uppercase or lowercase");
		System.out.println("Digits allowed are 0-9, A-F, a-f");
		System.out.println("Why a-f: 0-9 can be referenced directly but what about 10-15");
		System.out.println("a-10, b-11, c-12, d-13, e-14, f-15. It can be lowercase or uppercase");
		System.out.println("0X8g will not compile as g is outside the allowed letters");
		System.out.println(0xc4);
		System.out.println("Start with right most number, keep multiplying with 16^0, 16^1 and so on");
		System.out.println("4*16^0+12*16^1=4+192=196");
		
		System.out.println("Lets c Binary number system");
		System.out.println("Starts with 0b or 0B");
		System.out.println("digits allowed are 0 amd 1 only");
		System.out.println("0b102: this will not compile as 2 is not allowed in binary");
		System.out.println(0b11001);
		System.out.println("Start with right most digit: multiply with 2^0, 2^1 and so on");
		System.out.println("1*2^0+0*2^1+0*2^2+1*2^3+1*2^4=1+0+0+8+16=25");
		
	}

}
