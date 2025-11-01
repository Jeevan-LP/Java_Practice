package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {

	public static void main(String[] args) {
	
	ArrayList alist = new ArrayList();
	alist.add("Jeevan");
	alist.add('A');
	alist.add(27);
	alist.add(09.2001);
	alist.add(null);
	alist.add('A');
	alist.add(27);
	System.out.println("Index of 27 = "+alist.indexOf(27));
	System.out.println(alist);
	System.out.println(alist.get(3));
	alist.set(0, "Appu");
	System.out.println("on setting data = "+alist);
	alist.add(2, 100);
	System.err.println("on adding data = "+alist);
	System.out.println("size of collection = "+alist.size());
	alist.remove(4);
	System.out.println(alist);
//	alist.clear();
//	System.out.println(alist);
	
	System.out.println("Using for loop");
	for(int i=0;i<=alist.size()-1;i++) {
		System.out.print(" "+alist.get(i));	
	}
	
	System.out.println();
	System.out.println("Using for each loop");
	for(Object j :alist) {
		System.out.print(" "+j);
	}
	
	System.out.println();
	System.out.println("Using iterator");
	Iterator ai = alist.iterator();
	
	while(ai.hasNext()) {
		System.out.print(" "+ai.next());
	}
			// ************To add element*************************
	
//		ArrayList A = new ArrayList();
//		A.add("Jeevan");
//		A.add('J');
//		A.add(27.09);
//		A.add(2001);
//		A.add(null);//////////////////////////*************///////add(object)
//		System.out.println(A);
//		
//		ArrayList B = new ArrayList();
//		B.add("Appu");
//		B.add('A');
//		B.add(23);
//		B.add(null);
//		System.out.println(B);
//		B.addAll(A);
//		System.out.println(B);//////////////////////////*******///add(collection)
//		B.add(0, "Gowda");
//		System.out.println(B);
		
		
		
		// ************To search on element*************************

		/**
		ArrayList A1 = new ArrayList();
		A1.add("Jeevan");
		A1.add('A');
		A1.add(null);
		System.out.println(A1);
		System.out.println(A1.indexOf(null));


		ArrayList B1 = new ArrayList();
		B1.add("Appu");
		B1.add('J');
		B1.add(27);
		B1.add(34.77);
		System.out.println(B1);
		B1.addAll(A1);
		System.out.println(B1);
		System.out.println(B1.contains("gowda"));//////////////////contains(object)
		System.out.println(B1.containsAll(A1));/////////////////////contains(collection)
		System.out.println(B1.indexOf('J'));//////////////////////indexOf(object)
		
		**/
		
		// ************To search on element*************************

		/**
		ArrayList A = new ArrayList();
		A.add("Jeevan");
		A.add('A');
		A.add(null);
		System.out.println(A);
		A.remove("Jeevan");
		System.out.println(A);
		
		ArrayList B = new ArrayList();
		B.add("Appu");
		B.add('J');
		B.add(27);
		B.add(34.77);

		System.out.println(B);
		B.remove(34.77);
		System.out.println(B);
		
		A.removeAll(B);
		System.out.println(A);
		**/
		

		// ************To Transverse the collection*************************

		/**
		ArrayList A = new ArrayList();
		A.add("Jeevan");
		A.add('A');
		A.add(null);
		System.out.println(A);
		A.size();
		System.out.println(A);

	
		
		for(Object o:A) {
			System.out.println(o);
			
		}
		**/
		
		
		/**
		ArrayList a = new ArrayList();
		a.add("Jeevan");
		a.add(27);
		a.add('J');
		System.out.println(a);
		
		for(Object re:a) {
			System.out.println(re);
			
		}

		
		
		ArrayList b = new ArrayList();
		b.add(43);
		b.add(null);
		System.out.println(b);
		
		Iterator i = b.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
		}
		
		ListIterator l = b.listIterator(b.size());
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}
		**/
		
		/**
		ArrayList a = new ArrayList();
		a.add(27);
		a.add("jeevan");
		a.add("A");
		a.add(27.9);
		a.add(true);
		a.add(null);
		a.add(null);
		System.out.println(a);//////////////add()
		
		ArrayList b = new ArrayList();
		b.add("Appu");
		b.add('J');
		System.out.println(b);
		b.addAll(a);
		System.out.println(b);////////addAll()
		
		System.out.println("======");
		System.out.println(a.contains("jeevan"));////////contains()
		System.out.println(b.containsAll(a));///////////containsAll()
		System.out.println(a.indexOf("A"));////////////indexOf()
		**/
		
		/**
		ArrayList c = new ArrayList();
		c.add(27);
		c.add("jeevan");
		c.add("A");
		c.add(27.9);
		c.add(true);
		c.add(null);
		System.out.println(c);
		c.remove("A");
		System.out.println(c);
		c.removeAll(c);
		System.out.println(c);
		
		
		
		ArrayList d = new ArrayList();
		c.add(27);
		c.add("jeevan");
		c.add("A");
		c.add(27.9);
		c.add(true);
		c.add(null);
		System.out.println(c);
		**/
		
	}

}
