package week2.day2;

public class OddIndexUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "changeme";
		char[] charArray= test.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			if(i%2!=0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}
		
		System.out.println(charArray);
	}

}
