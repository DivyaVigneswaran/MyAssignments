package week2.day3;

public class OddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] charArray = test.toCharArray();
		for (int i = charArray.length;i>=0; i--) {
			if(i%2!=0) {
				charArray[i] = Character.toUpperCase(charArray[i] );
			}
			
		}
		System.out.println(charArray);
	}

}
