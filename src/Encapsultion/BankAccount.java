package Encapsultion;

public class BankAccount {
	private String AccountName;
	String IFSC;
	double bal;
	String AccountNumber;
	
	public String getAccountName() {
		return AccountName;
		}
	public void setAccountName(String AccountName) {
		this.AccountName=AccountName;
	}
	
	public void deposite(double amount) {
		bal=bal+amount;
		System.out.println(amount+ " is credited successfully");
		System.out.println("the current amount "+bal);
		}
	
	public void withdraw(double amount) {
		bal=bal-amount;
		if(bal>amount) {
			System.out.println(amount+ " is debited successfully");
			System.out.println("the current bal is "+bal);
		}
		else {
			System.out.println("check your balance");
		}
	}
	BankAccount(String AccountName,String IFSC,double bal,String AccountNumber){
		this.AccountName=AccountName;
		this.IFSC=IFSC;
		this.bal=bal;
		this.AccountNumber=AccountNumber;
		}
}
	
		
	
