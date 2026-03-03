package week5.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		// Launch Browser
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Launch the browser
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(2);
		
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click")).click();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		String title = driver.getTitle();
		System.out.println(title);
	}

}
