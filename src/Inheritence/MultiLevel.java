package Inheritence;

class X{
	void xmethod(int j) {
		System.out.println(j);
	}
	
}

class Y extends X
{
	void ymethod(double k) {
		System.out.println(k);
	}

}

class Z extends Y
{
	void zmethod(float l) {
		System.out.println(l);
	}
	
}

public class MultiLevel {

	public static void main(String[] args) {

		Z z1=new Z();
		z1.xmethod(20);
		z1.ymethod(20.56);
		z1.zmethod(151F);
		
	}

}
