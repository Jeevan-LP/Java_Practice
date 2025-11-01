package Polymorphism;

public class constructorOverloadingA {
	
int a=10,b=20;
	
constructorOverloadingA() {
		System.out.println(a+b);
		}
	
constructorOverloadingA(int x, double y) {
		System.out.println(x+y);
	}
		
constructorOverloadingA(double u, double v) {
		System.out.println(u+v);
	}

}
