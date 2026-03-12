package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	ChromeDriver driver;

	@Given("launch the browser")
	public void launch_the_browser() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
	}

	@Given("load the URL")
	public void load_the_url() {
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@When("enter the Username")
	public void enter_the_username() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	}

	@When("enter the Password")
	public void enter_the_password() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("it will navigate to the CRM\\/SFA page")
	public void it_will_navigate_to_the_crm_sfa_page() {
		String title = driver.getTitle();
		System.out.println(title);
	}

}
