package week5.day12;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingandInteraction {

	public static void main(String[] args) {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(opt);

		// Maximize the Window
		driver.manage().window().maximize();

		// Open the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");

		// Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Login
		driver.findElement(By.className("decorativeSubmit")).click();

		// CRMS/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Contact Button
		driver.findElement(By.linkText("Contacts")).click();

		// Merge Contact
		driver.findElement(By.linkText("Merge Contacts")).click();

		// Widget of From Contact
		driver.findElement(By.xpath("//td[span[text()='From Contact']]/following-sibling::td//a")).click();

		// Switch to Child WIndow
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println(childWindow);

		List<String> current = new ArrayList<String>(childWindow);
		System.out.println(current);

		// Switch to Child Window
		driver.switchTo().window(current.get(1));

		// Select the First Resulting Contact
		driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")).click();

		// Switch to Parent Window
		driver.switchTo().window(current.get(0));

		// Click on the widget of the "To Contact".
		driver.findElement(By.xpath("//td[span[text()='To Contact']]/following-sibling::td//a")).click();

		// Switch to Child Window
		childWindow = driver.getWindowHandles();
		current = new ArrayList<String>(childWindow);
		driver.switchTo().window(current.get(1));

		// Select the Second Resulting Contact
		driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[2]")).click();

		// Switch to Parent Window
		driver.switchTo().window(current.get(0));
		
		//Click Merge
		driver.findElement(By.linkText("Merge")).click();
		
		//Accept the Alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		String title = driver.getTitle();
		if (title.contains("View Contact | opentaps CRM")) {
			System.out.println("Verification Passed");
			
		} else {
			System.out.println("Verification Failed");

		}
		System.out.println(title);
	}

}
