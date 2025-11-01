package Encapsultion;

public class Example_01Main {

	public static void main(String[] args) {

		Example_01 ex = new Example_01("Appu", "English", 'B');
		System.out.println(ex.getStudentName());
		System.out.println(ex.getSub());
		System.out.println(ex.getGrade());

		ex.setStudentName("Jeeva L P");
		System.out.println(ex.getStudentName());
		ex.setSub("Kannada");
		System.out.println(ex.getSub());
		ex.setGrade('A');
		System.out.println(ex.getGrade());
		System.out.println();
		
	}

}
