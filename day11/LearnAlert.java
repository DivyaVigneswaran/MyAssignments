package week5.day11;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {

		// Launch Browser
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Launch the browser
		driver.get("https://www.leafground.com/alert.xhtml");

		// wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Simple Alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();

		Alert alert1 = driver.switchTo().alert();

		// Print the textdisplayed in the Alert
		String alerttext = alert1.getText();
		System.out.println("Text from the Model - Simple Alert : " + alerttext);

		// Accept the ALert
		alert1.accept();

		// CLick on Confirmation Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();

		// Switch to ALert
		Alert alert2 = driver.switchTo().alert();

		String Alerttext2 = alert2.getText();
		System.out.println("Text from the Model - Confirmation Alert : " + Alerttext2);

		// Dismiss the Alert
		alert2.dismiss();

		// Prompt Alert

		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		// Switch to ALert
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(3000);
		
		// Send the values
		alert3.sendKeys("Divya S");
		
		//Accept the Alert
		alert3.accept();

		// SWEET ALERT

		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();

	}

}
