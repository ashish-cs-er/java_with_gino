package section7;

public class ConstChaining {

	int x,y;
	
	ConstChaining(){
		this.x = 100;
		this.y = 100;
		System.out.println("default const: "+this.x+" "+this.y);
	}
	
	ConstChaining(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("two args const: "+this.x+" "+this.y);
	}
	
	ConstChaining(int x){
		this(x, 200);
		System.out.println("single arg const: "+this.x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is abt const chaining");
		
		//lets see the action
		System.out.println("Our goal is to call the constructor with two arguments");
		ConstChaining cc = new ConstChaining(500);
		
		System.out.println("default values set by const are: "+cc.x+" "+cc.y);
	}

}
