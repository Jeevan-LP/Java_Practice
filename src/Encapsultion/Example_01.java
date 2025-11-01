package Encapsultion;

public class Example_01{
	
	private String StudentName;
	private String Sub;
	private char Grade;
	
	public void setStudentName(String StudentName27) {
		StudentName=StudentName27;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setSub(String Sub) {
		this.Sub=Sub;
	}
	public String getSub() {
		return Sub;
	}
	public void setGrade(char Grade) {
		this.Grade=Grade;
	}
	public char getGrade() {
		return Grade;
	}

	public Example_01(String StudentName,String Sub,char Grade){
		this.StudentName=StudentName;
		this.Sub=Sub;
		this.Grade=Grade;
	}

}
