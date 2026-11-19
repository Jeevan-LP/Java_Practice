package Polymorphism;

public class constcuctorOverloadingSuper {
	
	public constcuctorOverloadingSuper() {
		
		System.out.println("1st");
	}

	public constcuctorOverloadingSuper(double a) {
		this();
		System.out.println("2nd");
	}
	public constcuctorOverloadingSuper(double a,int b) {
		
		System.out.println("3nd");
	}

	public static void main(String[] args) {
		
	}

}
