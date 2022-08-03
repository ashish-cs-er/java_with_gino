package three_operators;

public class BooleanOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lets talk about the Logical Operators");
		System.out.println("Why do we need them. Sometimes using relation operators is not enough");
		System.out.println("These are used to combine multiple relational opeartors");
		System.out.println("these are and(logical and short circuit), or, not, nor");
		System.out.println("Whats the difference between logical and short circuit");
		System.out.println("As soon as results is evident, short circuit breaks and no further check is performed and result is produced for consuming");
		System.out.println("Whereas in logical operator, even though result has been obtained, it will still follow the complete cycle and perform the requested opearation,comparison");
		System.out.println("this logical and short circuit is present for both and and OR operator");
		//&, &&, |,||, !, ?
		System.out.println("So always prefer short circuit operator");
		System.out.println("Both true and false have to be provided. i,e for every ? : has to be there");
		int tm = 8;
		boolean amPm = tm<12 ? true : false;
		System.out.println("Lets check boolean value: "+amPm);
		
		int x=10,y=20,z=30;
		System.out.println(x<y&y>z); //outputs false(we are using logical opearator)
		System.out.println(x<y & ++y>z); //outputs false as ++y=21>30 will be false\
		System.out.println(y); //after ++y in & operator, value of y becomes 21
		int k = y++;
		System.out.println(k);
		System.out.println(y);
		
		//
		System.out.println("Lets use Not and Xor(opposite of OR except false false condition)");
		System.out.println(!(x<y) ^ ++y>z); //x<y is true, !true is false, ++y>z is false, false XOR false is false and hence the output
		
		
		
	}

}
