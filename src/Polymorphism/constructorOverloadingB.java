package Polymorphism;

public class constructorOverloadingB {
	
	double height, width, depth;
	
	constructorOverloadingB(){
		height=width=depth;
	}

	constructorOverloadingB(double h, double w, double d){
		height=h;
		width=w;
		depth=d;
	}
	
	double volume(){
		return(height*width*depth);
	}
	
}
