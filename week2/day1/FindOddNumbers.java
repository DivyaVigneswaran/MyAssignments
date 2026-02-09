package week2.day1;


public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare the variable 
		int maxRange= 10;
		
		// initialise for loop
		
		for (int i = 0; i<= maxRange; i++) {
			if (i%2==1) {
				System.out.println("This is Odd Number");
				
			}
			else {
				System.out.println("This is Even Number");
			}
			System.out.println(i);
		}
		}
			

	}

