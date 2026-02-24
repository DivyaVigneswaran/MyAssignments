package week4.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementUsingList {

	public static void main(String[] args) {

		int[] Array = { 1, 2, 3, 4, 10, 6, 8 };

		List<Integer> list = new ArrayList<Integer>();

		for (int num : Array) {
			list.add(num);

		}
		
		// Sort the list in ascending order
		Collections.sort(list);
		
		 System.out.println("Missing elements are:");
		
		// Check for gaps in sequence
		for (int i = 0; i < list.size() - 1; i++) {

			int current = list.get(i);
			int next = list.get(i + 1);

			// If there is a gap
			if (current + 1 != next) {

				// Print all missing numbers between current and next
				for (int j = current + 1; j < next; j++) {
					System.out.println(j);
				}
			}
		}
	}
}