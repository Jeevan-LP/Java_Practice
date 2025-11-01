package Polymorphism;

public class MethodOverRideBankApplicationMain extends MethodOverRideBankApplication{

	public void PhonePay(double Amount) {
		balance=balance-Amount;
		System.out.println("Current balance = "+balance);
		System.out.println("Amount is debited SuccessFully = "+Amount);
	}
	
	public static void main(String[] args) {
		MethodOverRideBankApplicationMain Bank = new MethodOverRideBankApplicationMain();
		Bank.PhonePay(455);

		

		


	}
}
