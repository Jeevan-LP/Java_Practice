package Array;

public class Clarification {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7};
		//Approach 1 
		/*
		 * Initially convert a length into the index
		 * length this is variable a not method and count number not a index
		 */
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		
		
		System.out.println();
		//Approach 2
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]);
		}
	}

}
