package Object;
public class Parent {

	String name;
	int age;
	
	public Parent(String name) {
		this.name=name;
	}
	
	public Parent(int age) {
		this("Jeeevan");
		this.age=age;
	}
	
	public void Name() {
		System.out.println("Name: "+this.name);
	}
	
	public void Age() {
		this.Name();
		System.out.println("Name: "+this.age);
		
	}
}
