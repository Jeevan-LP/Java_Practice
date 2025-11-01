package Collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Itarater {

	public static void main(String[] args) {

		LinkedList la = new java.util.LinkedList();
		la.add('w');
		la.add("Jeevan");
		la.add(27);
		la.add(2001);
		System.out.println(la);
		
		ListIterator list = la.listIterator(la.size());
		while(list.hasPrevious()) {
			System.out.println(list.previous());
		}
		
		LinkedList a = new LinkedList();
		a.add(27);
		a.add("Jeevan");
		a.add(09.2001);
		a.add('A');
		System.out.println(a);
		
		Iterator i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
