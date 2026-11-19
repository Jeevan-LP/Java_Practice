package Java_Practice;

public class NewParent extends NewChild{

	NewParent(){
		super(27, "Appu");
	}
	
	void parentMethod() {
		super.details();
		super.age=27;
	}
	
	public static void main(String[] args) {
		NewParent dd = new NewParent();
		dd.parentMethod();
	}
}
