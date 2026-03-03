package week5.day12;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");
		// Launch Browser
		ChromeDriver driver = new ChromeDriver(opt);

		// Maximize the browser
		driver.manage().window().maximize();

		// Launch the browser
		driver.get("https://www.irctc.co.in/nget/train-search");

		// wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();

		// Switching to CHild Window
		Set<String> childWindows = driver.getWindowHandles();
		System.out.println(childWindows);

		// Convert Set To List
		List<String> currentlyactivewindow = new ArrayList<String>(childWindows);

		// Switch to Child Window
		driver.switchTo().window(currentlyactivewindow.get(1));

		// Get the Title of Child WIndow
		String childTitle = driver.getTitle();
		System.out.println(childTitle);
		
		//Switch to Parent Window and Print the title
		driver.switchTo().window(currentlyactivewindow.get(0));
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		
		//Close the Parent Window
		driver.close();

	}

}
