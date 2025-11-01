package Casting;

public class Operators {

	public static void main(String[] args) {

		int a=10,b=20;
		System.out.println("addition "+(a+b));
		System.out.println("subraction "+(a-b));
		System.out.println("multification "+(a*b));
		System.out.println("divison "+(a/b));
		System.out.println("modulus "+(a%b));
		System.out.println("greaterthan "+(a>b));
		System.out.println("lesserthan "+(a<b));
		System.out.println("greaterthan or eqaul to "+(a>=b));
		System.out.println("lesserthan or eqaul to "+(a<=b));
		System.out.println("not equal to "+(a!=b));
		System.out.println("equal to "+(a==b));
		
		System.out.println("and operator "+(a>b && a<b));
		System.out.println("or operator "+(a>b || a<b));
		
		
		///*** post increment
		int x=30;
		int result = a++;
		System.out.println(result);
		System.out.println(a);
		
		///*** pre increment
		int y=50;
		int value=++b;
		System.out.println(value);
		System.out.println(b);
		
	}

}
