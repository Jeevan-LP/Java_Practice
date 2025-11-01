package Interface;

public class Class2 extends Class1 implements Interface1,Interface2

{

	public void interface1() {
		System.out.println("1st interface "+a);
	}
	
	public void interface2() {
		System.out.println("2nd interface "+b);
	}
	
	void method() {
		System.out.println("grand child method");
	}
	public static void main(String[] args) {

		Class2 c2=new Class2();
		c2.interface1();
		Interface1.interfaceStatic1();
		
		c2.interface2();
		Interface2.interfaceStatic2();
		
		c2.wikipedia();
	
	}

}
