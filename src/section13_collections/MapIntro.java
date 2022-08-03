package section13_collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Student{
	int id;
	String name;
	
	Student(int id, String name){
		this.id=id;
		this.name = name;
	}
}

public class MapIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is about Map collection");
		System.out.println("Uses key and value pairs to strore data");
		System.out.println("Duplicate keys are not allowed. Used to identify value");
		System.out.println("Main object is always stored in value");
		System.out.println("It has two child classes, HashMap(unsorted and unordered keys), TreeMap(ordered and sorted keys)");
		System.out.println("The difference is same as that of Hashset and Treeset");
		System.out.println("all rules related to maps apply on keys. Java is least bothered about values in MAP");
		
		//lets c the example
		Map<Integer, Student> m = new HashMap<Integer, Student>();
		Student s1 = new Student(1,"Testing 1");
		m.put(s1.id, s1);
		Student s2 = new Student(2,"Testing 2");
		m.put(s2.id, s2);
		Student s3 = new Student(3,"Testing 3");
		m.put(s3.id, s3);
		Student s4 = new Student(4,"Testing 4");
		m.put(s4.id, s4);
		System.out.println("The map created is: "+m);
		
		
		//Common methods of Map Interface
		//This does not inherit from Collection Interface. So it has its own methods
		Map<Integer, String> m1 = new HashMap<>();
		//using var keyword
		var Map2 = new HashMap<Integer,String> ();
		
		//put method:: map.put(key,val);
		m1.put(11, "Hello");
		System.out.println("using sopln map is printed in curly braces");
		System.out.println(m1);
		m1.put(11, "Hi");
		System.out.println("Compilation will not fail in case of adding dupe key");
		System.out.println("The new value will be overridden");
		
		//get(key)
		System.out.println(m1.get(11));
		System.out.println("WHen key is not present null is returned");
		
		
		//remove(key)
		
		
		//replace(key,val)
		System.out.println("We can only replce values not keys");
		
		
		System.out.println("Lets create treemap in sorted order");
		var tm = new TreeMap<Integer, String>();
		tm.put(21,"Jack");
		tm.put(11,"Jill");
		tm.put(15,"Joe");
		System.out.println("TreeMap will sort the keys: Lets c: "+tm); //{11=Jill, 15=Joe, 21=Jack}
		
		//containskey : to check if a key is present or not
		//containsValue : used to check if map contains specific value
		System.out.println(tm.containsValue("Jack"));
		
		
		//isEMpty: to check if empty or not
		
		//size: for size of map
		
		//clear: to clear the map
		
		
		
		//Traversing through map
		//traversing through keys
		//set<k> keySet() : gets all the keys and stores them in set as they are unique
		//if keyset called on Hashmap, hashset is created
		//if keyset called on TreeMap, TreeSet is created
		Set<Integer> s = tm.keySet();
		s.forEach(x->System.out.println(x));
		//values function: to fetch all values and stores them in collection
		Collection<String> c1 = tm.values();
		c1.forEach(v->System.out.println(v));
		
		
		System.out.println("The foreach of Map interface takes a BiConsumer, key list and value list");
		tm.forEach((k,v)->System.out.println(k+" "+v));
		
		
		//putIfAbsent: value is inserted only if the key is not present
		
		//getOrDefault: 
		//when ceratin key is not present, null is returned by get
		//but this method will return a default value when key is not found
		System.out.println(tm.getOrDefault(44, "Testing")); //Testing
		
		//replaceAll(k,v) //return type should be same as v
		tm.replaceAll((k,v)-> v.toUpperCase());
		System.out.println("The resultant Map is: "+tm); //{11=JILL, 15=JOE, 21=JACK}
	}

}
