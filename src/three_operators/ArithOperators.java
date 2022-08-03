package three_operators;

public class ArithOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("used to perform arithmatic operations on data like + - / * and many more");
		int x=10,y=20;
		int add = x+y; //30
		int sub = x-y; //-10
		int mul = x*y; //200
		int div = x/y; //0
		int rem = x%y; //10 if we divide small by big, remainder is small number itself
		//the modulus opeartor takes sign of numerator
		char a='A'; //65
		char b = 'B'; //66
		int aPlusB = a+b;
		System.out.println("addition of ascii of chars is: "+aPlusB);
		int anotherAddWithChar = aPlusB+'5';
		System.out.println("Value of add of numbers is: "+anotherAddWithChar+" this will add 131+ the ascii of char 5");
		
		
		//lets go to compound operators
		x+=y;
		System.out.println("Value after compund operator is: "+x);
		
		//increment and decrement operators
		System.out.println("There are two forms of increment and dec operator");
		System.out.println("++x and x++");
		System.out.println("++x means value is first incremented and then used");
		System.out.println("x++, value is first used and then incremented");
		x=x++;
		System.out.println("Value of x is used: "+x); //prints 30
		
		int i,j=1,k=1;
		i= ++j + ++k;
		System.out.println("Value of i is: "+i); //prints 4
		i=j++ + k++;
		System.out.println("value of i with j=2 and k=2 is: "+i); //this will also print 4 because it has to use the value first and next time increment the value
		
		
		//Rules of arithmatic operators
		System.out.println("1. rule is if operation isperformed on small and large datatype the resultatnt data type is large one");
		int aNew= 10;
		float bNew = 3.44f;
		bNew = aNew+bNew;
		System.out.println("Value of resultant variable is: "+bNew);
				
		System.out.println("2. Rule is if an operation is performed on datatype smaller than int, the resultant data type will be treated as int");
		System.out.println("basically all operations arithmatic in nature having data type smaller than int will be treated as int");
		char c=21;
		int inta = c; //char to int and into to char happerns, but since char is smaller than int, so rule 2 comes into picture, char cannot be assigned to byte or short
		System.out.println("Value of inta is: "+inta);
		
		char chNew = 'A';
		System.out.println(chNew+1);//ascii of A is 65+1=66, as per rule 2 this is treated as int
		
		System.out.println("3. rule is the above two rules does not apply to compound opeartors and increment decrement operators");
		byte aNewByte = 5;
		aNewByte+=5;
		System.out.println("The value of aNewByte is: "+aNewByte);//this will output 10;
		
		char aNewChar = 'A';
		aNewChar = aNewChar++;
		System.out.println("value of aNewChar is: "+aNewChar);
		
		System.out.println("4. Rule is for arithmatic operations numbers must be in decimal number system. If they are not they are first converted to decimal number system");
		int aHexa = 0x2A;
		int bOctal = 056;
		int cBinary = 0b100;
		int dDecimal = 10;
		System.out.println("The resultant sum is: "+(aHexa+bOctal+cBinary+dDecimal));
		
		System.out.println("When + is used with numbers in print it performs addition");
		System.out.println("When a string is involved, it performs concatenation");
		System.out.println("+ will do addition till a string is not encountered in print. As soon as string comes, the next + will perform concat");
		System.out.println(2+2+4+" added but next will be concatenated: "+2+2+4); //8 added but next will be concatenated: 224
		System.out.println("If we want + to perform additon even after string comes, we have to pass the numbers in ()");
	}

}
