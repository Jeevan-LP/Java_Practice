package Casting;

public class DataType {

	public static void main(String[] args) {

		///***without decimal data type
		byte bx=100,by=50;
		System.out.println("byte sum of value is "+(bx+by));////*** size is 1 byte
		
		short sx=100,sy=200;
		System.out.println("short sum of value is "+(sx+sy));////*** size is 2 byte
		
		int ix=200,iy=350;
		System.out.println("int sum of value is "+(ix+iy));////*** size is 4 byte
		
		long lx=6645484l,ly=254687887655l;
		System.out.println("long sum of value is "+(lx=ly));////*** size is 8 byte
		
		///***with decimal data type
		float fx=584.548484f,fy=54687.156487f;
		System.out.println("float sum of value "+(fx+fy));////*** size is 4 byte
		
		double dx=56468.1534568,dy=9898.4478777;
		System.out.println("double sum of value "+(dx+dy));////*** size is 8 byte
		
		char ch='J';
		System.out.println(ch);
		
		boolean b=true;
		System.out.println(b);
		
		}

}
