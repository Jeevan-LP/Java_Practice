package Exception;

import java.io.FileNotFoundException;

public class PropogationCheckedException {

	String Product;
	
	public void setProduct(String Product) throws FileNotFoundException{
	
		this.Product=Product;
		throw new FileNotFoundException();
		
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("main starts");
		PropogationCheckedException d=new PropogationCheckedException();
		try {
			d.setProduct("cloths");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("main ends");

		
	}
}
