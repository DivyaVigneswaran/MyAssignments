package week5.day14;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Launch URL
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.snapdeal.com/");

		// Goto Men's Fashion
		Thread.sleep(5000);
		WebElement menFashion = driver.findElement(By.xpath("(//div[@class='sc-98d0cbe0-1 boEVJj'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(menFashion).perform();

		// Sports Shoe
		WebElement SportsShoe = driver.findElement(By.xpath("//div[text()='Sports Shoes']"));
		act.moveToElement(SportsShoe).perform();
		SportsShoe.click();

		// WebElement CountOfShoes =
		String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Sports Shoes Count: " + count);

		// Click Training Shoes
		WebElement TrainingSHoes = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
		TrainingSHoes.click();

		// Click Sort BY
		driver.findElement(By.xpath("//span[@class='sort-label']")).click();

		// Click Low To High
		driver.findElement(By.xpath("(//ul[@class='sort-value']//li)[2]")).click();

		// Price Range
		WebElement PriceRange = driver.findElement(By.xpath("//div[@class='filter-inner']"));
		act.scrollToElement(PriceRange).perform();

		// Price Range From
		WebElement PriceRangeFrom = driver.findElement(By.xpath("//input[@name='fromVal']"));
		PriceRangeFrom.clear();
		PriceRangeFrom.sendKeys("300");
		// Price Range TO
		WebElement PriceRangeTo = driver.findElement(By.xpath("//input[@name='toVal']"));
		PriceRangeTo.clear();
		PriceRangeTo.sendKeys("1800");
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();

		// Select colour
		WebElement Color = driver.findElement(By.xpath("//span[contains(@class,'filter-color-tile')]"));
		act.scrollToElement(Color).perform();
		Color.click();
		
		//Mouse Over the First Result
		WebElement FirstResultShoe = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		act.moveToElement(FirstResultShoe).perform();
		
		//Click Quick VIew
        driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();

        //Print the Cost and Discount Price    
        WebElement DiscountPrice = driver.findElement(By.xpath("//div[@class='lfloat']/div[2]"));
        String Price = DiscountPrice.getText();
        System.out.println("Price and Discount of the Product is "+Price);
        
        //Screenshot
        File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File target = new File("./data/Snapdeal.png");
		FileUtils.copyFile(screenshotAs, target);
		
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
		
		driver.close();

	}

}
