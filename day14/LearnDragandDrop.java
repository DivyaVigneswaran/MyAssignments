package week5.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnDragandDrop {

	public static void main(String[] args) {
		// Launch Browser

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		// Maximize the browser
		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/drag.xhtml");

		WebElement drag = driver.findElement(By.id("form:drag"));

		WebElement drop = driver.findElement(By.id("form:drop"));

		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
	}
}
