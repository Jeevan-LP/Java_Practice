package NumberProgram;

public class Palyndrome {

	public static void main(String[] args) {
		int num=3553;
		int sum=0,rem=0,temp=num;;
		while(num!=0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("it is palydrome "+sum);
		}
		else {
			System.out.println("it is not palydrome "+sum);
		}

	}

}
