package Collections;

import java.util.LinkedList;

public class ForEach {

	public static void main(String[] args) {

		LinkedList la = new java.util.LinkedList();
		la.add('w');
		la.add("Jeevan");
		la.add(27);
		la.add(2001);
		System.out.println(la);
		
		
		for(Object ob:la) {
			System.out.println(ob);
		}
	}

}
