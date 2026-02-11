package week2.day2;

import java.util.Arrays;

public class LearnStringHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Check Lengths of the two strings are equal
		String text1 = "stops";
		String text2 = "potss";
		if (text1.length()!=text2.length()) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			return;
		}
		else {
			System.out.println("It is a Anagram");
		}
		
		// Convert both the strings to character arrays
		char[] charArray = text1.toCharArray();
		char[] charArray1 = text2.toCharArray();
	
		//Sort both the character arrays
		Arrays.sort(charArray);
		Arrays.sort(charArray1);
		
		//If the sorted arrays are equal
		if (Arrays.equals(charArray,charArray1)) {
			System.out.println("The given strings are Anagram.");
		}
		else {
			System.out.println("The given strings are not an Anagram.");
		}

	}

}
