package week4.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		// Declare String array
		String[] companies = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		// Add array values to List
		List<String> companyList = new ArrayList<>();

		for (String company : companies) {
			companyList.add(company);
		}

		// Sort the list in ascending order
		Collections.sort(companyList);
		
		// Reverse iterate and print
		System.out.println("Reversed Order:");

		for (int i = companyList.size() - 1; i >= 0; i--) {
			System.out.println(companyList.get(i));
		}
	}
}
