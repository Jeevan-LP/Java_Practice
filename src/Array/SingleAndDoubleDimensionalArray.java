package Array;

public class SingleAndDoubleDimensionalArray {

	public static void main(String[] args) {
		
		//**Single dimensional array

//		int a[]= {1,2,3,4,5,6,7,8,9};////Normal for loop
//		System.out.println(a[2]);
//		System.out.println(a.length);
//		for(int i=0;i<=a.length-1;i++) {
//		System.out.println(a[i]);
//		}
		
//		int b[]= {100,200,300,400,500};//// for each loop
//		for(int z:b) {
//		System.out.println(z);
//		}
		
		//**Two dimensional array
		int x[][]= {{1,2,3},{4,5,6}};
//		//**"length method is not give index value but if we defined with array symbol it will give the value based on index"
//		System.out.println("No of rows "+x.length);///to finding no of rows
//		System.out.println("No of column "+x[0].length);///to finding no of columns
		//System.out.println(x[1][2]);
		for(int r=0; r<=x.length-1;r++) {
			for(int c=0; c<=x[r].length-1;c++) {
				System.out.print(" "+x[r][c]);
			}
			System.out.println();		}
		
		for(int m[]:x) {
			for(int n:m) {
				System.out.print(n);
			}
			System.out.println();
		}
		
		int a[]= {1,2,3,4,5,6,7,8,9};
//		for(int i=0;i<=a.length-1;i++) {
//			//System.out.println(a[i]);
//			if(a[i]%2==0) {
//				System.out.println("Even no "+a[i]);
//			}
//			else {
//				System.out.println("odd no "+a[i]);
//			}
//		}
		
//		for(int x:a) {
//			if(x%2==0) {
//				System.out.println("Even no "+x);
//			}
//			else {
//				System.out.println("odd no "+x);
//			}
//		}
		
	}

}