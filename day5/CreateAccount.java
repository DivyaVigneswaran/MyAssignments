package week3.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		//Launch the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		// Maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR2");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("DIvya2");
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");
		WebElement findElement = driver.findElement(By.name("industryEnumId"));
		
		Select drop = new Select(findElement);
		drop.selectByVisibleText("Computer Software");
		
		WebElement findElement2 = driver.findElement(By.name("ownershipEnumId"));
		Select drop2 = new Select (findElement2);
		drop2.selectByVisibleText("S-Corporation");
		
		WebElement findElement3 = driver.findElement(By.id("dataSourceId"));
		Select drop3 = new Select (findElement3);
		drop3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement findElement4 = driver.findElement(By.name("marketingCampaignId"));
		Select drop4 = new Select(findElement4);
		drop4.selectByIndex(6);
		
		WebElement findElement5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select drop5 = new Select(findElement5);
		drop5.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//String text = driver.findElement(By.xpath("span[text()='DIvya26']")).getText();
		//System.out.println(text);
		
		driver.close();
		
	}

}
