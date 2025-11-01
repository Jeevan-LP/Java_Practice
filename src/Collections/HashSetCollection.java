package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection {

	public static void main(String[] args) {

		HashSet set = new HashSet();
		set.add("Appu");
		set.add(50);
		set.add(95.84);
		set.add('J');
		set.add(27);
		set.add("Gowda");
		set.add("Appu");
		System.out.println(set);
		set.remove('J');
		System.out.println(set);
		set.remove(50);
		System.out.println(set);
		System.out.println("size of collection "+set.size());
		
		
		System.out.println("Using for each loop");
		for(Object j:set) {
			System.out.print(" "+j);
		}
		
		System.out.println();
		System.out.println("Using iterator");
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.print(" "+it.next());
		}
		
		
	}

}
