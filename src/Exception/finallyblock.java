package Exception;

public class finallyblock {
	public static void main(String[] args) {
		String s1="jeevan";
		try {
		System.out.println(s1.charAt(6));
		}
		catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println(" irrespective of exception this block will excecute");
		
			
		}
	}

}
