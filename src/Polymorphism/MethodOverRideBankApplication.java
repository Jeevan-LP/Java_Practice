package Polymorphism;

public class MethodOverRideBankApplication {

	double balance=1000;
	
	public void PhonePay(double Amount) {
		balance=balance+Amount;
		System.out.println("Current balance = "+balance);
		System.out.println("Amount is credited successFully = "+Amount);
		
	}
}
