package Casting;

public class WrapperClass {

	public static void main(String[] args) {

		int a=20;
		Integer b=a;//////////boxing
		int c=b;/////////////unboxing
		System.out.println(c);
		
		System.out.println(b);
		
		
		double z=2.5;
		Double y=z;
		double x=y;
		System.out.println(c+x);
		
		//////////////////////////*******************
		int e=25;
		System.out.println(e);
		
		Integer f=e;
		System.out.println(f);
		
		int g=f;
		System.out.println(g);
		
		Integer i=new Integer(10);
		System.out.println(i);
	}
	
}