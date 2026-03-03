package week5.day11;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesandAlertWithTextVerification {

	public static void main(String[] args) throws InterruptedException {
		// Launch Browser
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Launch the browser
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		//Switch to Frames
		driver.switchTo().frame("iframeResult");
		
		//Click Try It
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(3000);
		
		//Switch to Prompt Alert
		Alert alert = driver.switchTo().alert();
		
		//SendKeys in the Alert
		alert.sendKeys("Divya");
		
		//Accept the Alert
		alert.accept();
		
		String verifyText = driver.findElement(By.id("demo")).getText();
		if (verifyText.contains("Hello")) {
			System.out.println("Verification Passed");
			
		} else {
			System.out.println("Verification Failed");

		}

	}

}
