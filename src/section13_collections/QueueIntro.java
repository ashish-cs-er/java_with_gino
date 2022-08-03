package section13_collections;

import java.util.LinkedList;
import java.util.Queue;


public class QueueIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A queue is a FIFO data structure: First In First Out");
		System.out.println("Sybmolize it with a ticket counter. The person who gets in line first, gets the ticket first");
		System.out.println("Head pointer is there to point to the first element of queue");
		System.out.println("Data is always removed from the start of queue but data is always added to the end of queue");
		
		System.out.println("A Queue is an interface, the most important one is Linked List class that implements Queue");
		
		System.out.println("Queue interface has its own methods apart from Collections mehotds");
		System.out.println("instead of add it has offer method: boolean offer(E e)");
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(10);q.offer(20);q.offer(30);
		System.out.println("Queue created is: "+q);
		System.out.println("If unable to add element to queue, add throws exception whereas offer returns false");
		
		
		//peek and poll: both return the first element from the queue 
		System.out.println("Peek gives the first element wihtout modifying the queue. Return null for empty queue");
		System.out.println("Poll method gives the first element after deleteing it from queue. Return null for empty queue");
		
		//remove, element
		System.out.println("Again these are similar to peek and poll");
		System.out.println("element: gives first element without modifying the queue. Error for emtpy queue");
		System.out.println("remove: gives first element after deleting from queue. Error in case of empty queue");
		System.out.println("NoSuchElementException is thrown");
		
		
		
	}

}
