package Interface;

public interface zoo {
	
	int Animalcount=10;
	String name="Tiger";
	
	static void food() /////static method
	{ 
		System.out.println("meat food for wild animal");
	}
	
	default void color() /////default method
	{
		System.out.println("based on the animals");
	}
	
	 abstract void water(); ////abstract method without method body
	

}
