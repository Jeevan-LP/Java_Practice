package Exception;

public class UncheckedException {

	public static void main(String[] args) {

		System.out.println("excution start");
		String name="Jeevan Gowda";
		try {
		System.out.println(name.charAt(12));
		}
		catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		/*
		try {
		System.out.println(name.charAt(12));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("excution end");
		
		System.out.println("excution start");
		int a=20, b=0;
		
		try {
		System.out.println("divisible of a/b "+a/b);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("excution end");*/
		

	}

}
