package week5.day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnMoveTo {

	public static void main(String[] args) {
		// Launch Browser

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		ChromeDriver driver = new ChromeDriver(options);

		// Maximize the browser
		driver.manage().window().maximize();

		driver.get("https://www.snapdeal.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//MoveTo
		WebElement moveTo = driver.findElement(By.xpath("//div[text()='Home & Kitchen']"));

		Actions act = new Actions(driver);
		act.moveToElement(moveTo).perform();
		
		//Scroll To
		WebElement scrollTo = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		act.scrollToElement(scrollTo).perform();
		scrollTo.click();
		
		
	}

}
