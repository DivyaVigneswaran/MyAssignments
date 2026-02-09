package week2.day1;

public class ForStatement {
	public static void main(String[] args) {
		// Declaring variable
		int n = 10;
		
		
		// Iteration for For Loop
		for (int i = 0; i < n; i++) {
			if (i==3) {
				System.out.println("The given number is 3");
				
			}
			else if (i==7) {
				System.out.println("The given number is 7");
				continue;
				
			}
			System.out.println(i);
			
		}
			
			
	}

}
