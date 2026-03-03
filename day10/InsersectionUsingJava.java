package week4.day10;

import java.util.ArrayList;
import java.util.List;

public class InsersectionUsingJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] Array = { 3, 2, 11, 4, 6, 7 };
		int[] Arr = { 1, 2, 8, 4, 9, 7 };

		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		for (int num : Array) {
			A.add(num);
		}

		for (int num : Arr) {
			B.add(num);
		}

		// Find and print intersection
		System.out.println("Intersection elements are:");

		for (Integer value : A) {
			if (B.contains(value)) {
				System.out.println(value);
			}
		}
	}

}
