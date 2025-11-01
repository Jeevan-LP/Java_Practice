package Collections;

public class Area implements Comparable<Area>{

	int length;
	int height;
	int area;
	
	public String toString() {
		return "Area[length="+length+",height="+height+",area="+area+"]";
		}
	public Area(int length,int height,int area) {
		super();
		this.length=length;
		this.height=height;
		this.area=area;
		
	}

	@Override
	public int compareTo(Area o) {
	
		return this.length-o.length;
	}
		
	}


