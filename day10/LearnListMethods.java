package week4.day10;

import java.util.ArrayList;
import java.util.List;

public class LearnListMethods {
	public static void main(String[] args) {

		List<Integer> value = new ArrayList<Integer>();
		value.add(19);
		value.add(20);
		System.out.println(value);
		
		List<Integer> value2 = new ArrayList<Integer>();
		System.out.println(value2);
		value.addAll(value2);
		System.out.println(value);
		
		value2.add(45);
		System.out.println(value);
		
		value.addAll(value2);
		System.out.println(value);
		
		//get - inderx starts from 0
		
		System.out.println("The Value present in the index (2) in value" +value.get(2));
		
		//remove - Based on Index
		
		//value.remove(0);
		//value2.remove(0);
		//System.out.println("After removing the index(0) in value "+ value);
		//System.out.println("After removing the index(0) in value "+ value2);
		
		//removeAll
		//value.removeAll(value);
		//System.out.println("The value present after remove all is "+value);
		
		//Size
		
		System.out.println(value);
		System.out.println("Size of the value is "+ value.size());
		
		//Clear
		value.clear();
		value2.clear();
		System.out.println(value);
		System.out.println(value2);
	}

}
