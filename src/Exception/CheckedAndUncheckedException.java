package Exception;

public class CheckedAndUncheckedException {

	public static void main(String[] args) throws InterruptedException {

//		System.out.println("excution start");
//		String s=null;
//		Thread.sleep(6000);
//		System.out.println(s.length());
//		System.out.println("excution end");

		System.out.println("excution start");
		String s1=null;
		try {
		System.out.println(s1.length());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("excution end");

	}

}
