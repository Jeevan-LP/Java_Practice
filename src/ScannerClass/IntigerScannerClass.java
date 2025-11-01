package ScannerClass;

import java.util.Scanner;

public class IntigerScannerClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1st value");
		int a = sc.nextInt();
		System.out.println("2nd value");
		int b = sc.nextInt();
		System.out.println(a+b);
	}

}
