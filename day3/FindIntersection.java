package week2.day3;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare Array
		int[] a = { 3, 2, 11, 4, 6, 7 };
		int[] b = { 1, 2, 8, 4, 9, 7 };

		// Declare for loop iterator from 0 to array length
		for (int i = 0; i < a.length; i++) {

			// Declare a nested for another array from 0 to array length
			for (int j = 0; j < b.length; j++) {
				// Compare both the arrays using a conditional statement.
				if (a[i] == b[j]) {
					
					//Print the value from first array when there is a match
					System.out.println("Match found: " + a[i]);
				}

			}

		}

	}

}
