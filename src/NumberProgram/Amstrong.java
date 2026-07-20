package NumberProgram;

public class Amstrong {

	public static void main(String[] args) {
		int num=35;
		int sum=0,rem=0,temp=num;;
		while(num!=0) {
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("it is Amstrong "+sum);
		}
		else {
			System.out.println("it is not Amstrong "+sum);
		}

	}

}
