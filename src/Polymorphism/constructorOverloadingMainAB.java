package Polymorphism;

public class constructorOverloadingMainAB {

	public static void main(String[] args) {
		constructorOverloadingA co=new constructorOverloadingA();
		
		constructorOverloadingB co1=new constructorOverloadingB(20.5,54.6,54.5);
		System.out.println(co1.volume());

	}

}
