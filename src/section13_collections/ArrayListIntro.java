package section13_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Its very similar to Arrays");
		System.out.println("Uses index to add or remove elements");
		System.out.println("it starts at 0 index like arrays");
		System.out.println("It can grow or shrink automatically as needed");
		System.out.println("This class ArrayList implements List interface which itself implements Collection Interface");
		
		Collection<Integer> c1 = new ArrayList<>(); //created to use Collection interface methods
		List<Integer> c2 = new ArrayList<>(); //created to use List interface methods(Collection+List)
		
		
		//Methods
		//1. add(int index, Object o); returns boolean
		System.out.println("The add of Collection adds to the end of List");
		System.out.println("But the add of List interface can add at a specified index and the other elements are shifted accordingly by JAVA");
		//add(int index, Object o)
		c2.add(10);c2.add(20);c2.add(30);c2.add(40);
		System.out.println(c2);		
		c2.add(2, 100);
		System.out.println(c2); //[10, 20, 100, 30, 40]
		System.out.println("If index either less than 0 or greater than list IndexOutOfBoundException is thrown");
		
		//set(int index, E element)
		System.out.println("used to modify element at specified index. Update");
		System.out.println("Set cannot be called on empty list");
		c2.set(1, 65);
		System.out.println("The new list is: "+c2);
		
		//replaceAll(UnaryOperator)
		//Abstract method of unary operator is apply()
		//we need to provide lamda for the body of apply()
		c2.replaceAll(x->x*2);
		System.out.println("The newly modified list is: "+c2);
		
		
		//get method: get(int index): fetches data present at a particular index
		System.out.println(c2.get(2));
		System.out.println("If index more than size: java.lang.IndexOutOfBoundsException error is given");
		
		
		//remove(int index): removes data present at a particular index, other elements are re-arranged accordingly
		c2.remove(2);
		System.out.println("The list after removal is: "+c2);
		//remove(Object o): this is remove method of collection which searches the data and then rmoves it.
		//but we cannot pass primitive to it, it will require object
		Integer i = new Integer(20);
		c2.remove(i);
		System.out.println("After removing element with collection's rmove the data is: "+c2);
		
		
		
		
		
		
		
	}

}
