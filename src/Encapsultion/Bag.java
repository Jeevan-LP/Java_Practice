package Encapsultion;

public class Bag {

	private String Bookname;
	private int Pen;
	private int pencil;

	public String getBookname() {
		return Bookname;
	}

	public void setBookname(String bookname) {
		Bookname = bookname;
	}

	public int getPen() {
		return Pen;
	}

	public void setPen(int pen) {
		Pen = pen;
	}

	public int getPencil() {
		return pencil;
	}

	public void setPencil(int pencil) {
		this.pencil = pencil;
	}

	
	public void School(String Bag) {
		System.out.println("it is a school bag");
	}
	
	public void Tracking(String Bag){
		System.out.println("it is a tracking bag");
	}
	
	public Bag(String Bookname,int Pen,int pencil) {
		
		this.Bookname=Bookname;
		this.Pen=Pen;
		this.pencil=pencil;
	}
	
}
