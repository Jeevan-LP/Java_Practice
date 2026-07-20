package NumberProgram;

public class Febanasis {

	public static void main(String[] args) {

		int num=19,sum=0;
		int n1=0,n2=1;
//		System.out.println(n1);
//		System.out.println(n2);
		
		for(int i=1;i<=num;i++) {
			
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}
	}

}
