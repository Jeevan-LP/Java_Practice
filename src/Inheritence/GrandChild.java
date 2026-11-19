package Inheritence;

public class GrandChild extends Parent{

	String DOB="27/09/2001";
	
	public void grandChildClass() {
		System.out.println("Grand Child Class DOB: "+this.DOB);
	}
	
	public static void main(String[] args) {
		
		GrandChild gc=new GrandChild();
		gc.parentClass();
		//gc.childClass();
		gc.grandChildClass();
	}
}
