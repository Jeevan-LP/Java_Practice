package NumberProgram;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandamNumber {

	public static void main(String[] args) {


		//Approach 1
		Random r = new Random();
		int num = r.nextInt(100);
		//int num=r.nextInt(27, 97);
		//long num = r.nextLong(10000000000l);
		System.out.println(num);
		
		//Approach 2
		int num2 = ThreadLocalRandom.current().nextInt(100);
		//long num2=ThreadLocalRandom.current().nextLong(10000000000l);
		//int num2=ThreadLocalRandom.current().nextInt(27, 97);
		System.out.println(num2);
		}
	}

