package week2.day3;

import java.util.Arrays;

public class PrintDuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Step 1: Create array with duplicate data

		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		
		// Step 2: Sort the array

		Arrays.sort(num);
		System.out.println("After sorting "+num[2]);
		
		// Step 3: Iterate and compare with next element
		for (int i = 0; i < num.length-1; i++) {
			if (num[i]==num[i+1]) {
				System.out.println(num[i]);
				
			}
			
		}
	}

}
