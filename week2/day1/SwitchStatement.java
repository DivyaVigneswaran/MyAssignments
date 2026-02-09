package week2.day1;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare variable
		String browsername = "Chrome";
		
		// Switch Statement
		
		switch (browsername) {
		case "Edge":
			System.out.println("This is executing in Edge");
			break;
		case "Chrome":
			System.out.println("This is executing in Chrome");
			break;
		case "Firefox":
			System.out.println("THis is executing in Firefox");
			break;
		default:
			System.out.println("This is Executing in Safari");
			break;
		}
	}

}
