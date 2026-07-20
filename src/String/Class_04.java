package String;

import java.util.Scanner;

public class Class_04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter strung value");
		java.lang.String stg = sc.next();
		for(int i=0;i<=stg.length()-1;i++) {
			if(((stg.charAt(i)>='a'&& stg.charAt(i)<='z')||(stg.charAt(i)>='A'&&stg.charAt(i)<='Z')
					||(stg.charAt(i)>'0'&&stg.charAt(i)<'9'))) {
			System.out.print(stg.charAt(i));
			}
		}
		
	}
}
