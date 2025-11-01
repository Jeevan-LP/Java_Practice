package ScannerClass;

import java.util.Scanner;

public class EvvenOrOdd {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number");
		int num=sc.nextInt();
	
		int EvenCount=0,OddCount=0;
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.println("Evven no :"+i);
				EvenCount++;
			}
			else {
				System.out.println("Odd no :"+i);
				OddCount++;
			}
		}
		System.out.println("Number of even no................ :"+EvenCount);
		System.out.println("Number of odd no................ :"+OddCount);
	}

}
