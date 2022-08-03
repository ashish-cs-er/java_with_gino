package section13_collections;

import java.util.HashSet;
import java.util.Set;

public class SetIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Set interface has three child classes: HashSet, LinkedHashSet, TreeSet");
		System.out.println("We can use any of the three child classes");
		System.out.println("Does not allow duplicate values");
		//basic differences in child classes
		//1. Sorting: HashSet: unsorted, LinkedHasSet:unsorted, TreeSet: sorted in asc order
		//2. Order: HashSet: unordered, LinkedHasSet:insertion order maintained, TreeSet: sorted in asc order
		//3. output: HashSet: not predictable, LinkedHasSet:ordered so predictable, TreeSet: sorted so predictable
		//4. Performance: HashSet: Best, LinkedHasSet: lower than HashSet, TreeSet: Lowest
		//5. Duplicates: not allowed in any of them
		//6: null: can be stored but only once
		
		
		System.out.println("Collection interface methods will work with Sets too");
		System.out.println("boolean add, boolean remove, void clear, int size, boolean isEMpty, boolean contains, boolean removeIf, void forEach");
		
		//boolean add(Object o)
		Set<Integer> s1 = new HashSet<Integer>();
		System.out.println(s1.add(10));
		System.out.println(s1.add(20));
		System.out.println(s1.add(30));
		System.out.println(s1); //[20, 10, 30] :: insertion order not maintained
		
		//size()
		System.out.println(s1.size()); //3
		
		//forEach : calls Consumer Interface abstract method get internally
		s1.forEach(x->System.out.println(x));

		
	}

}
