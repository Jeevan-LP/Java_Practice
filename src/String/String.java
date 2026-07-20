package String;

public class String {

	public static void main(java.lang.String[] args) {

		java.lang.String mail="jeevangowdaAz016@gmail.com";
		
		for(int i=0;i<mail.length();i++) {
			if(((mail.charAt(i)>='A'&& mail.charAt(i)<='Z')||(mail.charAt(i)>='a'&& mail.charAt(i)<='z')||(mail.charAt(i)>'0'&& mail.charAt(i)<'9'))) {
				System.out.print(mail.charAt(i));
			}
		}
	}

}
