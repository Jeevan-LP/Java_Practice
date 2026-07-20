package Array;

public class Parctice {
	
	public static void main(String[] args) {
		
		int a[][]= {{100,200,300},{400,500,600},{700,800,900},{1000,1100,1200}};
		//System.out.println(a[3][1]);
		
		for(int r=0;r<=a.length-1;r++) {
			for(int c=0;c<=a[r].length-1;c++) {
				System.out.print(" "+a[r][c]);
			}
			System.out.println();
		}

	}

}
