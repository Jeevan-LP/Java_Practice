package Exception;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		System.out.println("main starts");
		try {
        System.out.println(10/0);
		int a[]= {1,2,3,4,5};

		System.out.println(a[7]);
		}
		catch(ArithmeticException e) {
			
			e.printStackTrace();
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("main ends");

	}

}
