package Exception;

public class InvalidNameExceptionMain {

	String Name;
	public void setName(String Name) throws Throwable {
		if(Name!="Bags") {
			
			this.Name=Name;
			
		}
		else {
			throw new InvalidNameException("Bags");
		}
	}
	
	public static void main(String[] args) {
		
		InvalidNameExceptionMain m1 = new InvalidNameExceptionMain();
		try {
			m1.setName("Bags");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
