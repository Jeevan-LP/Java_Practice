package Array;

public class ArraySmallestNumber {

	public static void main(String[] args) {
		int arr[]= {23,55,42,23,56,7,4,6};
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
           System.out.println(min);
	}

}
