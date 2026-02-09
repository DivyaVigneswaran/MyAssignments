package week2.day1;

public class FibonacciSeries {

	public static void main(String[] args) {

		// Declaring variables
		int n = 8;

		// Initialising a and b variables

		int a = 0, b = 1;
		
		//Use FOR loop for a defined number of Iterations.
		for (int i = 0; i < n; i++) {
			System.out.println(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}
	}
}
