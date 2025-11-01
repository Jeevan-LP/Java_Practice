package Collections;

public class Sort implements Comparable<Sort>{

	int id;
	String name;
	char Grade;
	
	public String toString() {
		
		return "student[id="+id+",name="+name+",Grade="+Grade+"]";
		
	}
	
	public Sort(int id,String name,char Grade) {
		this.id=id;
		this.name=name;
		this.Grade=Grade;
	}

	@Override
	public int compareTo(Sort o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
	
}
