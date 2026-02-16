package week3.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Initialise CHrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Invoke the URL
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Wait
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Divya");
		driver.findElement(By.name("lastname")).sendKeys("Vicky");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("divyaseelan1994@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Summer$012025");
		
		WebElement findElement = driver.findElement(By.id("day"));
		Select dropdown = new Select(findElement);
		dropdown.selectByIndex(25);
		
		WebElement findElement2 = driver.findElement(By.id("month"));
		Select dropdown2 = new Select(findElement2);
		dropdown2.selectByIndex(5);
		
		WebElement findElement3 = driver.findElement(By.id("year"));
		Select dropdown3 = new Select(findElement3);
		dropdown3.selectByVisibleText("1994");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
	}

}
