package NumberProgram;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandamCharacters {

	public static void main(String[] args) {

		//Approach 1
		Random r = new Random();

		for (int i = 0; i < 26; i++) {
		    System.out.print((char)('a' + r.nextInt(26)));
		}
		
		System.out.println();
		
		//Approach 2
		StringBuilder sb = new StringBuilder();

		new Random().ints(5, 'a', 'z' + 1)
		    .forEach(c -> sb.append((char)c));

		System.out.print(sb);
	}

}
