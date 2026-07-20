package NumberProgram;

public class Tribanasis {

	public static void main(String[] args) {

		int num=10,sum=0;
		int n1=0,n2=1,n3=2;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		for(int i=0;i<=num;i++) {
			sum=n1+n2+n3;
			System.out.println(sum);
			n1=n2;
			n2=n3;
			n3=sum;
		}
		
	}

}
