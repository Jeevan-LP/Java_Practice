package Inheritence;

class J{
	void perentmethod(int j) {
		System.out.println(j);
	}
}

class K extends J
{
	void child1method(int k) {
		System.out.println(k);
	}
}

class L extends J
{
	void child2method(int l) {
		System.out.println(l);
	}
}


public class Hiracricial {

	public static void main(String[] args) {

		L l1=new L();
		l1.child2method(20);
		l1.perentmethod(98);
		
		K k1=new K();
		k1.child1method(60);
		k1.perentmethod(87);
	}

}
