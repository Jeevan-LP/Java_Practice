package Casting;

public class DataCasting {

	public static void main(String[] args) {

		////****widening/////small data to big data
		///implicitly
		/*
		int i=20;
		System.out.println(i);
		double d=(double)i;
		System.out.println(d);
		*/
		int i=10;
		System.out.println(i);
		double l=i;
		System.out.println(l);
		
		
		
		////****narrowing/////big data to small data
		///explicitly
		double d1=20.8;
		System.out.println(d1);
		int i1=(int) d1;
		System.out.println(i1);
		
		

		int a=12;
		System.out.println(a);
		double b=a;
		System.out.println(b);
		
		double c=23.4;
		System.out.println(c);
		int d=(int)c;
		System.out.println(d);
		

	}

}
