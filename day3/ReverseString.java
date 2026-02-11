package week2.day3;

public class ReverseString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initialize the String 
		String companyName="Testleaf";
		
		// Convert String to a character array
		char[] charArray = companyName.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
			System.out.println(charArray[i]);
			
		}

	}

}
