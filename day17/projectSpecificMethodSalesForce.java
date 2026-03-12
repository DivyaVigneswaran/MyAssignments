package week6.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class projectSpecificMethodSalesForce extends SalesForce {
	
	@BeforeClass
	public void setData() {
		filename="CreateLead";
	}
	@Test(dataProvider = "getValue")
	public void project(String entityName, String companyName, String Desc) {
		// Click on New Legal Entity
			driver.findElement(By.xpath("//li[.//div[@title='New']]")).click();
			driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(entityName);
			
			// Enter the Company name as 'TestLeaf
			driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(companyName);
			
			// Enter Description as 'Salesforces'.
			driver.findElement(By.xpath("//label[text()='Description']/following-sibling::div//textarea")).sendKeys(Desc);
			
			// Select Status as 'Active'
			WebElement Status = driver.findElement(By.xpath("//button[@aria-label='Status']"));
			driver.executeScript("arguments[0].click();", Status);
			driver.findElement(By.xpath("//span[@title='Active']")).click();
			
			// Click on Save
			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

}
