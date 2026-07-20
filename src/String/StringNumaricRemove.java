package String;

public class StringNumaricRemove {

	public static void main(String[] args) {

		java.lang.String name="jeevan@123";
		
		for(int i=0;i<name.length();i++){
			
			if(!((name.charAt(i)>='a'&&name.charAt(i)<='z')||(name.charAt(i)>='0' && name.charAt(i)<='9'))) {
				System.out.println(name.charAt(i));
			}
		}
	}

}
