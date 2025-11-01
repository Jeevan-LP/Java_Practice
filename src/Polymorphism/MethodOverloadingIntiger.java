package Polymorphism;

public class MethodOverloadingIntiger {
	
	int a=10,b=20;
	
	void sum() {
		System.out.println(a+b);
		}
	
	void sum(int x, double y) {
		System.out.println(x+y);
	}
		
	void sum(double u, double v) {
		System.out.println(u+v);
	}
		
	
}
	
