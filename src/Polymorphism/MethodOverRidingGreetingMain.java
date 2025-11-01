package Polymorphism;

public class MethodOverRidingGreetingMain extends MethodOverRidingGreeting{

	public void Greetings() {
		System.out.println("Good Evening");
	}
	
	public static void main(String[] args) {

		MethodOverRidingGreetingMain m1 = new MethodOverRidingGreetingMain();
		MethodOverRidingGreeting m2 = new MethodOverRidingGreeting();
		m1.Greetings();
		m2.Greetings();
		}

}
