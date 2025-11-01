package ScannerClass;

import java.util.Scanner;

public class MultipleData {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
//		int a=sc.nextInt();
//		double d=sc.nextDouble();
//		String s=sc.next();
//		String s1=sc.nextLine();
//		char ch=sc.next().charAt(0);
		
//		System.out.println("enter 1st number");
//		int a=sc.nextInt();
//		System.out.println("enter 2nd number");
//		int b=sc.nextInt();
//		int c=a+b;
//		System.out.println("adding 3 number "+c);//////////**********intiger class
		
//		System.out.println("enter 1st number");
//		double d=sc.nextDouble();
//		System.out.println("enter 2nd number");
//		double d1=sc.nextDouble();
//		double d2=d+d1;
//		System.out.println(d2);/////////////////////////////////////****double class
		
		
		System.out.println("enter number");
		
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("It is even number");
		}
		else {
			System.out.println("It is odd number");

		}

	}

}
