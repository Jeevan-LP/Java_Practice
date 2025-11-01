package Interface;

interface Forest{
	
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

public class Animal implements Forest {
	
	 public void water() ////abstract method with method body
	 {
		System.out.println("drinking water");
	}
	 
	 void king() {
		 System.out.println("lion is king of jungle");
	 }

	public static void main(String[] args) {
		/**
		Animal an = new Animal();
		an.color();
		an.water();
		Forest.food();
		an.king();
		**/
		
		Forest in=new Animal();
		in.color();
		in.water();
		Forest.food();
	

	}

}
