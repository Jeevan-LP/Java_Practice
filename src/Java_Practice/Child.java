package Java_Practice;

public class Child extends Parent implements UnImplement_01{
	
//	@Override
//	void addition(int c, int d) {
//		System.out.println("addition: "+(c+d));
//	}
	
	@Override
	public void companyLogo() {
		System.out.println("In4suite");
	}
	public static void main(String[] args) {
		Parent ch=new Child();
		//ch.addition(10, 20);
		//System.out.println(ch.role);
		System.out.println(Parent.j);
		
		Child p=(Child)ch;
		
	}
}

