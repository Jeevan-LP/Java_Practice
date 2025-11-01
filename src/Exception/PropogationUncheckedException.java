package Exception;

public class PropogationUncheckedException {

	int Price;

	public void setPrice(int Price) {
		
		if(Price>0) {
			this.Price=Price;
			}
		else {
			throw new ArithmeticException();/////call'd
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("main stars");
		PropogationUncheckedException p=new PropogationUncheckedException();
		try {
		p.setPrice(-200);////////////////////////////////////////////////////////////caller
	}
	catch(ArithmeticException e) {
		e.printStackTrace();
	}
		System.out.println("main ends");
		}
	}	

