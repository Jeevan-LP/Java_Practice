package Collections;

public class Employee {

	String name;
	int id;
	int salary;
	
	public String toString() {
		return "Employee[name="+name+",id="+id+",salary="+salary+"]";
	}
	
	public Employee(String name,int id,int salary) {
		
		super();
		this .name=name;
		this.id=id;
		this.salary=salary;
		
	}

}
