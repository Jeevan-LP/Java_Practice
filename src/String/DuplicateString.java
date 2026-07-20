package String;
import java.lang.String;
import java.util.LinkedHashSet;


public class DuplicateString {

	public static void main(String[] args) {
	
		String name="Jeevan";
		
		LinkedHashSet<Character> linked=new LinkedHashSet();
		
		for(char ch:name.toCharArray()) {
			linked.add(ch);
		}
	    //System.out.println(linked);

		StringBuilder builder=new StringBuilder();
		for(char ch:linked) {
			builder.append(ch);
		}
	    System.out.println(builder);
	}

}
