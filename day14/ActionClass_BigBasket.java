package week5.day14;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_BigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Launch URL
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bigbasket.com/");
		
		//Click ShopBy Category
		WebElement shopByCategory = driver.findElement(By.xpath("(//div[@class='relative h-full'])[4]"));
		shopByCategory.click();
		
		//Click Food Oil Grains
		WebElement foodOilGrains = driver.findElement(By.xpath("(//a[contains(text(),'Foodgrains, Oil & Masala')])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(foodOilGrains).perform();
	
		//Click Rice Products
		WebElement riceProducts = driver.findElement(By.xpath("//a[contains(text(),'Rice & Rice Products')]"));
        act.moveToElement(riceProducts).perform();

		//Click Boiled Steam Rice
		WebElement boiledRice = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
		act.moveToElement(boiledRice).perform();
		boiledRice.click();
		
		//Filter Brand
		WebElement brandFilter = driver.findElement(By.xpath("//input[@id='i-bbRoyal']"));
		act.scrollToElement(brandFilter).perform();
		brandFilter.click();
		Thread.sleep(3000);
		
		//Click Tamil Ponni
		WebElement PonniRice =driver.findElement(By.xpath("//h3[contains(text(),'Tamil Ponni Boiled Rice')]"));
		PonniRice.click();
		
		//Switch To child Window
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println(childWindow);
		
		List<String> currentWindow = new ArrayList<String>(childWindow);
		
		driver.switchTo().window(currentWindow.get(1));
		
		//Select 5KG
		Thread.sleep(5000);
		WebElement Rice5KG = driver.findElement(By.xpath("(//div[@class='flex justify-start w-full h-full'])[5]"));
		Actions act1 = new Actions(driver);
		act1.scrollToElement(Rice5KG).perform();
		Rice5KG.click();
		
		//Print the Price
		WebElement RicePrice = driver.findElement(By.xpath("//td[@class='Description___StyledTd-sc-82a36a-0 hueIJn']"));
		Thread.sleep(3000);
		act1.scrollToElement(RicePrice).perform();
		String text = RicePrice.getText();
		System.out.println("Price of the Rice is " +text);
		
		//Add to cart
		driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
		WebElement verifyMessage = driver.findElement(By.xpath("//p[@class='mx-4 flex-1']"));
		String verify = verifyMessage.getText();
		System.out.println(verify);
		
		//Take Screenshot
		File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File target = new File("./data/Snap.png");
		FileUtils.copyFile(screenshotAs, target);
		
		driver.close();
		
		driver.switchTo().window(currentWindow.get(0));
		
		driver.close();


	}

}
