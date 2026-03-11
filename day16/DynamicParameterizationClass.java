package week6.day16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class DynamicParameterizationClass {
	// global
			ChromeDriver driver;

			// Step1: to declare the name & value in the .xml <parameter>
			// Step2: to declare the @Parameters annotation on top of the req. method & pass
			// the key/name to the @Parameters

			@Parameters({ "url", "userName", "passWord" })
			@BeforeMethod
			// Step3: pass the arguments to match the key/name in the @Paramaters
			public void preCondition(String url, String uName, String pWord) throws InterruptedException {

				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("user-data-dir=/Users/vigneswaranmurugesan/SeleniumProfile");
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys(uName);
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pWord);
				driver.findElement(By.xpath("//input[@type='submit']")).click();
			}

			@AfterMethod
			public void postCondition() {
				driver.close();
			}
		}
