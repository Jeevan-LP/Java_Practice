package Encapsultion;

public class AppuAccount {
	
	 private int AccNo;
	 private String AccName;
	 private int Bal;
	 
/////////////********without this keyword	

	 /**
	 int getAccountNumber() {
		 return AccNo;
	 }
	 void setAccountno(int accno) {
		 AccNo=accno;
	 }
	 
	 String getAccountName() {
		 return AccName;
	 }
	 
	 void setAccountName(String accname) {
		 AccName=accname;
		 
	 }
	 
	 int getBalance() {
		 return Bal;
	 }
	 
	 void setBalance(int bal) {
		 Bal=bal;
	 }

**/
	 
/////////////********with this keyword	

	int getAccountNumber() {
			return AccNo;
			
		}
	void setAccountNumber(int AccNo) {
		this.AccNo=AccNo;
	}
	

	String getAccountName() {
		return AccName;
	}
	
	void setAccountName(String AccName) {
		this.AccName=AccName;
	}
	

	int getBalance() {
		return Bal;
	}
	void setBalance(int Bal) {
		this.Bal=Bal;
	}
	


}
