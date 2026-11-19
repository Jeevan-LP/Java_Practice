package Polymorphism;

public class constructorOverloadingA {
	
int a=10,b=20;
	
constructorOverloadingA() {
		System.out.println(a+b);
		}
	
constructorOverloadingA(int x, int y) {
		System.out.println(x+y);
	}
		
constructorOverloadingA(double u, double v) {
		System.out.println(u+v);
	}

public static void main(String[] args) {
	constructorOverloadingA ggg=new constructorOverloadingA(1, 2);
}
}
