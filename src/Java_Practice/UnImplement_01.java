package Java_Practice;

public interface UnImplement_01 {

	String role="QA";
	public static int sal=10000;

	static void companyName() {
		System.out.println("In4Velocity");
	}
	
	default void companyLocation() {
		System.out.println("Near garuda mall");
	}
	
	abstract void companyLogo();
	

}
