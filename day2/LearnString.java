package week2.day2;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String Literal - Heap (String constant pool)
		String number = "Divya";

		// String Instantiation - Directly into the Heap Memory
		String num = new String("DIVYA");

		// length()
		System.out.println("Number of characters is " + number.length());

		// .equals()
		if (number.equals(num)) {
			System.out.println("The String value is EQUAL");

		} else {
			System.out.println("The String is DIFFERENT");
		}

		// .equalsIgnoreCase()
		if (number.equalsIgnoreCase(num)) {
			System.out.println("The String value is EQUAL");

		} else {
			System.out.println("The String is DIFFERENT");
		}

		// .contains()
		String name = "Sujatha";
		String refname = "Butterfly";
		boolean contains = name.contains(refname);
		System.out.println(contains);

		// .toCharArray()
		String character = "Murali";
		char[] charArray = character.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.println(charArray[i]);

		}

		// .charAt()

		System.out.println("The Character in the index is " + character.charAt(3));

	}

}
