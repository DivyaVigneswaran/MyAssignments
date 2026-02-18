package week3.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebdriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");

		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		// Verify your Title
		if (title.contains("TestLeaf")) {
			System.out.println("It contains the value 'Check'");

		} else {
			System.out.println("It does not contain the value 'Check");
		}

		// CurrentURL

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//isDisplayed:
		boolean findElement = driver.findElement(By.className("smallSubmit")).isDisplayed();
		System.out.println(findElement);
		
		//IsEnabaled
		boolean enabled = driver.findElement(By.className("smallSubmit")).isEnabled();
		System.out.println(enabled);
		
		//isSelected
		boolean selected = driver.findElement(By.className("smallSubmit")).isSelected();
		System.out.println(selected);

		// getDOMAttribute
		//@Nullable
		//String domAttribute = driver.findElement(By.id("username")).getDomAttribute("id");
		//System.out.println(domAttribute);

		
	}

}
