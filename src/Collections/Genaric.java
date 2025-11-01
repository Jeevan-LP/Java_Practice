package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Genaric {

	public static void main(String[] args) {

		ArrayList<Double> a=new ArrayList<Double>();
		a.add(55.4);
		a.add(2.4);
		a.add(3.5);
		a.add(66.57);
		a.add(12.4);

		System.out.println(a);
		//Collections.sort(a);
		//System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
		
		/*
		ArrayList<Double> a = new ArrayList();
		
		a.add(45.6);
		a.add(5.3);
		a.add(457.7);
		a.add(3.55);
		a.add(2.3);

		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
		*/
	}

}
