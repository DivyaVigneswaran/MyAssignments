package week2.day3;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array Literal
		int[] marks = {10,50,37,58,90};
		
		// TO find the length of the Array 
		int length = marks.length;
		System.out.println("The length of the array is " +length);
		
		//To print the random values based on Size
		System.out.println(marks[3]);
		
		// How to retrieve the values - loop
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		//To print Lowest to Highest
		
		Arrays.sort(marks);
		System.out.println("After sorting "+marks[2]);
		
		// To print the highest
		System.out.println("After sorting the highesh is "+marks[marks.length-1]);
		
		//Array Instantiation
		
		int[] Scores = new int[5];
		Scores[0]=45;
		Scores[1]=46;
		Scores[2]=47;
		Scores[3]=48;
		Scores[4]=49;
		
		

	}

}
