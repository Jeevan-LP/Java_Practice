package ForLoop;

public class ForLoop_05 {
	
	public static void main(String[] args) {
		/*
		 * If given condition is true the continue statement will work 
		 * And directly go to the for loop for next itarations and remaining/rest of line or code does not execute
		 * If given condition is false the continue statement will not work 
		 * And remaining/rest of line or code does execute
		 * continue keyword must be last statement in block
		 */
		for(int i=1;i<=10;i++) {
			if(i==6 || i==8) {
				continue;
			} 
			System.out.println(i+" ");
		}
		
		for(int i=1;i<=10;i++) {
			if(i==5 || i==7) {
				System.out.println(i+" ");
				continue;
			}
			
		}
		
		
	}
}

