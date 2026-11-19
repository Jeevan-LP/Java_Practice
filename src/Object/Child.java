package Object;

public class Child extends Parent {
	
	String DOB;
	
	public Child(String DOB) {
		super("Jeevan");
		this.DOB=DOB;
	}
	
	public void details() {
		super.Name();
		super.Age();
		System.out.println("DOB: "+DOB);
	}
	
	 public static void main(String[] args) {

	        Child ch = new Child("27/09/2001");

	        ch.details();
	    }

}

