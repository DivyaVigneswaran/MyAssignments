package week6.day16;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends projectSpecificMethod {

	// @DataProvider - Data driven testing

	@DataProvider(name = "getValue")
	public String[][] fetchData() {
		// |cName|fName|lName|
		// |TestLeaf|Hari|R|
		// |TestLeaf|srini|vasan|

		String[][] data = new String[2][3];
		data[0][0] = "TestLeaf";
		data[0][1] = "Hari";
		data[0][2] = "R";

		data[1][0] = "TestLeaf";
		data[1][1] = "Srini";
		data[1][2] = "Vasan";
		return data;
	}

	@Test(dataProvider = "getValue")
	public void createLead(String cName, String fName, String lName) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();

	}
}