package week4.day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		// Launch Browser
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Launch the browser
		driver.get(" https://www.myntra.com/");

		// wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//input[@type='radio']/parent::label[1]")).click();
		driver.findElement(By.xpath("//input[@value='Laptop Bag']/ancestor::li")).click();
		String findElement = driver.findElement(By.xpath("//div[@class='title-container']")).getText();
		System.out.println("Total Number of Count is : " + findElement);
		
		List<WebElement> product = driver.findElements(By.className("product-brand"));
		//System.out.println("The list of Products listed are " + product);
		for (WebElement brand : product)
			System.out.println("The list of Products listed are " + brand.getText());
		
		List<WebElement> productname = driver.findElements(By.className("product-product"));
		for (WebElement name : productname)
			System.out.println("The Name of the product is " + name.getText());
		

	}

}
