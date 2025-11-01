package Interface;

public class zooMain implements zoo{

	public void water() ////abstract method with method body
		 {
			System.out.println("drinking water");
		}

	void king() {
		 System.out.println("lion is king of jungle");
	 }
		public static void main(String[] args) {
			
			zooMain an = new zooMain();
			an.color();
			an.water();
			Forest.food();
			an.king();
			
			/**
			zoo zo=new zooMain();
			zo.color();
			zo.water();
			zoo.food();
			**/
	}

}
