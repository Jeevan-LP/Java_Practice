package Exception;

public class nestedTryCatch {

	public static void main(String[] args) {
		System.out.println("main starts");
		
try {
			try {
		int[] a= {1,2,3,4,5};
		System.out.println(a[6]);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			String name="JEEVAN";
			System.out.println(name.charAt(7));
			
				
}
		
		
catch(StringIndexOutOfBoundsException e) {
			
			e.printStackTrace();
}
		
		System.out.println("main ends");

	}

}
