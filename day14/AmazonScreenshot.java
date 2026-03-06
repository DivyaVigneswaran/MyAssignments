package week5.day14;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AmazonScreenshot {

	public static void main(String[] args) throws IOException {
		// Launch Browser

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		ChromeDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Maximize the browser
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement scrollTo = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));

		Actions act = new Actions(driver);
		act.scrollToElement(scrollTo).perform();

		// To get the SCreenshot
		File screenshotAs = scrollTo.getScreenshotAs(OutputType.FILE);

		File target = new File("./data/Snap.png");
		FileUtils.copyFile(screenshotAs, target);

	}

}
