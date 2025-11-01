package Static;

public class StaticAndNonstatic {
	
	int empID=27;
	static int deptNo=27; //static variable
	String empname="Appu"; //non-static variable
	
	static void m1() {//static method

		System.out.println("static method");
	}
	
	void m2() { //non-static method

		System.out.println("2nd non static method");
	}
	
	void m() { //non-static method

		System.out.println(deptNo);
		m1();
		m2();
		System.out.println("1st non static method");
	}
	


	/*public static void main(String[] args) {
		StaticAndNonstatic s=new StaticAndNonstatic();

		//System.out.println(deptNo);
		//m1();
		s.m();

	}
	*/
}
