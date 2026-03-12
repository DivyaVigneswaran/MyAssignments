package week6.day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SalesForceCucumber {

	public static void main(String[] args) throws InterruptedException {
		// Launch Browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=/Users/vigneswaranmurugesan/SeleniumProfile");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Login to https://login.salesforce.com
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("divyaseelan1994.e8571c262657@agentforce.com");
		driver.findElement(By.id("password")).sendKeys("Summer$012025");
		driver.findElement(By.id("Login")).click();
		// Click toggle
		WebDriverWait wait = new WebDriverWait((WebDriver) driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='App Launcher']"))).click();

		// Click View All
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		// Click Sales
		driver.findElement(By.xpath("//p[text()='Sales']")).click();

		// Account Tab

		WebElement Account = driver.findElement(By.xpath("//a[@title='Accounts']"));
		driver.executeScript("arguments[0].click();", Account);

		// New
		driver.findElement(By.xpath("//div[@title='New']")).click();

		// Name
		String name = "Divya";
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);

		// Ownership - Public
		Thread.sleep(3000);
		WebElement Ownership = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
    	driver.executeScript("arguments[0].click();", Ownership);
        driver.findElement(By.xpath("//span[text()='Public']")).click();

		// Save
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		//Verify Name
		String createdName = driver.findElement(By.xpath("//lightning-formatted-text")).getText();

        Assert.assertEquals(createdName, name);

        System.out.println("Account Created Successfully");

        driver.quit();
    }
}
