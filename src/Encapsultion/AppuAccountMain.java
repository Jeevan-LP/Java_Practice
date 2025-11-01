package Encapsultion;

public class AppuAccountMain {

	public static void main(String[] args) {

		AppuAccount ep=new AppuAccount();
		/////////////********without this keyword	

		/**
		ep.setAccountno(53464646);
		System.out.println(ep.getAccountNumber());
		
		ep.setAccountName("Appu L P");
		System.out.println(ep.getAccountName());
		
		ep.setBalance(600000);
		System.out.println(ep.getBalance());
		**/
		
		/////////////********with this keyword
		ep.setAccountNumber(968741100);
		System.out.println(ep.getAccountNumber());
		
		ep.setAccountName("Jeevan L P");
		System.out.println(ep.getAccountName());
		
		ep.setBalance(500000);
		System.out.println(ep.getBalance());

	}
	
}
