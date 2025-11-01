package Collections;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapCollection {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put(1, "Jeevan");
		map.put(2, "Appu");
		map.put(3, "Gowda");
		map.put(1, "Dev");
		map.put(18, "Virat");
		map.put(98, "Salt");
		map.put(11, "Krunal");
		System.out.println(map);
		
		map.remove(2);
		System.out.println(map);
		map.replace(11, "Krunal", "Hardik");
		System.out.println(map);
		System.out.println("keys = "+map.keySet());
		System.out.println("Value = "+map.values());
		System.out.println("keys with value = "+map.entrySet());
		
		/*
		for(Object k:map.entrySet()) {

			System.out.println(k);
		}
		*/
		
		for(Object l: map.keySet()) {
			System.out.println(l+ " "+map.get(l));
		}
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		}

		
}
