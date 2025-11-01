package RoughWork;

import java.util.Arrays;

public class Class_03 {

	public static void main(String[] args) {
		
		int a[][]={{100,200,300,400},
				   {500,600,700,800},
				   {900,1000,1100,1200}};
		System.out.print(a[1][2]+"  ");

		System.out.println();
		for(int i=0;i<=a.length-1; i++) {
			for(int j=0;j<=a[i].length-1;j++){
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
		/*
		for(int array:a) {
			System.out.print(array+" ");
		}
		System.out.println(Arrays.toString(a));
		*/
	}

}
