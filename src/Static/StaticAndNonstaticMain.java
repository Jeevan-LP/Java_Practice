package Static;

public class StaticAndNonstaticMain {

	public static void main(String[] args) {

		StaticAndNonstatic s=new StaticAndNonstatic();
		s.m();
		StaticAndNonstatic.m1();
	
	}

}

/*
 1.Main method is also static method
 2.Non static method invoke the all static variable/method or non static variable/method
 3.Main method invoke the Non static variable/method with help of object creation
 4.Main method invoke the static variable/method directly without help of object creation when main method is in same class
 5.Main method invoke the static variable/method with help of class name when main method is in another class
 */