package week2.day3;

import java.util.Arrays;

public class FindMissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare the array
		int num[] = { 1, 4, 3, 2, 8, 6, 7 };
		
		//Sort the number
		Arrays.sort(num);
		
		//Declare For loop
		for (int i = 0; i < num.length; i++) {
			
			//Check if the iterator variable is not equal to the array values
			if (num[i] != i + 1) {
				System.out.println("Missing Number is: " + (i + 1));
				break;
			}

		}

	}

}
