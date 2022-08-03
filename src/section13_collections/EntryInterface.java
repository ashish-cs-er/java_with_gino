package section13_collections;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class EntryInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Each row inside a map is an entry");
		System.out.println("This entry is managed by ENtry interface");
		System.out.println("So to Map.Entry<k,v>: this is the format in which entry is stored");
		System.out.println("To get all the entries, map provides one function: entrySet");
		
		Map<Integer, String> mm = new HashMap<>();
		mm.put(1, "Test User");
		mm.put(2, "Hello");
		mm.put(3, "Learning");
		mm.put(4, "Kamal");
		
		//entrySet: fetches all entries and stores them inside Set
		//Internally Set< Map.Entry<Integer, String> >
		Set<Map.Entry<Integer,String>> ms = mm.entrySet();
		ms.forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
	}

}
