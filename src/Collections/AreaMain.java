package Collections;

import java.util.Collections;
import java.util.LinkedList;

public class AreaMain {

	public static void main(String[] args) {
		
		 LinkedList a = new LinkedList();
	
		 Area e = new Area(2, 4, 6);
		 a.add(e);
		 
		 a.add(new Area(6,8,3));
		 a.add(new Area(5,7,9));
		
		Collections.sort(a);

		System.out.println(a);
		}
	}