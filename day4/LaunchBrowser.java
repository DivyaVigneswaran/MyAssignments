package week2.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		// Maximise the window
		driver.manage().window().maximize();

		// Open the URL
		driver.get("https://www.facebook.com/");
		
		//Close
		driver.close();

	}

}
