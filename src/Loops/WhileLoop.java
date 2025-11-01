package Loops;

public class WhileLoop {

	public static void main(String[] args) {

		int i=1;
		int EvenCount=0, OddCount=0;
		while(i<10) {
			if(i%2==0) {
				System.out.println("Even no "+i);
				EvenCount++;
			}
			else {
				System.out.println("odd no "+i);
				OddCount++;
			}
			i++;
		}
		System.out.println("No of even No "+EvenCount);
		System.out.println("No of odd No "+OddCount);
		
		/*
		int i=1;
		while(i<=2) {
			int j=1;
			while(j<=5) {
				System.out.println("Hi "+j);
				j++;
			}
			System.out.println("Jeevan "+i);
			i++;
		}
		System.out.println("bye "+i);
		*/
		
		/*
		int k=13;
		while(k>=1) {
			System.out.println(k);
			k--;
		}
		*/
		
		/*
		int l=1;
		while(true) {
			System.out.println("Hi Jeevan");
			l++;
		}
		*/

		/*
		int z=1;
		while(z<=10) {
			if(z%2==0) {
			System.out.println("It is even No "+z);
			}
			else {
				System.out.println("It is odd No "+z);
			}
			z++;
		}
		*/
		
		///break condition///***
		/*
		int a=1;
		while(true) {
			System.out.println("Jeevan");
			a++;
			if(a==5) {
				break;
			}
		}	
		*/	
	}

}
