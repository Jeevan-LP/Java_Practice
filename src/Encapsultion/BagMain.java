package Encapsultion;

public class BagMain {

	public static void main(String[] args) {

		Bag bag = new Bag("vidya", 2, 4);
		//bag.School("Puma Bag");
		//bag.Tracking("Americantourist");
		System.out.println(bag.getBookname());
		bag.setBookname("lekana");
		//System.out.println(bag.getBookname());
	}

}
