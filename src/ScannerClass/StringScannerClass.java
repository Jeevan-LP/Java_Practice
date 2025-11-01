package ScannerClass;


import java.util.Scanner;


public class StringScannerClass {

	public static void main(String[] args) {


//		String name="appu";
//		StringBuilder build=new StringBuilder(name).reverse();
//		System.out.println(build);**************************************reverse String

	Scanner sc=new Scanner(System.in);
	System.out.println("enter string name");
	
	java.lang.String s=sc.next();
	for(int a=0;a<s.length();a++) {
		if((s.charAt(a)>'A'&&s.charAt(a)<'Z')||(s.charAt(a)>'a'&&s.charAt(a)<'z')) {
			System.out.println(s.charAt(a));
		}
	}
	
		
		
		


	}

}
