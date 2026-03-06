package week5.day14;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_Amazon {

	public static void main(String[] args) throws IOException {
		// Launch Browser

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		// Maximize the browser
		driver.manage().window().maximize();

		// Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		// Launch URL
		driver.get("https://www.amazon.in/");

		// Search "One Plus Pro"
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
		String firstProductPrice = driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText();
		System.out.println("Price of First Product is : " + firstProductPrice);

		// Print the Customer Ratings
		String customerRatings = driver.findElement(By.xpath("(//div[@class='a-row a-size-small'])[1]")).getText();
		System.out.println("Customer Rating of the First Product is " + customerRatings);

		// first text link of the first image.
		driver.findElement(By.xpath(
				"(//a[@class='a-link-normal s-line-clamp-2 puis-line-clamp-3-for-col-4-and-8 s-link-style a-text-normal'])[1]"))
				.click();

		// Switching to CHild Window
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println(childWindow);

		// Convert Set To List
		List<String> currentlyactivewindow = new ArrayList<String>(childWindow);

		// Switch to Child Window
		driver.switchTo().window(currentlyactivewindow.get(1));

		// To get the SCreenshot
		File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File target = new File("./data/Snap.png");
		FileUtils.copyFile(screenshotAs, target);

		// Click Add to Cart

		WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		Actions act = new Actions(driver);
		act.moveToElement(addToCart).perform();
		addToCart.click();

		// Get Add Cart Sub Total
		WebElement getTotal = driver.findElement(By.xpath("//span[@class='a-price sw-subtotal-amount']"));
		String text = getTotal.getText();
		System.out.println("Subtotal of the Product is " + text);
		if (text.contains(firstProductPrice)) {
			System.out.println("Subtotal is correct ✅");
		} else {
			System.out.println("Subtotal is incorrect ❌");
		}
	}

}
