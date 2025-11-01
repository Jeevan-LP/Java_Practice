package RoughWork;

public class Class_02 {

	public static void main(String[] args) {

		int Evencount=0, Oddcount=0;
		for(int i=1;i<=11;i++) {
			if(i%2==0) {
				System.out.println("Even no "+i);
				Evencount++;
			}
			else {
				System.out.println("Odd no "+i);
				Oddcount++;
				}
			}
		System.out.println("No of Even No "+Evencount);
		System.out.println("No of odd No "+Oddcount);

	}
}
