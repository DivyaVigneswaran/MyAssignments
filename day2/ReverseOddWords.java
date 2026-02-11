package week2.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "I am a software tester";
		String[] words = test.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (i % 2 != 0) {

				// Convert word to character array
				char[] charArray = words[i].toCharArray();

				// Reverse the word using nested loop
				for (int j = charArray.length - 1; j >= 0; j--) {
					System.out.print(charArray[j]);
				}

				// Space after each word
				System.out.print(" ");
			} else {
				// Print even position word as it is
				System.out.print(words[i] + " ");
			}
		}
	}
}