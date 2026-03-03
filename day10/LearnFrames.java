package week5.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {

		// Launch Browser
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Launch the browser
		driver.get("https://www.leafground.com/frame.xhtml");

		// Switch to Frames
		// Index starts with 0
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
	}

}
