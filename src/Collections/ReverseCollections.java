package Collections;
import java.lang.String;


import java.util.ArrayList;
import java.util.ListIterator;

public class ReverseCollections {

	public static void main(String[] args) {

		 ArrayList ar = new ArrayList();
		ar.add("jeevan");
		ar.add('A');
		ar.add(23);
		ar.add(23.5);
		System.out.println(ar);
		
		ListIterator li = ar.listIterator(ar.size());
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		}

}
