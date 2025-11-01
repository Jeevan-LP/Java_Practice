package Inheritence;

class A
{
	int a=10;
	void Parent() {
		System.out.println("parent class "+a);
	}
	
}

class B extends A
{
	int b=20;
	void child() {
		System.out.println("child class "+b);
	}
	
}


public class SingleLevel {

	public static void main(String[] args) {
		
		B b1=new B();
		b1.child();
		b1.Parent();

	}

}
