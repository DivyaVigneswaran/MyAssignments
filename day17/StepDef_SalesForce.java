package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_SalesForce {
	ChromeDriver driver;
	String name = "Divya";

	@Given("launch browser")
	public void launch_browser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=/Users/vigneswaranmurugesan/SeleniumProfile");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Given("open URL")
	public void open_url() {
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("divyaseelan1994.e8571c262657@agentforce.com");
		driver.findElement(By.id("password")).sendKeys("Summer$012025");
		driver.findElement(By.id("Login")).click();
	}

	@When("toggle")
	public void toggle() {
		WebDriverWait wait = new WebDriverWait((WebDriver) driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='App Launcher']"))).click();
	}

	@When("view all")
	public void view_all() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}

	@When("account tab")
	public void account_tab() {
		WebElement Account = driver.findElement(By.xpath("//a[@title='Accounts']"));
		driver.executeScript("arguments[0].click();", Account);
	}

	@When("click new")
	public void click_new() {
		driver.findElement(By.xpath("//div[@title='New']")).click();
	}

	@When("enter name")
	public void enter_name() {
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
	}

	@When("ownership")
	public void ownership() throws InterruptedException {
		Thread.sleep(3000);
		WebElement Ownership = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
    	driver.executeScript("arguments[0].click();", Ownership);
        driver.findElement(By.xpath("//span[text()='Public']")).click();
	}

	@When("click save")
	public void click_save() {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	@Then("verify name")
	public void verify_name() {
		String createdName = driver.findElement(By.xpath("//lightning-formatted-text")).getText();

        Assert.assertEquals(createdName, name);

        System.out.println("Account Created Successfully");

        driver.quit();
	}

}
