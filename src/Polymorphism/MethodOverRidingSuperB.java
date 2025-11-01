package Polymorphism;


    public class MethodOverRidingSuperB extends MethodOverRidingSuperA{

    String name="Appu";
	
	void details() {
		//System.out.println(name);
		//System.out.println("child class");
		//System.out.println(super.name);
		super.details();
	}

}
