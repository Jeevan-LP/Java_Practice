package Collections;

import java.util.Collections;

public class SortMain {

	public static void main(String[] args) {

		java.util.ArrayList a = new java.util.ArrayList();
		
		Sort b = new Sort(27, "appu", 'A');
		a.add(b);
		System.out.println(a);
		a.add(new Sort(90, "kl", 'k'));
		a.add(new Sort(9, "sd", 'f'));
		a.add(new Sort(67, "hh", 'r'));
		
		Collections.sort(a);
		System.out.println(a);
	}

}
