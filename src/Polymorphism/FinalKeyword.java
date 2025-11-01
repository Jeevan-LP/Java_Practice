package Polymorphism;

 class ABC{
	final int a=10;
	  void abc() {
		System.out.println(a);
	}
}
	 
	 class XYZ extends ABC{
			 int a=10;
			 void xyz() {
				System.out.println(a);
			}
}

public class FinalKeyword {

	public static void main(String[] args) {
		ABC ab=new ABC();

		//ab.a=80;
		System.out.println(ab.a);
		}
	}
