package week5.day12;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) {

		// Launch Browser
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Launch the browser
		driver.get("https://www.leafground.com/window.xhtml");

		// wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// To print the current window
		String parentWIndow = driver.getWindowHandle();
		System.out.println(parentWIndow);

		// Click Open Button
		driver.findElement(By.xpath("//span[text()='Open']")).click();

		// Switching to CHild Window
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println(childWindow);

		// Convert Set To List
		List<String> currentlyactivewindow = new ArrayList<String>(childWindow);

		// Switch to Child Window
		driver.switchTo().window(currentlyactivewindow.get(1));

		// Get the Title of Child WIndow
		String childTitle = driver.getTitle();
		System.out.println(childTitle);

		driver.findElement(By.id("email")).sendKeys("Switched to Child Window");

		// Child WIndow CLose
		driver.close();

		// Try to print the Child Title afte the Child window is closed.
		// org.openqa.selenium.NoSuchWindowException happens
		String title = driver.getTitle();
		System.out.println(title);

	}

}
