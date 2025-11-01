package Exception;

public class ExceptionHandlingArraybound {

	public static void main(String[] args) {
	int a[]= {1,2,3,4};
	try {
	System.out.println(a[6]);

	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		
		
	}
	}
}
