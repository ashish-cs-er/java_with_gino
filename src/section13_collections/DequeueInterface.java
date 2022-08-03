package section13_collections;

public class DequeueInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is about Dequeue Interface");
		System.out.println("It is child of Queue Interface. It is also a special type of queue");
		System.out.println("It is a double ended queue");
		System.out.println("Data can be added to start or end. Data can be removed from head and tail");
		System.out.println("Also called double ended queue");
		
		System.out.println("The LinkedList class inherits from the Dequeu interface");
		System.out.println("So a dequeu can be implemented using LinkedList class");
		System.out.println("has methods like addFirst, addLast, offerFirst, offerLast, peekFirst, peekLast, pollFirst, pollLast");
		System.out.println("Error throwing mech for add-offer, peek-remove remains same");
		
		System.out.println("Data is not sorted. Dupes and nulls are allowed");
		
		System.out.println("A queue guarantees FIFO but an ArrayList does not");
		
	}

}
