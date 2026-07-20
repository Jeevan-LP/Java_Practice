package String;
import java.lang.String;
public class StringType {

	public static void main(String[] args) {
		
		String s1="Jeevan";

		String s2="jeevan";
		
		String s3="jeevan is a good boy";
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf('n'));
		System.out.println(s1.indexOf('J', 0));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.substring(0, 3));
		System.out.println(s1.concat(" appu"));
		System.out.println(s1.replace('v', 'x'));
		System.out.println(s2.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s3.startsWith("jeevan"));
		System.out.println(s3.endsWith("boy"));
		System.out.println(s1.contains("Hello"));
		System.out.println(s3.strip());
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		String s = new String("jee");
		System.out.println(s);
		String s11 = new String("jee");
		System.out.println(s11);
		////////////////////////////////////////////////////////////////////////////////////////////////////
		String name="appuzz";
		System.out.println(name);
		String name1="appuzz";
		System.out.println(name1);
		}

}
