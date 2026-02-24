package week4.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestUsingList {

	public static void main(String[] args) {
		// Declare array
		int[] arr = { 3, 2, 11, 4, 6, 7 };

		// Convert array to List
		List<Integer> list = new ArrayList<>();
		for (int num : arr) {
			list.add(num);

		}
		// Sort the list in ascending order
		Collections.sort(list);
		
		 // Pick the second element from the last
        int secondLargest = list.get(list.size() - 2);
        
        System.out.println("Second Largest Number is " + secondLargest);
	}

}
