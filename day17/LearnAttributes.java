package week6.day17;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	@Test(priority=1, enabled=true)
	public void createLead() {
		System.out.println("Create Lead");

	}
	@Test(invocationCount = 3, invocationTimeOut=3000)
	public void deleteLead() {
		System.out.println("Delete Lead");

	}
	@Test(priority=4, dependsOnMethods="createLead", alwaysRun=true)
	public void editLead() {
		System.out.println("Edit Lead");

	}
	@Test(priority=3,enabled= true)
	public void mergeLead() {
		System.out.println("Merge Lead");

	}
	@Test(enabled=false,priority=2)
	public void duplicateLead() {
		System.out.println("Duplicate Lead");

	}
}
