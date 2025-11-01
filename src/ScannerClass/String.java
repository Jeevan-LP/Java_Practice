package ScannerClass;

import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter String");
		java.lang.String stg = sc.next();
		
		for(int i=0;i<stg.length();i++) {
			if((stg.charAt(i)=='a')||(stg.charAt(i)=='e')||(stg.charAt(i)=='i')||(stg.charAt(i)=='o')||(stg.charAt(i)=='u')) {
				System.out.println(stg.charAt(i));
			}
		}
	}

}
