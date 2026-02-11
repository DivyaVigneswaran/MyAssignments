package week2.day3;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SPLIT();
		String test ="Good Morning Divya ";
		String[] split= test.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}

		//REPLACE();
		
		String repname ="Divya";
		String replace = repname.replace('a', '@');
		System.out.println(replace);
		
		//REPLACEALL();
		
		String repAll="Welcome to Chennai";
		String replaceAll = repAll.replaceAll("Welcome", "Madurai");
		System.out.println(replaceAll);
		
		//LOWERCASE();
		
		String lower="DIVYA";
		System.out.println(lower.toLowerCase());
		
		//UPPERCASE();
		
		String upper = "smrithi";
		System.out.println(upper.toUpperCase());
		
		//PARSEINT();
		
		String price ="4999";
		int int1 = Integer.parseInt(price);
		System.out.println(int1);
	}

}
