package week5.day14;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		// Launch Browser

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		// Maximize the browser
		driver.manage().window().maximize();

		driver.get("https://www.snapdeal.com");
		WebElement keysAction = driver.findElement(By.id("search-box-input"));

		keysAction.sendKeys("Books");

		// To get the SCreenshot
		File screenshotAs = keysAction.getScreenshotAs(OutputType.FILE);

		File target = new File("./data/Snap.png");
		FileUtils.copyFile(screenshotAs, target);

	}

}
