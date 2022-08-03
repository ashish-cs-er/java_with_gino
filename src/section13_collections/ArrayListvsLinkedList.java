package section13_collections;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;

public class ArrayListvsLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("To store items we can use either ArrayList or Linked List");
		System.out.println("ArrayList uses index to traverse or store data");
		System.out.println("However no index exists in Linked List");
		System.out.println("It stores data in nodes which are related to each other and store address of next node and prev node along with data");
		System.out.println("The last node points to null.");
		System.out.println("There is head pointer: points to start");
		System.out.println("There is tail pointer: points to tail of list");
		System.out.println("Head and tail points to null");
		
		//LinkedList<E> class
		System.out.println("Linked List is faster than ArrayList in its operations");
		System.out.println("As we only need to create a node and change the respective pointers for next and prev node");
		
		System.out.println("use cases");
		System.out.println("Linked List: When modification is main purpose and not searching");
		System.out.println("ArrayList: When searching is main purpose and not modification");
		System.out.println("All methods of collection and list interface that we studied with Arraylist apply to Linked list also");
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);l1.add(20);l1.add(30);l1.add(40);
		System.out.println("Linked list is: "+l1);
		List<Integer> l2 = new LinkedList<>();
		l2.add(10);l2.add(20);l2.add(30);l2.add(40);
		System.out.println("Linked list is: "+l2);
		System.out.println("There is no diff in the output of ArrayList or Linked List. The only difference is in interanal working of lists");
		System.out.println("Duplicate values null values are alloweed");
		System.out.println("Data is not sorted by default");
		
		
		//List as Backed Collection
		System.out.println("Any change made to list is visible in array also");
		System.out.println("Any change made to array is avaialble inside list also");
		System.out.println("Arrays class contains static method called asList(varargs)");
		System.out.println("Arrays class is present in java.util package");
		System.out.println("This is a very special type of list");
		
		List<String> strList = Arrays.asList("Hello","Hi","Bye");
		System.out.println("The resuling list is: "+strList);
		
		//primitive array when converted to asList method, will result in compilation array since List hold array of objects only
		Integer ar[] ={90,45,324,56,56};
		List<Integer> arrToList = Arrays.asList(ar);
		System.out.println("The resulting array list is: "+arrToList);
		ar[0] = 200;
		System.out.println("The backed list is: "+arrToList); //first object becomes 200
		
		System.out.println("The list or collection created using asList method is of fixed size");
		System.out.println("If we do alterations with size, UnsupportedOperationException is throws");
		System.out.println("Addition or removal will not be supported, only changes can be done");
		
		
	}

}
