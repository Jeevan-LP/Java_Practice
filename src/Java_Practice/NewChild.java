package Java_Practice;

public class NewChild {
	
	int age;
	String name;
	
	NewChild(int age, String name){
		this.age=age;
		this.name=name;
	}
	
	NewChild(){
		this(25, "Jeevan");
	}
	
	void details(){
		System.out.println(age+", "+name);
	}
	
	void data() {
		System.out.println("data method");
		this.details();
	}


	public static void main(String[] args) {
		NewChild ch=new NewChild();
		ch.details();
		ch.data();
	}
}
