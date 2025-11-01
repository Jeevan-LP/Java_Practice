package Polymorphism;

public class MethodOverLoadingPhonepay {
	
	public void phonepay(String ConName) {
		System.out.println("send the amount through concactname");
		
	}

	public void phonepay(long SearchNumber) {
	System.out.println("send the amount through serachName");

	}
	public void phonepay(double Amount) {
	System.out.println("send the amount through amount");

}
	public static void main(String[] args) {
	
	MethodOverLoadingPhonepay app = new MethodOverLoadingPhonepay();
	app.phonepay("Jeevan");
	app.phonepay(7760410520l);
	app.phonepay(45.4);
}


}
