package Loops;

public class BrowserSwitch {

	public void browser() {
		
		///*** browser switch condition
		String browser="edge";
		
		switch(browser) {
		
		case "Uc mini": System.out.println("uc mini browser");
		break;
		
		case "edge": System.out.println("edge browser");
		break;
		
		case "fire fox": System.out.println("firefox browser");
		break;
		
		case "opera": System.out.println("opera browser");
		break;
		
		default: System.out.println("chrome browser");
		}
		
		///*** days switch condition
        int i=4;
		
		switch(i) {
		
		case 1: 
		System.out.println("Monday");
		break;
		case 2: 
		System.out.println("Tuesday");
		break;
		case 3: 
		System.out.println("Wednesday");
		break;
		case 4: 
		System.out.println("thursday");
		break;
		case 5: 
		System.out.println("Friday");
		break;
		case 6: 
		System.out.println("Saturday");
		break;
		case 7:
		System.out.println("Sunday");////like a if block or if else block
		break;
		default:
		System.out.println("No days");////like else block
		}
		
		///*** months switch condition
		String month="September";
		switch(month) {
		
		case "January":
		System.out.println("this month is january");
		break;
		case "Feberary":
		System.out.println("this month is Feberary");
		break;
		case "March":
		System.out.println("this month is March");
		break;
		case "April":
		System.out.println("this month is April");
		break;
		default:
		System.out.println("Not a month");
		}
		
		}
	}


