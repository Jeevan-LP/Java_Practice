package Polymorphism;

public class MethodOverLoadingArea {

	public void area(int r) {
		
	final double pi=3.14;
		System.out.println("Area of circle = "+(pi*r*r));
		
	}
	
    public void area(int b,double h) {
		System.out.println("Area of triangle = "+(0.5*b*h));
		
	}
    public void area(double b) {
		System.out.println("Area of Square = "+(b*b));

	}
    public static void main(String[] args) {
		
    	MethodOverLoadingArea m1 = new MethodOverLoadingArea();
    	
    	m1.area(4);
    	m1.area(2, 5.6);
    	m1.area(4,5);
    	
    	}
 }
