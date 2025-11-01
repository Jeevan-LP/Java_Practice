package Encapsultion;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount d1 = new BankAccount("Jeevan","KARB32425",1000,"987654321");
		System.out.println(d1.IFSC);
		System.out.println(d1.bal);
		System.out.println(d1.AccountNumber);
		d1.deposite(150);
		System.out.println("the total balance "+d1.bal);
		d1.withdraw(500);
	
		System.out.println(d1.getAccountName());
		d1.setAccountName("appu");
		System.out.println(d1.getAccountName());
	}
}
