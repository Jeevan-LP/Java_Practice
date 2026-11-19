package Exception;

public class CustomException {

    int price;

    public void setPrice(int price) throws InvalidPriceException {

        if (price > 0) {
            this.price = price;
            System.out.println(this.price);
        } else {
            throw new InvalidPriceException("Invalid price");
        }
    }

    public static void main(String[] args) {

    	CustomException data = new CustomException();

            try {
				data.setPrice(-100);
			} catch (InvalidPriceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
     
        
    }
}


class InvalidPriceException extends Exception{
	
	public InvalidPriceException(String name) { 
		super(name);
	}
}