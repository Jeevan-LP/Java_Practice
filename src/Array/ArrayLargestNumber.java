package Array;

public class ArrayLargestNumber {

	public static void main(String[] args) {
	
		int arr[]= {23,45,54,22,67};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}

           System.out.println(max);
	}

}
