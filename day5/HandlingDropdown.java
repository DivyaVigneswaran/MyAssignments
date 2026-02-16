package week3.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(opt);
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Divya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sri");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SAMQUA");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("JOB");
		
		WebElement findElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select opt1 = new Select(findElement);
		opt1.selectByIndex(3);
		
		WebElement findElement2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select opt2 = new Select(findElement2);
		opt2.selectByVisibleText("Automobile");
		
		WebElement findElement3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select opt3 = new Select(findElement3);
		opt3.selectByValue("OWN_CCORP");
		
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
