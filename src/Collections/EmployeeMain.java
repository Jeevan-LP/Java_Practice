package Collections;

import java.util.HashSet;

public class EmployeeMain {

	public static void main(String[] args) {
		
		HashSet a=new HashSet();
		Employee e=new Employee("jeevan", 100, 20000);
		a.add(e);
		
		a.add(new Employee("Appu", 102, 70000));
		a.add(new Employee("Appu", 102, 70000));
		a.add(new Employee("Gowda", 103, 60000));
	
		System.out.println(a);
		

	}

}



