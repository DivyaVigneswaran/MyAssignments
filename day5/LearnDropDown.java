package week3.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement dropdownElement = driver.findElement(By.className("ui-selectonemenu"));
		
		Select opt = new Select(dropdownElement);
		opt.selectByVisibleText("Selenium");
		opt.selectByIndex(3);
	}

}
