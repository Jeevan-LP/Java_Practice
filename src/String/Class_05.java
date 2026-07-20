package String;

public class Class_05 {

	public static void main(String[] args) {

		java.lang.String s="Jeevan";
		for(int i=0;i<=s.length()-1;i++) {
		if(s.charAt(i)=='v' || s.charAt(i)=='n') {
			continue;
		}
		System.out.println(s.charAt(i));
		}
		
		
		}

}
