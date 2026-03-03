package week5.day10;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFramesandAlerts {

	public static void main(String[] args) throws InterruptedException {

		// Launch Browser
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Launch the browser
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");

		// wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Switch to Frame
		driver.switchTo().frame("iframeResult");
		
		//Click Try It inside the Frame
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);

		//Switch to Alert
		Alert alert = driver.switchTo().alert();
		
		//Capture the Text in Alert
		String text = alert.getText();
		System.out.println(text);

		//Accept the Alert
		alert.accept();
		
		//Verify the text based on the action performed
		
		String message = driver.findElement(By.id("demo")).getText();
		if (message.contains("OK")) {
			System.out.println("Verification success");

		} else {
			System.out.println("Verification failed");
		}

	}

}
