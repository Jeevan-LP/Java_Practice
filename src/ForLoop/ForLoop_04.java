package ForLoop;

public class ForLoop_04 {
	
	public static void main(String[] args) {
		/*
		 * If given condition is true the break statement will work 
		 * And directly exit from the loop and remaining/rest of line or code does not execute
		 * If given condition is false the break statement will not work 
		 * And remaining/rest of line or code does execute
		 * break keyword must be last statement in block
		 */
		for(int i=1;i<=10;i++) {
			if(i==6) {
				break;
			}
			System.out.println(i+" ");
		}
		
		for(int i=1;i<=10;i++) {
			if(i==8) {
				System.out.println(i+" ");
				break;
			}
			
		}
		
	}
}

