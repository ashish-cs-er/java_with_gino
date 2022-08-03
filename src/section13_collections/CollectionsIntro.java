package section13_collections;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Iterator;

public class CollectionsIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("When Array is there, why did java provide us with Collection framework??");
		System.out.println("THe size of Collection is not fixed unlike array. Java programmer does not have to worry about size");
		System.out.println("Manual work in Arrays whereas, ready to use methods in Collections");
		System.out.println("Arrays can hold primitives as well as objects. But collections can hold only Objects");
		
		
		System.out.println("Collection Framework consists of Interface called Collection");
		System.out.println("There are three interfaces which implement this which are: 1. LIst 2. Set 3. Queue");
		System.out.println("There is another interface present in Collection but it does not inherit Collection interface 4. Map");
		
		System.out.println("Each of these four interfaces List, Set, Queue, Map have certain child classes which contain concrete implementation of these interfaces");
		System.out.println("The collection framework is availabel in java.util package");
		
		
		//<>Diamond Notation
		System.out.println("After java 7 <> notation can be allowed");
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<>();  //diamond notation, we did not specityf the type on right side
		
		//but using var and Diamond Notation should be avoided because we are not specifying data type anywhere
		//and if we dont specify data type anywhere it is treated as Object data type
		var abc = new ArrayList<String>();
		
		System.out.println("Writing Generics is not compulsory. If we dont provide the type, It will be treated as Object type");
		ArrayList list = new ArrayList(); //this is totally fine
		//Diamond Notation has to be on right side. On left side it may generate error
		
		//even if we specify generics on any side, it will work
		
		
		
		//Important methods of Collection Interface
		//avaialble in every class and interface that inherits collection interface
		//add(E e) : return type is boolean
		Collection<Integer> c = new ArrayList<>();
		c.add(10); c.add(20); c.add(30);
		System.out.println("Any collection when printed will be printed in [] in SOPLN");
		System.out.println("Lets print Collection: "+c);
		System.out.println(c.add(40));
		
		//remove(Object o) : 
		//removes a given value from the collection : returns boolean after result
		System.out.println(c.remove(30));
		System.out.println("The collection is: "+c);
		
		//size: returns the number of elements
		
		//isEmpty: to check if collection is empty or not
		
		//clear :: to delete all elements :: void method, does not return anything
		//c.clear();
		//System.out.println("data after clear is: "+c);
		
		
		//contains(Object O): to check if the collection contains the requested data
		//return boolean true
		System.out.println(c.contains(20));
		
		
		//the removeIf(Predicate p) :: return type is boolean
		//added in java 8. Here this method internally calls the predicate's test method
		//we have to provide a lamda exp to provide body to test abstract method of Predicate interface
		//removeIf takes lamda, lamda must return boolean
		//the predicate is applied on each item of collection
		//this will return true or false for each iteration
		//the items for which predicate returns true are deleted from the collection
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(10);c1.add(20);c1.add(30);c1.add(40);c1.add(50);c1.add(60);
		c1.removeIf(x-> x%3==0 );
		System.out.println("Lets check the result: "+c1);
		
		
		
		//Traversing Collections(Iterator, and foreach)
		//Iterator 
		System.out.println("Iterator is an interface present in java.util package");
		System.out.println("The generics provided at the time of creating collection should be used at time of creatin iterator too");
		System.out.println("To traverse we can use iterator for traversing in forward direction");
		System.out.println("Three steps involved in using iterator");
		System.out.println("1. Use factory method iterator()");
		System.out.println("2. check if collection has further records using method hasNext()");
		System.out.println("3. get the data: with next()");
		
		//iterator() called on collection, hasNext() check for next element, next() get next element
		Iterator<Integer> i1 = c1.iterator();
		while(i1.hasNext()) {
			System.out.println("The data is: "+i1.next());
		}
		
		//forEach(takes lamda for consumer interface)
		//a lamda that matches signature of Consumer interface abstract method accept(T t)
		//forEach given access to each elem of collection
		//automatic call to Consumer accept method, whose implementation we provide with lamda
		c1.forEach(x->System.out.println(x));
		
	}

}
