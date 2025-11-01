package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class listIterator {

	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.add(27);
		a.add("Jeevan");
		a.add(09.2001);
		a.add('A');
		System.out.println(a);
		
		ListIterator i = a.listIterator(a.size());
		while(i.hasPrevious()) {
			System.out.print(" "+i.previous());
		}
		

	}

}
