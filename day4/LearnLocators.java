package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();

		// Maximise the window
		driver.manage().window().maximize();

		// Open the URL
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("divyaseelan@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Password123");
		driver.findElement(By.name("login")).click();
		driver.close();
		

	}

}
