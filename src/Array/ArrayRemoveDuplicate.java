package Array;

public class ArrayRemoveDuplicate {

	public static void main(String[] args) {
		int arr[]= {12,45,24,12,45,78,90};
		int b[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					b[j]=-1;
				}
			}
			 if(b[i]!=-1) {
				b[i]=count;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(b[i]==-1) {
				System.out.println(arr[i]);
			}
		}

	}

}
