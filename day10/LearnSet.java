package week4.day10;

import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] setValue = {'a','e','o','u','i'};
		
		Set<Character> unique = new TreeSet<Character>();
		
		//HashSet - RandomOrder - doesnot follow insertion order  - Follow random Order
		//LinkedHashSet - Follow insertion order
		//Treeset -ASCII
		
		System.out.println(unique);
		 for (Character i : setValue) {
			 unique.add(i);
			
		}
		 System.out.println(unique);
		 unique.add('y');
		 System.out.println(unique);
	}

}
