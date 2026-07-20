package String;
import java.lang.String;
import java.util.Arrays;
public class ReverseString {

	public static void main(String[] args) {

		String name="Appu";

		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
		//**length method
		System.out.println("//**length method-----------");
	    //String nk=new String("jeevan");//with new keyword
	    //System.out.println(nk);
	    String s1="Welcome";
		System.out.println(s1.length());
		
		/**
		//**contact method
		System.out.println("//**contact method-----------");
		String s2="Jeevan";
		String s3="Gowda";
		System.out.println(s2+s3);
		System.out.println(s2.concat(s3));
		System.out.println(s2.concat(s3).concat(s2));
	    System.out.println("Appu".concat("L P"));
	    
	    //**contains method
		System.out.println("//**contains method-----------");
		String s4="Java Selenium";
	    String s5="Automation";
	    System.out.println(s4.contains(s5));
	    System.out.println(s4.contains("Java"));
	    System.out.println("Selenium".contains(s4));
	    
	    //**contains method
	    System.out.println("//**trim method-----------");
	    String t1="   Appu   ";
	    System.out.println(t1);
	    System.out.println(t1.trim());
	    
	    **/
	    //**charAt method
	    System.out.println("//**charAt method-----------");
	    String ch="Gowda";
	    System.out.println(ch.charAt(4));
	    /**
	    //**equalsTo method
	    System.out.println("//**equalsTo method-----------");
	    String e1="Jeevan";
	    String e2="Appu";
	    String e3="jeevan";
	    System.out.println(e1.equals(e2));
	    System.out.println(e1.equalsIgnoreCase(e3));
	    System.out.println(e1==e2);
	    
	    //**replace method
	    System.out.println("//**replace method-----------");
	    String rp="Jeevan welcome to java selenium,Python selenium and c# selenium";
	    System.out.println(rp.replace('a', 'x'));
	    System.out.println(rp.replace("selenium", "language"));
	    String rp2="abcdabcd";
	    System.out.println(rp2.replace('a', 'z').replace('z', 'j'));
	    
	    //**subString method
	    System.out.println("//**subString method-----------");
	    String ss="Jeevan";
	    //012345 ---first index
	    //jeevan
	    //123456 ---last index
	    System.out.println(ss.substring(0,4));
	    
	    //**toUppercase and toLowerCase method
	    System.out.println("//**toUppercase and toLowerCase method-----------");
	    String uc="jeevan";
	    System.out.println(uc.toUpperCase());
	    String lc="APPU";
	    System.out.println(lc.toLowerCase());
	    System.out.println("gowda".toUpperCase());
	    
	    //**split method
	    System.out.println("//**split method-----------");
	    String sp="jeevangowda@016gmail,com";
	    String a1[]=sp.split("@");
	    System.out.println(a1[0]);
	    System.out.println(a1[1]);
	    System.out.println(Arrays.toString(a1));
	    String a2[]=a1[1].split(",");
	    System.out.println(Arrays.toString(a2));
	    **/


}

}
