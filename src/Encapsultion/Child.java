package Encapsultion;

public class Child extends Parent {
	
	String DOB;
	
	public Child(String DOB) {
		this.DOB=DOB;
	}
	
	 public static void main(String[] args) {

	        Child ch = new Child("27/09/2001");
	        ch.setName("Jeevan");
	        System.out.println(ch.getName());
	        
	        ch.setAge(27);
	        System.out.println(ch.getAge());
	        

	 }

}

