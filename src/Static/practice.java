package Static;

public class practice {
	
	//1st approach///////////////////////////////////////////////////
	
	String name="jeevan";
	void details() {
		System.out.println(name);
	}

	public static void main(String[] args) {

		practice p=new practice();
		p.details();

	}
	
	
	//2nd approach///////////////////////////////////////////////////
    /**
	void details(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {

		practice p=new practice();
		p.details("Appu");

	}
	**/
	
	//3rd approach///////////////////////////////////////////////////
	/**
	String name;
	
	String getdetails() {
		return name;
	}
	void setdetails(String name) {
		this.name=name;
	}
	public static void main(String[] args) {

		practice p=new practice();
		p.setdetails("gowda");
		System.out.println(p.getdetails());
	}
	**/
	
	//1st approach///////////////////////////////////////////////////
	/**
	String name;
	void details(String name) {
		this.name=name;
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		practice p=new practice();
		p.details("27092001");
	}
	**/
	
}
